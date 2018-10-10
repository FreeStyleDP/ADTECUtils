package com.adtec.VersionMng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.core.io.ClassPathResource;

import com.adtec.VersionMng.enums.OperateType;
import com.adtec.exception.BusinessException;
import com.adtec.util.FileUtil;
import com.adtec.util.SftpClientUtils;
import com.adtec.util.StringUtil;
import com.adtec.util.TarUtils;
import com.adtec.util.entity.Ftp;


/**
 * 以版本清单为基础，直接从服务器上获取资源生产tar包
 * 
 * @time 2018年9月25日下午2:15:30
 * @author dengp_w
 *
 */
public class VersionMng2 {

	/**
	 * 生成版本的存放的路径
	 */
	public static String createVersionPath = System.getProperties().getProperty("user.home") + 
			File.separator + "files";
	/**
	 * 需要用公共处理方法操作的文件
	 */
	public static String[] pubOperateFileType = {  "Service.xml", "Enum.xml" };

	/**
	 * 公共操作文件的 从第二节 开始是，比对用的 属性名
	 */
	public static String[] pubOperateAtrrName = {  "Name", "EnumName" };
	/**
	 * 需要用特别方法处理的文件
	 */
	// public static String[] specialOperateFileType = {};
	public static String[] specialOperateFileType = { "Route.xml" , ".class" ,"NetBankConf.xml" ,"Bean.xml" ,"Logic","Format.xml", "DataElement.xml"};

	/**
	 * 远程文件路径前缀 及 用户路径
	 */
	public static String remotePre ;
	
	public static void main(String[] args) {
		// System.out.println(readEnvironmentConf("esb-106").getIpAddr());
		System.out.println("begin");
		createNewVersion(
				"D:\\dp_work\\4_other\\eclipseWorkspace\\ADTECUtils\\src\\main\\java\\com\\adtec\\VersionMng\\版本清单模板",
				"esb-106", "esb-107", "esb", "incremental");
	}

	/**
	 * 生成新版本
	 * 
	 * @time 2018年9月25日 下午2:23:48
	 * @author dengp_w
	 * @param versionListPath
	 *            版本清单文件路径
	 * @param toEnvironment
	 *            上送目标环境
	 * @param fromEnvironment
	 *            源文件来源环境
	 * @param serverType
	 *            服务器类型 综合前置 esb
	 * @param resultType
	 *            结果包类型 全量包：all 增量包：incremental
	 * @return 
	 */
	public static String createNewVersion(String versionListPath, String toEnvironment, String fromEnvironment,
			String serverType, String resultType) {
		// 创建缓存路径
		String fmt = "yyyyMMdd_HHmmss_SSS";
		Date date = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat(fmt);
		String now = simpledateformat.format(date);
		
		String tempPath = createVersionPath + File.separator + now + "temp";// 缓存路径
		File tempPathFile = new File(tempPath);
		if (!tempPathFile.exists()) {
			tempPathFile.mkdirs();
		}

		// 读取版本清单
		List<VersionList> versionLists = readVersionList(versionListPath);

		try {
			getFile(versionLists, toEnvironment, fromEnvironment, serverType, resultType, tempPath);
		}catch (BusinessException e) {
			throw new BusinessException(e.getErrorCode(), "下载文件失败："+e.getErrorMsg());
		}catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("9999", "下载文件失败："+e.getMessage());
		}
		
		createNewVersion(versionLists, tempPath, resultType);

		try {
			TarUtils.archiveDirAll(tempPath + File.separator +"to" ,createVersionPath + File.separator + now + ".tar" );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		FileUtil.deleteDir(tempPath);
		System.out.println("finish");
		return createVersionPath + File.separator + now + ".tar";
	}

	/**
	 * 创建新版本
	 * 
	 * @time 2018年9月26日 上午11:23:13
	 * @author dengp_w
	 * @param versionLists
	 * @param tempPath
	 * @param resultType
	 */
	private static void createNewVersion(List<VersionList> versionLists, String tempPath, String resultType) {
		/*
		 * 业务流程： 1. 遍历版本清单对象，根据 from文件内容，修改to的内容
		 */
		for (int i = 0; i < versionLists.size(); i++) {
			operateFile(tempPath, versionLists.get(i) , resultType);
		}
	}


	/**
	 * 操作生成单个文件
	 * 
	 * @time 2018年9月26日 上午11:34:16
	 * @author dengp_w
	 * @param tempPath
	 * @param versionList
	 */
	private static void operateFile(String tempPath, VersionList versionList, String resultType) {
		String fileName = versionList.getFileName();
		String fileNameTemp = fileName.replaceAll("all:", "");
		String toFileName = tempPath + File.separator + "to" + File.separator + fileNameTemp.substring(remotePre.length()-1);// 去除前面的 用户路径
		String fromFileName = tempPath + File.separator + "from" + File.separator + fileNameTemp.substring(remotePre.length()-1);// 去除前面的 用户路径
		String fileTyp = fileName.substring(fileName.lastIndexOf("/") + 1);

		if(fileName.replaceAll("：", ":").startsWith("all:")) {//处理全量  操作文件夹
			operateALl(toFileName, fromFileName, versionList, resultType);
		}else if (isNeedDealFile(toFileName , pubOperateFileType)) {// 需公共方法处理的文件
			Create.createPubTypeFile(toFileName, fromFileName, versionList);
		} else if (isNeedDealFile(toFileName , specialOperateFileType)) {// 需特殊处理的文件
			/*
			 * 此处用反射调用方法，若 specialOperateFileType 中新增文件类型，只需添加对应的  create****_**()方法即可
			 */
			String pre = "create";
			boolean isDeal = false;
			for (String fileType : specialOperateFileType) {
				String methodName = pre + fileType.replace(".","_");// 将点替换为A    方法名为 create****_**()
				
				if(fileName.endsWith("/")) {
					fileName = fileName.substring(0, fileName.length()-1);//去除最后 的  /符号
				}
				if (fileName.endsWith(fileType)) {

					// 反射调用对应文件的处理方法
					try {
						Method method3 = Create.class.getMethod(methodName, Class.forName("java.lang.String"),
								Class.forName("java.lang.String"), Class.forName("com.adtec.VersionMng.VersionList"));
						method3.invoke(null, toFileName, fromFileName, versionList);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
					} catch (SecurityException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					isDeal = true;
					break;
				}
			}
			if(!isDeal) {
				throw new BusinessException("9999", "文件【" + fileName + "】没有在"+
			Arrays.toString(specialOperateFileType)+"中找到对应的处理方法");
			}
		} else {
			throw new BusinessException("9999", "【" + fileName + "】文件尚设置对应的处理方法");
		}

	}



	/**
	 * 操作全量处理文件夹
	 * @time 2018年10月9日 下午5:01:32
	 * @author dengp_w
	 * @param toFileName
	 * @param fromFileName
	 * @param versionList
	 */
	private static void operateALl(String toFileName, String fromFileName, VersionList versionList, String resultType) {
		if(versionList.getVersionOpers().size() != 1) {
			throw new BusinessException("9999", "全量处理方式时，其对于的操作项有且只有一个，此文件中有【"+versionList.getVersionOpers().size()+"】个，请修改");
		}
		VersionOper versionOper = versionList.getVersionOpers().get(0);
		if(OperateType.DELETE.getName().equals(versionOper.getOperate()) && !resultType.equals("all")) {
			throw new BusinessException("9999", "全量处理方式时，【"+OperateType.DELETE.getName()+"】只能针对于打全量包时使用");
		}
		if(OperateType.UPDEAT.getName().equals(versionOper.getOperate()) ) {
			throw new BusinessException("9999", "全量处理方式时，不能使用【"+OperateType.UPDEAT.getName()+"】处理方式");
		}
		File toFile = new File(toFileName);
		File fromFile = new File(fromFileName);
		if(!fromFile.isDirectory()) {
			throw new BusinessException("9999", "全量处理方式时，只能处理文件夹");
		}
		
		try {
			FileUtils.copyDirectory(fromFile, toFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @time 2018年9月25日 下午4:15:20
	 * @author dengp_w
	 * @param versionLists
	 * @param toEnvironment
	 * @param fromEnvironment
	 * @param serverType
	 * @param resultType
	 * @param tempPath
	 * @throws Exception 
	 */
	private static void getFile(List<VersionList> versionLists, String toEnvironment, String fromEnvironment,
			String serverType, String resultType, String tempPath) throws Exception  {
		List<String> downFile = new ArrayList<String>();
		String fileName = null;
		Ftp toFtp = readEnvironmentConf(toEnvironment);
		Ftp fromFtp = readEnvironmentConf(fromEnvironment);
		SftpClientUtils to_client = new SftpClientUtils(toFtp.getIpAddr(), toFtp.getPort(), toFtp.getUserName(),toFtp.getPwd());
		SftpClientUtils from_client = new SftpClientUtils(fromFtp.getIpAddr(), fromFtp.getPort(), fromFtp.getUserName(),fromFtp.getPwd());
		to_client.connect();
		from_client.connect();
		
		for (int i = 0; i <versionLists.size() ; i++) {
			fileName = versionLists.get(i).getFileName().replaceAll("all:", "");
			if(fileName.contains("etc")) {
				remotePre = fileName.substring(0, fileName.indexOf("etc"));
				
			}else if(fileName.contains("src")) {
				remotePre = fileName.substring(0, fileName.indexOf("src"));
			}
			
			if(downFile.contains(fileName)) {//判断是否已经下载
				continue;
			}
			
			String regex = ".*\\..*";//以后缀 .*** 结尾 表示文件
			String relavtiveName = null;
			if(fileName.matches(regex)) {//文件
				relavtiveName = fileName.substring( remotePre.length(), fileName.lastIndexOf("/")+1);//相对路径名称 去除开头的用户路径    结尾的文件名
			}else{
				relavtiveName = fileName.substring( remotePre.length());//相对路径名称 去除开头的用户路径   
			}
			
			String toPath = tempPath + File.separator + "to" + File.separator + relavtiveName;
			String fromPath = tempPath + File.separator +"from" + File.separator + relavtiveName;
			
			
			
			if("incremental".equals(resultType) //增量版本时
					&& to_client.isExist(fileName)) {//如果不存在则创建新文件
				
				try {
					if(fileName.matches(regex)) {//下文件
						to_client.download(fileName.substring(0, fileName.lastIndexOf("/")), 
								fileName.substring( fileName.lastIndexOf("/")+1) , toPath);
					}else {//下文件夹
						to_client.downloadByDirectory(fileName, toPath);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
			
			if(!from_client.isExist(fileName)) {
				/*
				 * 遍历文件的 所有操作类型，如果都是 删除类型，可以不下载,否则 报错
				 */
				List<VersionOper> versionOpers = versionLists.get(i).getVersionOpers();
				for (VersionOper versionOper : versionOpers) {
					if(!OperateType.DELETE.getName().equals(versionOper.getOperate())) {
						throw new BusinessException("9999", "环境【"+fromFtp.getIpAddr()+"】文件【"+fileName+"】不存在");
					}
				}
				
				continue;
			}
			
			if(fileName.matches(regex)) {//下文件
				from_client.download(fileName.substring(0, fileName.lastIndexOf("/")), 
						fileName.substring( fileName.lastIndexOf("/")+1) , fromPath);
			}else {//下文件夹
				from_client.downloadByDirectory(fileName, fromPath);
			}
			downFile.add(fileName);
		}
		
		if("all".equals(resultType) ) {//全量版本时
			to_client.downloadByDirectory(remotePre+File.separator + "etc", tempPath + File.separator + "to" + File.separator  + "etc");
			to_client.downloadByDirectory(remotePre+File.separator + "src", tempPath + File.separator + "to" + File.separator+ "src" );
		}
		
		to_client.disconnect();
		from_client.disconnect();
		
	}

	/**
	 * 读取环境配置信息
	 * 
	 * @time 2018年9月26日 下午4:51:06
	 * @author dengp_w
	 * @param toEnvironment
	 * @return
	 */
	private static Ftp readEnvironmentConf(String toEnvironment) {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			
			try {
				document = saxReader.read(new ClassPathResource("/conf/envirmentConf.xml").getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
//			try {
//				document = saxReader.read((new ClassPathResource("conf/envirmentConf.xml")).getFile());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			Element rootE = document.getRootElement();
			List<Element> elements = rootE.elements();
			for (Element element : elements) {
				if (element.attribute("name").getText().equals(toEnvironment)) {
					Ftp ftp = new Ftp();
					ftp.setName(toEnvironment);
					ftp.setIpAddr(element.attribute("ipAddr").getText());
					ftp.setPort(Integer.valueOf(element.attribute("port").getText()));
					ftp.setUserName(element.attribute("userName").getText());
					ftp.setPwd(element.attribute("pwd").getText());
					return ftp;
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} 
		throw new BusinessException("9999", "没有找到环境【"+toEnvironment+"】的相关信息，请先配置环境");
	}

	/**
	 * 读取版本清单文件
	 * 
	 * @time 2018年9月25日 下午3:16:51
	 * @author dengp_w
	 * @param versionListPath
	 * @return
	 */
	private static List<VersionList> readVersionList(String versionListPath) {
		ArrayList<VersionList> versionLists = new ArrayList<VersionList>();
		BufferedReader br = null;
		String readLine = null;
		String fileName = null;
		VersionList versionList = null;
		List<VersionOper> versionOpers = null;
		try {
			br = new BufferedReader(new FileReader(versionListPath));
			while ((readLine = br.readLine()) != null) {
				if ("".equals(readLine) || readLine.startsWith("#")) {
					continue;
				} else if (isNeedDealFile(readLine.trim() , pubOperateFileType)
						|| isNeedDealFile(readLine.trim() , specialOperateFileType)
						|| readLine.trim().startsWith("all")//处理全量 文件夹操作
						) {
					if (versionList != null) {
						versionList.setVersionOpers(versionOpers);
						versionLists.add(versionList);
						versionList = new VersionList();
						versionOpers = new ArrayList<VersionOper>();
					} else {
						versionList = new VersionList();
						versionOpers = new ArrayList<VersionOper>();
					}
					fileName = readLine.trim();
					for (int i = 0; i < versionLists.size(); i++) {// 如果已经操作过此文件，则取出对象继续添加
						if (fileName.equals(versionLists.get(i).getFileName())) {
							versionOpers = versionLists.get(i).getVersionOpers();
							versionLists.remove(i);
						}
					}
					versionList.setFileName(fileName);
				} else if ( (readLine.contains(":") ||readLine.contains("：") )
						&& fileName != null) {
					readLine = readLine.trim().replace("：", ":");// 防止中英文符号干扰
					String[] split = readLine.split(":",-1);
					VersionOper versionOper = new VersionOper(split[0], split[1]);
					versionOpers.add(versionOper);
				} else {
					throw new BusinessException("9999", "文件中只能用3种格式行：1.为空；2.以"+Arrays.toString(pubOperateFileType) +"或"
				+Arrays.toString(specialOperateFileType)+"中之一结束；3.以'#'开始（此为注释）。请检查文件格式！");
				}
			}
			if (versionList != null) {
				versionList.setVersionOpers(versionOpers);
				versionLists.add(versionList);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new BusinessException("9999", "版本清单文件【" + versionListPath + "】未找到");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return versionLists;
	}

	
	/**
	 * 判断是否为需要处理的文件类型
	 * @time 2018年9月27日 下午3:16:00
	 * @author dengp_w
	 * @param str
	 * @return
	 */
	private static boolean isNeedDealFile(String str , String[] arr) {
		for (String string : arr) {
			if(str.endsWith("/")) {
				str = str.substring(0, str.length()-1);//去除最后 的  /符号
			}
			if(str.endsWith(string)) {
				return true;
			}
		}
		return false;
	}
}
