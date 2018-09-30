package com.adtec.VersionMng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.adtec.exception.BusinessException;

/**
 * 版本管理
 * @time 2018年9月20日下午2:22:43
 * @author dengp_w
 *
 */
public class VersionMng {
	
	/**
	 * 保存日志
	 */
	public static List<LogEntity> logList = null;
	
	/**
	 * 需要用公共处理方法操作的文件
	 */
	public static String[] pubOperateFileType = {"Format.xml","DataElement.xml","Service.xml","Enum.xml"};
	
	/**
	 * 公共操作文件的 从第二节 开始是，比对用的 属性名
	 */
	public static String[] pubOperateAtrrName = {"FmtName","ElemName","Name","EnumName"};
	/**
	 * 需要用特别方法处理的文件
	 */
//	public static String[] specialOperateFileType = {};
	public static String[] specialOperateFileType = {"Route.xml"};
	
	
	public static void main(String[] args) {
		String srcPath = "C:\\Users\\Administrator\\Desktop\\out\\NCPS1";
		String newVerPath = "C:\\Users\\Administrator\\Desktop\\out\\NCPS";
		String createPath = "C:\\Users\\Administrator\\Desktop\\out\\NCPS_new";
		String logPath = "C:\\Users\\Administrator\\Desktop\\out\\log";
		creatNewVersion(srcPath, newVerPath, createPath, logPath);
	}

	/**
	 * 创建新的版本
	 * @time 2018年9月20日 下午2:26:12
	 * @author dengp_w
	 */
	public static void creatNewVersion(String srcPath , String newVerPath , String createPath , String logPath) {
		System.out.println("支持公共文件类型为："+Arrays.toString(pubOperateFileType));
		System.out.println("支持特殊文件类型为："+Arrays.toString(specialOperateFileType)+ "\n");
		logList = new ArrayList<LogEntity>();
		check();
		/*
		 * 获取 源文件名list ：srcList
		 * 获取 需更新版本文件名list： newVerList （只有以operateFileType中文件名结束的文件）
		 */
		List<String> srcList = new ArrayList<String>();
		List<String> newVerList = new ArrayList<String>();
		getAllFileName(new File(srcPath) , srcList);
		getAllFileName(new File(newVerPath) , newVerList);
		for (int i = 0; i < newVerList.size(); i++) {
			boolean flag = false;
			for (int j = 0; j < pubOperateFileType.length; j++) {
				if(newVerList.get(i).endsWith(pubOperateFileType[j])) {
					flag = true;
					break;
				}
			}
			for (int j = 0; j < specialOperateFileType.length && flag == false; j++) {
				if(newVerList.get(i).endsWith(specialOperateFileType[j])) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				logList.add(new LogEntity(newVerList.get(i),  null ,"0"));
				System.out.println("未处理文件："+newVerList.get(i));
				newVerList.remove(i);
				i--;
			}
		}
		
		if((new File(createPath)).exists()) {
			System.out.println("创建文件夹【"+createPath+"】已存在，需清理");
			deleteDir(createPath);
		}
		
		/*
		 * 遍历newVerList 中的文件，并与srcList中文件对比 ，最终生成新文件
		 */
		for (int i = 0; i < newVerList.size(); i++) {
			String newVer_FilePath = newVerList.get(i);
			String relativePath = newVer_FilePath.substring(newVerPath.length());
			operateFile(srcPath,newVerPath,relativePath, createPath, logPath);
		}
		
		writeLogFile(logPath);
		
		System.out.println("finish!");
		
	}
	
	/**
	 * 写日志记录
	 * @time 2018年9月21日 下午3:21:52
	 * @author dengp_w
	 * @param logPath
	 */
	private static void writeLogFile(String logPath) {
		File logFile = new File(logPath);
		if(!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int count = 0 ;
		String titleLine = null;
		StringBuilder contentLine = null;
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(logPath));
			for (int i = 0; i < logList.size(); i++) {
				LogEntity log = logList.get(i);
				if(log.getNode() != null && !log.getNode().trim().isEmpty()) {
					count = 1;
					contentLine = new StringBuilder( "\t "+ log.getNode() + "\n");
				}
				for (int j = i + 1  ; j < logList.size(); j++) {
					LogEntity logSub = logList.get(j);
					if(Objects.equals(log.getFileName(), logSub.getFileName())  && 
							Objects.equals(log.getOperate(), logSub.getOperate()) ) {
						contentLine = contentLine.append( "\t "+ logSub.getNode() + "\n");
						count++;
						logList.remove(j);
						j--;
					}
				}
				titleLine = "文件：【"+ log.getFileName() + "】\t 操作类型：【"+LogEntity.getValueByKey(LogEntity.OPERATE_ENUM,
						log.getOperate())+"】\t记录数：【"+count+"】\n";
				bw.write(titleLine);
				if(contentLine != null) {
					bw.write(contentLine.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void check() {
		if(pubOperateAtrrName.length != pubOperateFileType.length) {
			throw new BusinessException("9999", "pubOperateAtrrName pubOperateFileType 两数组的长度必须一致，且位置匹配");
		}
	}

	/**
	 * 文件比对处理
	 * 包含：
	 * 		1. src 是否有newVerPath 对应文件，若无新增，记录明细日志
	 * 		2. 若两侧都有，比对内容，有复制，无增加，记录明细日志
	 * @time 2018年9月20日 下午3:38:52
	 * @author dengp_w
	 * @param srcPath
	 * @param newVerPath
	 * @param relativePath
	 * @param createPath
	 */
	private static void operateFile(String srcPath, String newVerPath, String relativePath ,String createPath ,String logPath) {
		System.out.println("处理文件："+newVerPath + relativePath);
		String srcFileName = srcPath + File.separator + relativePath;
		File srcFile = new File(srcFileName); 
//		if(srcFile.exists()) {//源库中存在此文件
			String fileTyp = srcFileName.substring(srcFileName.lastIndexOf(File.separator)+1);
			if(contains(pubOperateFileType,fileTyp)) {//需公共方法处理的文件
				createPubTypeFile(srcPath+relativePath , newVerPath+ relativePath , createPath + relativePath , logPath);
			}
			if(contains(specialOperateFileType,fileTyp)) {//需特殊处理的文件
				String pre = "create";
				for (String fileType : specialOperateFileType) {
					String methodName = pre+fileType.substring(0, fileType.length()-4);//除去".xml"  方法名为 create****()
					if(relativePath.endsWith(fileType)) {
						
						//反射调用对应文件的处理方法
						try {
							Method method3 = VersionMng.class.getMethod(methodName,Class.forName("java.lang.String"),
									Class.forName("java.lang.String"),Class.forName("java.lang.String"),
									Class.forName("java.lang.String"));
							method3.invoke(null,srcPath+relativePath , newVerPath+ relativePath , createPath + relativePath , logPath);
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (NoSuchMethodException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						break;
					}
				}
			}
//			
//		}else {
//			//TODO:复制 记录日志
//		}
		
	}

	/**
	 * 公共覆盖方法
	 * @time 2018年9月21日 上午10:22:04
	 * @author dengp_w
	 * @param srcPath
	 * @param newVerPath
	 * @param createPath
	 * @param logPath
	 */
	private static void createPubTypeFile(String srcPath, String newVerPath, String createPath, String logPath) {
		String attrName = getCompareAttr(srcPath);
		
		int count = 0 ;
		SAXReader saxReader = new SAXReader();
		Document src_document = null;
		Document new_document = null;
		File srcFile = new File(srcPath);
		try {
			new_document = saxReader.read(new File(newVerPath));
			if(srcFile.exists()) {
				src_document = saxReader.read(new File(srcPath ));
			}
		} catch (DocumentException e1) {
			e1.printStackTrace();
		} 
		
		Element new_root = new_document.getRootElement();
		
		List<Element> new_subEle = new_root.elements();
		Element src_root = null;
		System.out.println("\t fileName:"+newVerPath+"\n\t recNum:"+new_root.attributeValue("RecNum"));
		
		if(!srcFile.exists()) {
			src_document = new_document;
		}
		src_root = src_document.getRootElement();
		
		count =  copyNode(src_root, new_root, srcFile, attrName, newVerPath, count);
		
		
		//修改记录数
		int recNum = Integer.valueOf(src_root.attribute("RecNum").getText());
		src_root.attribute("RecNum").setText(""+recNum);
		
		
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			File createFile = new File(createPath);
			File createDir = new File(createPath.substring(0, createPath.lastIndexOf(File.separator)));
			mkDir(createDir);
			createFile.createNewFile();
			xmlWriter = new XMLWriter(new FileWriter(createPath),format);
			xmlWriter.write(src_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 拷贝节点
	 * @time 2018年9月21日 下午4:41:38
	 * @author dengp_w
	 * @param src_root
	 * @param new_root
	 * @param srcFile
	 * @param attrName
	 * @param newVerPath
	 * @param count
	 * @return
	 */
	private static int copyNode(Element src_root, Element new_root, File srcFile, String attrName, String newVerPath, int count) {
		List<Element> new_subEle = new_root.elements();
		
		if(!srcFile.exists()) {//文件不存在，全部都是新增
			//遍历获取日志
			for (Element new_element : new_subEle) {
				boolean haveChange = false; //是否修改
				String new_name = new_element.attribute(attrName).getText();
				logList.add(new LogEntity(newVerPath, new_name, "3"));
			}
		}else {
			List<Element> src_subEle = src_root.elements();
			
			for (Element new_element : new_subEle) {
				boolean haveChange = false; //是否修改
				String new_name = new_element.attribute(attrName).getText();
//				System.out.println("new_name:"+new_name);
				for (Element src_element : src_subEle) {
					String src_name = src_element.attribute(attrName).getText();
					if(src_name.equals(new_name)) {
						src_root.remove(src_element);
						src_root.add((Element) new_element.clone());
						haveChange = true;
						logList.add(new LogEntity(newVerPath, new_name, "1"));
						break;
					}
				}
				if(!haveChange) {//没有发生修改便是新增
					count++;
					src_root.add((Element) new_element.clone());
					logList.add(new LogEntity(newVerPath, new_name, "2"));
					System.out.println("文件："+newVerPath +"新增节点："+new_name);
				}
			}
		}
		return count;
	}

	public static void createRoute(String srcPath, String newVerPath, String createPath, String logPath) {
		
		String attrName = "RuleID";
		
		int count = 0 ;
		SAXReader saxReader = new SAXReader();
		Document src_document = null;
		Document new_document = null;
		File srcFile = new File(srcPath);
		try {
			new_document = saxReader.read(new File(newVerPath));
			if(srcFile.exists()) {
				src_document = saxReader.read(new File(srcPath ));
			}
			System.out.println("filePath:"+newVerPath);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		Element new_root = new_document.getRootElement().element("RuleTab");
		
		List<Element> new_subEle = new_root.elements();
		Element src_root = null;
		System.out.println("\t fileName:"+newVerPath+"\n\t recNum:"+new_root.attributeValue("RecNum"));
		
		if(!srcFile.exists()) {
			src_document = new_document;
		}
		src_root = src_document.getRootElement().element("RuleTab");
		
		count =  copyNode(src_root, new_root, srcFile, attrName, newVerPath, count);
		
		//修改记录数
		int recNum = Integer.valueOf(src_root.attribute("RecNum").getText());
		src_root.attribute("RecNum").setText(""+recNum);
		
		
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			File createFile = new File(createPath);
			File createDir = new File(createPath.substring(0, createPath.lastIndexOf(File.separator)));
			mkDir(createDir);
			createFile.createNewFile();
			xmlWriter = new XMLWriter(new FileWriter(createPath),format);
			xmlWriter.write(src_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
		
	/**
	 * 获取用于比对的属性名
	 * @time 2018年9月21日 上午9:50:17
	 * @author dengp_w
	 * @param srcPath
	 * @return
	 */
	private static String getCompareAttr(String srcPath) {
		for (int i = 0; i < pubOperateFileType.length; i++) {
			if(srcPath.endsWith(pubOperateFileType[i])) {
				return pubOperateAtrrName[i];
			}
		}
		return null;
	}

	/**
	 * 判断数组中是否包含  字符串
	 * @time 2018年9月21日 上午9:29:52
	 * @author dengp_w
	 * @param pubOperateFileType2
	 * @param fileType
	 * @return
	 */
	private static boolean contains(String[] pubOperateFileType2, String fileType) {
		for (String fileType1 : pubOperateFileType2) {
			if(fileType.equals(fileType1)) {
				return true;
			}
		}
		return false;
	}

	
	/**
	 * 获取文件下所有文件
	 * @time 2018年9月20日 下午2:43:38
	 * @author dengp_w
	 * @param f
	 * @param fileList
	 */
	public static void getAllFileName(File f , List<String> fileList){
        if(f!=null){
            if(f.isDirectory()){
                File[] fileArray=f.listFiles();
                if(fileArray!=null){
                    for (int i = 0; i < fileArray.length; i++) {
                        //递归调用
                    	getAllFileName(fileArray[i] ,fileList);
                    }
                }
            }
            else{
                fileList.add(f.getAbsolutePath());
            }
        }
    }
	
	
	  /**
	 * 删除文件夹下所用文件
	 * @time 2018年9月21日 上午10:27:08
	 * @author dengp_w
	 * @param path
	 * @return
	 */
	public static boolean deleteDir(String path)
	  {
	    String[] arrayOfString1;
	    File file = new File(path);
	    if (!(file.exists())) {
	      System.err.println("The dir are not exists!");
	      return false;
	    }

	    String[] content = file.list();
	    int j = (arrayOfString1 = content).length; for (int i = 0; i < j; ++i) { String name = arrayOfString1[i];
	      File temp = new File(path, name);
	      if (temp.isDirectory()) {
	        deleteDir(temp.getAbsolutePath());
	        temp.delete();
	      }
	      else if (!(temp.delete())) {
	        System.err.println("Failed to delete " + name);
	      }
	    }

	    file.delete();
	    System.out.println("清理文件夹：【"+ path + "】完成");
	    return true;
	  }
	
	public static void mkDir(File file) {  
        if (file.getParentFile().exists()) {  
            file.mkdir();  
        } else {  
            mkDir(file.getParentFile());  
            file.mkdir();    
        }  
    }  
  
}
