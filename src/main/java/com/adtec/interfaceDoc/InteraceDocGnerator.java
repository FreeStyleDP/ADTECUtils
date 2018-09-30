package com.adtec.interfaceDoc;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.ibatis.session.SqlSession;

import com.adtec.jfBuilder.dao.EstDatadictMapper;
import com.adtec.jfBuilder.dao.EstDtaMapper;
import com.adtec.jfBuilder.dao.EstElementItemMapper;
import com.adtec.jfBuilder.dao.EstElementMapper;
import com.adtec.jfBuilder.dao.EstFmtItemMapper;
import com.adtec.jfBuilder.dao.EstFormatMapper;
import com.adtec.jfBuilder.dao.EstProjectMapper;
import com.adtec.jfBuilder.dao.EstServiceMapper;
import com.adtec.jfBuilder.dao.EstSignItemMapper;
import com.adtec.jfBuilder.entity.EstDatadict;
import com.adtec.jfBuilder.entity.EstDta;
import com.adtec.jfBuilder.entity.EstElement;
import com.adtec.jfBuilder.entity.EstElementItem;
import com.adtec.jfBuilder.entity.EstFmtItem;
import com.adtec.jfBuilder.entity.EstFormat;
import com.adtec.jfBuilder.entity.EstProject;
import com.adtec.jfBuilder.entity.EstService;
import com.adtec.jfBuilder.entity.EstSignItem;
import com.adtec.exception.BusinessException;
import com.adtec.util.ExcelReaderUtil;
import com.adtec.util.MybatisUtil;
import com.adtec.util.StringUtil;

/**
 * 接口文档自动生成类
 * @author dengp_m  
 * @param <E>
 * @date 2018年8月26日 下午7:36:03 
 */
public class InteraceDocGnerator<E> {
	
	private EstProjectMapper estProjectMapper;
	private EstServiceMapper estServiceMapper;
	private EstFormatMapper estFormatMapper;
	private EstFmtItemMapper estFmtItemMapper;
	private EstElementMapper estElementMapper;
	private EstElementItemMapper estElementItemMapper;
	private EstDatadictMapper estDatadictMapper;
	private EstSignItemMapper estSignItemMapper;
	private EstDtaMapper estDtaMapper;
	
	/**
	 * 数据类型枚举
	 */
	public static String[] datadictType = {"s-String","i-int","l-log","b-bool","d-double","o-other"};
	public static String[] isMustChoice = {"Y-否","N-是"};//数据库的表示为  Y：允许为空值 N：不允许为空值
	
	
	{
		try {
//			SqlSession session = MybatisUtil.getSession("com.mysql.jdbc.Driver",
//					"jdbc:mysql://188.178.168.72:3306/jbuilder-zhqz20180820","root","root");//综合前置
			SqlSession session = MybatisUtil.getSession("com.mysql.jdbc.Driver",
					"jdbc:mysql://188.178.168.72:3306/jbuilder_esb_20180530","root","root");//esb
			
			estProjectMapper = session.getMapper(EstProjectMapper.class);
			estServiceMapper = session.getMapper(EstServiceMapper.class);
			estFormatMapper = session.getMapper(EstFormatMapper.class);
			estFmtItemMapper = session.getMapper(EstFmtItemMapper.class);
			estElementMapper = session.getMapper(EstElementMapper.class);
			estElementItemMapper = session.getMapper(EstElementItemMapper.class);
			estDatadictMapper = session.getMapper(EstDatadictMapper.class);
			estSignItemMapper = session.getMapper(EstSignItemMapper.class);
			estDtaMapper = session.getMapper(EstDtaMapper.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @time 2018年9月25日 上午11:03:49
	 * @author dengp_w
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InteraceDocGnerator interaceDocGnerator = new InteraceDocGnerator();
		initDataBase();
		String[] seviceName = {"ACCT_CLI|ZD0001"};
		String system = "NCPS";//综合前置
		String filePath = "C:\\Users\\Administrator\\Desktop\\InteraceDoc.txt";//生成文件地址
//		String[] isReadFile = {"tranCode" , "inOut", "packge" , "element","isMusChoice" ,"defaultVal" ,"eleDesc","type","length"};//通过文件读取必要的信息，数组中对应 需要读取的 列名 ，需要哪些 填哪些
		String[] isReadFile = {"isMusChoice" ,"defaultVal"};//通过文件读取必要的信息，数组中对应 需要读取的 列名 ，需要哪些 填哪些
		String readFilePath = "D:\\dp_work\\4_other\\eclipseWorkspace\\ADTECUtils\\src\\main\\java\\com\\adtec\\interfaceDoc\\readInfoFile.xlsx";//需要读取的文件名
		String srcFrom = "1";//源数据来自哪里  1：系统数据库  2：xml文件
//		String system = "NCPS";//企业服务总线(esb)
		//TODO:动态配置数据库
		try {
			interaceDocGnerator.generator(system, seviceName , filePath ,isReadFile , readFilePath ,srcFrom);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
	}
	
	/**
	 * 初始化数据库
	 * @time 2018年9月7日 下午4:55:06
	 * @author dengp_w
	 */
	private static void initDataBase() {
		
	}
	/**
	 * 自动生产方法
	 * @param projectName 所属项目    
	 * @param trans 交易码    
	 * @author dengp_m   
	 * @param filePath 
	 * @param readFilePath 
	 * @param isReadFile 
	 * @param srcFrom 
	 * @throws IOException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @date 2018年8月26日 下午7:38:20 
	 */
	public void generator(String projectName , String[] trans, String filePath, String[] isReadFile, String readFilePath, String srcFrom) throws IOException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		EstProject estProject = estProjectMapper.selectByProjectName(projectName);
		String projectId = estProject.getProjectId();//获取项目ID
		String pack = "";//最外层 层级
		ArrayList<InteraceDocObj> IDOList = null ;
		if ("1".equals(srcFrom)) {
			for (int i = 0; i < trans.length; i++) {
				//TODO:整个流程中加入项目id控制
				
				EstDta estDta = estDtaMapper.selectByDtaName(trans[i].split("\\|")[0]);
				EstService estService2 = new EstService();
				estService2.setSvcName(trans[i].split("\\|")[1]);
				estService2.setDtaId(estDta.getDtaId());
				EstService estService = estServiceMapper.selectByEstService(estService2);//服务信息
				
				EstFormat inEstFormat = estFormatMapper.selectByPrimaryKey(estService.getiFmt());//请求报文
				EstFormat outEstFormat = estFormatMapper.selectByPrimaryKey(estService.getoFmt());//相应报文
				
				IDOList = new ArrayList<InteraceDocObj>();
				getInteraceDocObjs(trans[i].split("\\|")[1] , "req" , inEstFormat ,IDOList ,pack);
				getInteraceDocObjs(trans[i].split("\\|")[1] , "res" , outEstFormat ,IDOList , pack);
			}
			
		}
		
		IDOList = readFromFile(isReadFile , readFilePath , IDOList , srcFrom );
		
		writeToFile( IDOList , filePath );
	}
	
	/**
	 * 从文件中读取部分 配置信息
	 * @time 2018年9月19日 下午6:55:23
	 * @author dengp_w
	 * @param isReadFile
	 * @param readFilePath
	 * @param iDOList
	 * @param srcFrom 
	 * @return
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	private ArrayList<InteraceDocObj> readFromFile(String[] isReadFile, String readFilePath, ArrayList<InteraceDocObj> iDOList, String srcFrom) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int[] localArr = new int[isReadFile.length];
		if (isReadFile.length <= 0 ) {
			return iDOList;
		}
		if(iDOList == null) {
			iDOList = new ArrayList<InteraceDocObj>();
		}
		List<List<String>> fileInfo = ExcelReaderUtil.readExcel(readFilePath);
		
		//遍历文件循环
		for (int i = 0; i < fileInfo.size(); i++) {
			List<String> rowList = fileInfo.get(i);
			
			//取第一行(标题),并记录位置
			if(i == 0) {
				int count = 0 ;
				for (int j = 0; j < isReadFile.length; j++) {
					for (int j2 = 0; j2 < rowList.size(); j2++) {
						if(isReadFile[j].equals(rowList.get(j2))) {
							localArr[count++] = j2;
							break;
						}
					}
				}
			}else {//内容
				String tranCode = rowList.get(0);
				String inOut = rowList.get(1);
				String packge = rowList.get(2);
				String element = rowList.get(3);
				if("2".equals(srcFrom)) {//从文件获取时
					InteraceDocObj IDO = new InteraceDocObj();
					for (int k = 0; k < isReadFile.length; k++) {
						Class clazz = InteraceDocObj.class;
						Field f = clazz.getDeclaredField(isReadFile[k]);
						f.setAccessible(true);
						f.set(IDO,rowList.get(localArr[k]));
					}
					iDOList.add(IDO);
				}else if("1".equals(srcFrom)) {//从数据库获取时
					for (int j = 0; j < iDOList.size(); j++) {
						InteraceDocObj IDO = iDOList.get(j);
						if(Objects.equals(tranCode, IDO.getTranCode()) &&
								Objects.equals(inOut, IDO.getInOut()) &&
								Objects.equals(packge, IDO.getPackge()) &&
								Objects.equals(element, IDO.getElement()) ) {
							//TODO:改为反射实现
							for (int k = 0; k < isReadFile.length; k++) {
								Class clazz = InteraceDocObj.class;
								Field f = clazz.getDeclaredField(isReadFile[k]);
								f.setAccessible(true);
								f.set(IDO,rowList.get(localArr[k]));
//								if("isMusChoice".equals(isReadFile[k])) {
//									IDO.setIsMusChoice(rowList.get(localArr[k]));
//								}
//								if("defaultVal".equals(isReadFile[k])) {
//									IDO.setDefaultVal(rowList.get(localArr[k]));
//								}
							}
							iDOList.set(j, IDO);
							break;
						}
					}
				}
			}
			
		}
		
		return iDOList;
	}

	/**
	 * 根据 IDOList 生成对应格式文本文件
	 * @time 2018年9月6日 下午2:13:54
	 * @author dengp_w
	 * @param IDOList
	 * @param toFileName
	 */
	private void writeToFile(List<InteraceDocObj> IDOList , String toFileName) {
		BufferedWriter bw = null;
		String line = "";
		String sp = "|";//分隔符
		String sp1 = " - ";//分隔符
		String lastPack = "";//上一个层级
		String packAdd = "";//叠加后层级关系
		try {
			 bw = new BufferedWriter(new FileWriter(toFileName));
			 System.out.println(IDOList.size());
			 String lastTranCode = "";
			 String lastInOut = "";
			 for (int i = 0; i < IDOList.size(); i++) {
				 InteraceDocObj IDO = IDOList.get(i);
				 
//				 写头  交易码 + 输入输出
				 if(!lastTranCode.equals(IDO.getTranCode()) || !lastInOut.equals(IDO.getInOut())){
					 line += (IDO.getTranCode() + "\t");
					 line += (IDO.getInOut()+ "\n");
					 lastTranCode = IDO.getTranCode();
					 lastInOut = IDO.getInOut();
					 
//					 lastPack = "";
//					 packAdd ="";
				 }
//				 拼接层级关系
				 if(!Objects.equals(lastPack , IDO.getPackge())) {
					 packAdd = "";
					 String fatherPack = IDO.getElement();//父节点	
					 for (int j = i; j >= 0; j--) {
						 InteraceDocObj IDO1 = IDOList.get(j);
						 if( Objects.equals(fatherPack, IDO1.getElement()) && 
								 (  null != IDO1.getPackge() && !"".equals(IDO1.getPackge()) ) ) {// ""为最外层层级，此处跳过
							 packAdd = IDO1.getPackge() + sp1 + packAdd;
							 fatherPack = IDO1.getPackge();
						 }
					 }
					 
//					 头部添加分隔符
//					 if(!"".equals(packAdd) &&  !packAdd.startsWith(sp1)) {
//						 packAdd = sp1 + packAdd;
//					 }
				 }
				 
				 
				 line += sp;
				 line += (switchValue(packAdd +IDO.getElement()) + sp);
				 line += (switchValue(StringUtil.getValueByKey(isMustChoice, IDO.getIsMusChoice())) + sp);
				 line += (switchValue(StringUtil.getValueByKey(datadictType, IDO.getType()) )+ sp);
				 line += (switchValue(IDO.getLength()) + sp);
				 line += (switchValue(IDO.getEleDesc() )+ sp );
				 line += (switchValue(IDO.getDefaultVal()) + sp);
				 line += ("\n");
				 bw.write(line);
				 
				 lastPack = IDO.getPackge();
				 line = "";
			 }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 获取接口对象
	 * 	 分标记报文  非标记报文情况
	 * @time 2018年8月30日 下午1:01:54
	 * @author dengp_w
	 * @param tranCode 交易码
	 * @param type 请求相应类型 req res
	 * @param estFormat 报文对象
	 * @param pack 层级关系
	 * @return
	 */
	private void getInteraceDocObjs(String tranCode, String type, EstFormat estFormat ,
			ArrayList<InteraceDocObj> IDOList , String pack) {
		
		String elemName = estFormat.getElemName();//element id
		
		String signName = estFormat.getSignName();//获取标记集 名称
		String projectId = estFormat.getProjectId();//项目ID
		
		EstElement estElement = estElementMapper.selectByPrimaryKey(elemName);//根报文对应的数据对象
		
		List<EstFmtItem> fmtItemList = estFmtItemMapper.selectByFmtId(estFormat.getFmtId());//根报文 Item
		System.out.println("报文【"+estFormat.getFmtName()+"】记录数【"+fmtItemList.size()+"】");
		
		String fmtType = estFormat.getFmtType();
		if("J".equals(fmtType) || "X".equals(fmtType) ) {//非标记报文
			for (int i = 0; i < fmtItemList.size(); i++) {
				EstFmtItem estFmtItem = fmtItemList.get(i);
				InteraceDocObj IDO = new InteraceDocObj();
				if("I".equals(estFmtItem.getItemType() )) {//不为format
					EstElementItem estElementItem = estElementItemMapper.selectByPrimaryKey(estFmtItem.getElemId());
					EstDatadict estDatadict = estDatadictMapper.selectByPrimaryKey(estElementItem.getDataName());
					IDO.setTranCode(tranCode);
					IDO.setInOut(type);
					IDO.setPackge(pack);
					IDO.setElement(estElementItem.getItemName());
					IDO.setIsMusChoice(estFmtItem.getNotNull());
					IDO.setType(estDatadict.getDataType());
					IDO.setLength(String.valueOf(estDatadict.getDataMaxlen()));
					IDO.setEleDesc(estElementItem.getItemDesc());
					IDO.setDefaultVal("&nbsp;");
					IDOList.add(IDO);
				}else{//为format时
					EstFormat estFormat2 = estFormatMapper.selectByPrimaryKey(estFmtItem.getSubName());
					EstElementItem estElementItem = estElementItemMapper.selectByPrimaryKey(estFmtItem.getSubElemId());
					EstElement estElement1 = estElementMapper.selectByPrimaryKey(estElementItem.getElemId());
					IDO.setTranCode(tranCode);
					IDO.setInOut(type);
					IDO.setPackge(pack);
					IDO.setElement(estElementItem.getItemName());
					IDO.setIsMusChoice(estFmtItem.getNotNull());
					IDO.setType("object");
					IDO.setLength("&nbsp;");
					IDO.setEleDesc(estElementItem.getItemDesc());
					IDO.setDefaultVal("&nbsp;");
					IDOList.add(IDO);
					getInteraceDocObjs(tranCode,type,estFormat2 , IDOList ,estElementItem.getItemName());
				}
			}
		} else {//标记报文
			EstFormat estFormat2 = new EstFormat();
			estFormat2.setFmtName(signName);
			estFormat2.setProjectId(projectId);
			EstFormat estFormat3 = estFormatMapper.selectByEstFormat(estFormat2);
			String fmtId = estFormat3.getFmtId();
			List<EstSignItem> estSignItemLis = estSignItemMapper.selectByFmtId(fmtId);
			for (int i = 0; i < fmtItemList.size(); i++) {
				EstFmtItem estFmtItem = fmtItemList.get(i);
				InteraceDocObj IDO = new InteraceDocObj();
//				if("I".equals(estFmtItem.getItemType() )) {//不为format
					String itemSignName = estFmtItem.getItemSignName();
					boolean flag = false;
					EstSignItem estSignItem1 = null;
					for (EstSignItem estSignItem : estSignItemLis) {
						if(itemSignName.equals(estSignItem.getItemSignName())) {
							estSignItem1 = estSignItem;
							flag = true ;
							break;
						}
					}
					
					if( !flag ) {
						throw new BusinessException("9999", "未找到对应的标签");
					}
					
					EstElementItem estElementItem = estElementItemMapper.selectByPrimaryKey(estSignItem1.getElemId());
					EstDatadict estDatadict = estDatadictMapper.selectByPrimaryKey(estElementItem.getDataName());
					IDO.setTranCode(tranCode);
					IDO.setInOut(type);
					IDO.setPackge(pack);
					IDO.setElement(estElementItem.getItemName());
					IDO.setIsMusChoice(estFmtItem.getNotNull());
					IDO.setType(estDatadict.getDataType());
					IDO.setLength(String.valueOf(estDatadict.getDataMaxlen()));
					IDO.setEleDesc(estElementItem.getItemDesc());
					IDO.setDefaultVal("&nbsp;");
					IDOList.add(IDO);
//				}else{//为format时
//					EstFormat estFormat2 = estFormatMapper.selectByPrimaryKey(estFmtItem.getSubName());
//					EstElementItem estElementItem = estElementItemMapper.selectByPrimaryKey(estFmtItem.getSubElemId());
//					EstElement estElement1 = estElementMapper.selectByPrimaryKey(estElementItem.getElemId());
//					IDO.setTranCode(tranCode);
//					IDO.setInOut(type);
//					IDO.setPackge(pack);
//					IDO.setElement(estElementItem.getItemName());
//					IDO.setIsMusChoice(estFmtItem.getNotNull());
//					IDO.setType("object");
//					IDO.setLength("&nbsp;");
//					IDO.setEleDesc(estElementItem.getItemDesc());
//					IDO.setDefaultVal("&nbsp;");
//					IDOList.add(IDO);
//					getInteraceDocObjs(tranCode,type,estFormat2 , IDOList ,estElementItem.getItemName());
//				}
			}
			
		}
	}
	
	public  static String switchValue(String val) {
		val = (val == null || val.trim().isEmpty() )? "&nbsp;" : val ;
		val = val.replaceAll("\n", "<br>");
		return val ;
	}
	
	
}
