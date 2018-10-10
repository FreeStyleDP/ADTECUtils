package com.adtec.VersionMng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.adtec.VersionMng.enums.OperateType;
import com.adtec.exception.BusinessException;
import com.adtec.util.FileUtil;

/**
 * 保存 VersionMng2 中 针对 pubOperateFileType specialOperateFileType 的处理方法
 * @time 2018年9月27日下午4:06:48
 * @author dengp_w
 *
 */
public class Create {
	/*
	 * 方法需求：
	 * 	将from的document信息复制到to中
	 */
	/**
	 * pubOperateFileType 中类型文件的处理方法
	 * @time 2018年9月27日 下午3:18:22
	 * @author dengp_w
	 * @param toFileName
	 * @param fromFileName
	 * @param versionList
	 */
	public static void createPubTypeFile(String toFileName, String fromFileName, VersionList versionList) {
		String attrName = getCompareAttr(toFileName);// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf("/")));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		if (!(new File(fromFileName)).exists()) {
			/*
			 * 遍历文件的 所有操作类型，如果都是 删除类型，可以不下载,否则 报错
			 */
			List<VersionOper> versionOpers = versionList.getVersionOpers();
			for (VersionOper versionOper : versionOpers) {
				if(!OperateType.DELETE.getName().equals(versionOper.getOperate())) {
					throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
				}
			}
			//任意读取文件，方便后续操作，又不影响，最终的删除
			try {
				from_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}else {
			try {
				from_document = saxReader.read(new File(fromFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}


		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
			to_rootEle.attribute("RecNum").setText("0");
		} else {
			try {
				to_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			to_rootEle = to_document.getRootElement();
		}

		List<Element> to_elements = to_rootEle.elements();
		List<Element> from_elements = from_rootEle.elements();

		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_rootEle);
		int total = Integer.valueOf(to_rootEle.attribute("RecNum").getText()) + count;
		to_rootEle.attribute("RecNum").setText(""+total);

		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 相较 pubOperateFileType 中 多了，节点内部节点的处理
	 * @time 2018年9月27日 下午3:18:22
	 * @author dengp_w
	 * @param toFileName
	 * @param fromFileName
	 * @param versionList
	 */
	public static void createFormat_xml(String toFileName, String fromFileName, VersionList versionList) {
//		String attrName = getCompareAttr(toFileName);// 节点属性名
		String attrName = "FmtName";// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf("/")));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		if (!(new File(fromFileName)).exists()) {
			/*
			 * 遍历文件的 所有操作类型，如果都是 删除类型，可以不下载,否则 报错
			 */
			List<VersionOper> versionOpers = versionList.getVersionOpers();
			for (VersionOper versionOper : versionOpers) {
				if(!OperateType.DELETE.getName().equals(versionOper.getOperate())) {
					throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
				}
			}
			//任意读取文件，方便后续操作，又不影响，最终的删除
			try {
				from_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}else {
			try {
				from_document = saxReader.read(new File(fromFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}
		
		
		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
			to_rootEle.attribute("RecNum").setText("0");
		} else {
			try {
				to_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			to_rootEle = to_document.getRootElement();
		}
		
		List<Element> to_elements = to_rootEle.elements();
		List<Element> from_elements = from_rootEle.elements();
		
		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_rootEle
				, "ItemType" ,"fmt" ,"SubName",false);
		int total = Integer.valueOf(to_rootEle.attribute("RecNum").getText()) + count;
		to_rootEle.attribute("RecNum").setText(""+total);
		
		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 相较 pubOperateFileType 中 多了，节点内部节点的处理
	 * @time 2018年9月27日 下午3:18:22
	 * @author dengp_w
	 * @param toFileName
	 * @param fromFileName
	 * @param versionList
	 */
	public static void createDataElement_xml(String toFileName, String fromFileName, VersionList versionList) {
//		String attrName = getCompareAttr(toFileName);// 节点属性名
		String attrName = "ElemName";// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf("/")));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		if (!(new File(fromFileName)).exists()) {
			/*
			 * 遍历文件的 所有操作类型，如果都是 删除类型，可以不下载,否则 报错
			 */
			List<VersionOper> versionOpers = versionList.getVersionOpers();
			for (VersionOper versionOper : versionOpers) {
				if(!OperateType.DELETE.getName().equals(versionOper.getOperate())) {
					throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
				}
			}
			//任意读取文件，方便后续操作，又不影响，最终的删除
			try {
				from_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}else {
			try {
				from_document = saxReader.read(new File(fromFileName));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		}
		
		
		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
			to_rootEle.attribute("RecNum").setText("0");
		} else {
			try {
				to_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			to_rootEle = to_document.getRootElement();
		}
		
		List<Element> to_elements = to_rootEle.elements();
		List<Element> from_elements = from_rootEle.elements();
		
		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_rootEle
				, "ItemType" ,"DataElem" ,"TypeName",false);
		int total = Integer.valueOf(to_rootEle.attribute("RecNum").getText()) + count;
		to_rootEle.attribute("RecNum").setText(""+total);
		
		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void createNetBankConf_xml(String toFileName, String fromFileName, VersionList versionList) {
		String attrName = "CODE";// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf("/")));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		if (!(new File(fromFileName)).exists()) {
			throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
		}
		
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		try {
			from_document = saxReader.read(new File(fromFileName));
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
//			to_rootEle.attribute("RecNum").setText("0");
		} else {
			try {
				to_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			to_rootEle = to_document.getRootElement();
		}
		
		List<Element> to_elements = to_rootEle.elements();
		List<Element> from_elements = from_rootEle.elements();
		
//		int count = 0 ;
		// 操作节点
		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_rootEle);

//		int total = Integer.valueOf(to_rootEle.attribute("RecNum").getText()) + count;
//		to_rootEle.attribute("RecNum").setText(""+total);
		
		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void createBean_xml(String toFileName, String fromFileName, VersionList versionList) {
		String attrName = "id";// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf("/")));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		if (!(new File(fromFileName)).exists()) {
			throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
		}
		
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		try {
			from_document = saxReader.read(new File(fromFileName));
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
//			to_rootEle.attribute("RecNum").setText("0");
		} else {
			try {
				to_document = saxReader.read(new File(toFileName));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			to_rootEle = to_document.getRootElement();
		}
		
		List<Element> to_elements = to_rootEle.elements();
		List<Element> from_elements = from_rootEle.elements();
		
		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_rootEle);
//		int total = Integer.valueOf(to_rootEle.attribute("RecNum").getText()) + count;
//		to_rootEle.attribute("RecNum").setText(""+total);
		
		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @time 2018年9月27日 下午4:46:24
	 * @author dengp_w
	 * @param versionList 版本清单对象
	 * @param from_elements 来源的 elemnt集合
	 * @param attrName
	 * @param to_elements 发往的 element集合
	 * @param toFileName 
	 * @param fromFileName
	 * @param isCreateToFile 是否新建了空白文件
	 * @param to_rootEle 需增加节点的 父节点
	 * @return 
	 */
	private static int dealNode(VersionList versionList, List<Element> from_elements, String attrName, 
			List<Element> to_elements, String toFileName, String fromFileName, boolean isCreateToFile, Element to_rootEle) {
		int count = 0 ;
		// 操作节点
		for (int i = 0; i < versionList.getVersionOpers().size(); i++) {
			
			VersionOper versionOper = versionList.getVersionOpers().get(i);
			if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
				boolean isAdd = false;
				for (Element to_element : to_elements) {//校验重复
					if (versionOper.getNode().equals(to_element.attribute(attrName).getText())) {
						throw new BusinessException("9999", "源文件【" + toFileName + "】中节点【"+versionOper.getNode()+"】已存在，不能进行【新增】操作");
					}
				}
				for (Element from_element : from_elements) {
					String nodeName = from_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.add((Element) from_element.clone());
						isAdd = true;
						count++;
						break;
					}
				}
				if(!isAdd) {
					throw new BusinessException("9999", "来源文件【" + fromFileName + "】中无节点【"+versionOper.getNode()+"】，不能进行【新增】操作");
				}
			} else if (OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
				if (isCreateToFile) {
					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【修改】操作");
				}
				boolean isRemove = false;
				for (Element to_element : to_elements) {
					String nodeName = to_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.remove(to_element);
						isRemove = true;
						break;
					}
				}
				if (!isRemove) {// 没有删除时
					throw new BusinessException("9999",
							"源文件【" + toFileName + "】不包含要修改的节点【" + versionOper.getNode() + "】");
				}
				for (Element from_element : from_elements) {
					String nodeName = from_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.add((Element) from_element.clone());
						break;
					}
				}
			} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
				if (isCreateToFile) {
					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【删除】操作");
				}
				boolean isRemove = false;
				for (Element to_element : to_elements) {
					String nodeName = to_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.remove(to_element);
						isRemove = true;
						count--;
						break;
					}
				}
				if (!isRemove) {// 没有删除时
					throw new BusinessException("9999",
							"源文件【" + toFileName + "】不包含要删除的节点【" + versionOper.getNode() + "】");
				}
			} else {
				throw new BusinessException("9999", "没有对应的处理方式【" + versionOper.getOperate() + "】");
			}
			
		}

		return count;
	}
	/**
	 * 此处理方式  会遍历节点的子节点是否为对象，如为对象，则递归处理
	 * @time 2018年9月27日 下午4:46:24
	 * @author dengp_w
	 * @param versionList 版本清单对象
	 * @param from_elements 来源的 elemnt集合
	 * @param attrName
	 * @param to_elements 发往的 element集合
	 * @param toFileName 
	 * @param fromFileName
	 * @param isCreateToFile 是否新建了空白文件
	 * @param to_rootEle 需增加节点的 父节点
	 * @param subObjFlag 判断子节点 是否为对象的标志
	 * @param subObjValue 判断子节点 是否为对象的值
	 * @param subAttrName 子节点的属性名
	 * @param isJudgeRemove 判断是否删除
	 * @return 
	 */
	private static int dealNode(VersionList versionList, List<Element> from_elements, String attrName, 
			List<Element> to_elements, String toFileName, String fromFileName, boolean isCreateToFile, Element to_rootEle
			, String subObjFlag, String subObjValue ,String subAttrName ,boolean isJudgeRemove) {
		int count = 0 ;
		int subCount = 0 ;
		Element nowFromElement = null;
		// 操作节点
		for (int i = 0; i < versionList.getVersionOpers().size(); i++) {
			
			VersionOper versionOper = versionList.getVersionOpers().get(i);
			if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
				boolean isAdd = false;
				for (Element to_element : to_elements) {//校验重复
					if (versionOper.getNode().equals(to_element.attribute(attrName).getText())) {
						throw new BusinessException("9999", "源文件【" + toFileName + "】中节点【"+versionOper.getNode()+"】已存在，不能进行【新增】操作");
					}
				}
				for (Element from_element : from_elements) {
					String nodeName = from_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.add((Element) from_element.clone());
						nowFromElement = from_element;
						isAdd = true;
						count++;
						break;
					}
				}
				if(!isAdd) {
					throw new BusinessException("9999", "来源文件【" + fromFileName + "】中无节点【"+versionOper.getNode()+"】，不能进行【新增】操作");
				}
			} else if (OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
				if (isCreateToFile) {
					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【修改】操作");
				}
				boolean isRemove = false;
				for (Element to_element : to_elements) {
					String nodeName = to_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.remove(to_element);
						isRemove = true;
						break;
					}
				}
				if (!isRemove && isJudgeRemove) {// 没有删除时
					throw new BusinessException("9999",
							"目标文件【" + toFileName + "】不包含要修改的节点【" + versionOper.getNode() + "】");
				}
				for (Element from_element : from_elements) {
					String nodeName = from_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.add((Element) from_element.clone());
						nowFromElement = from_element;
						if(!isRemove) {
							count++;
						}
						break;
					}
				}
			} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
				if (isCreateToFile) {
					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【删除】操作");
				}
				boolean isRemove = false;
				for (Element to_element : to_elements) {
					String nodeName = to_element.attribute(attrName).getText();// 节点名
					if (nodeName.equals(versionOper.getNode())) {
						to_rootEle.remove(to_element);
						isRemove = true;
						count--;
						break;
					}
				}
				if (!isRemove) {// 没有删除时
					throw new BusinessException("9999",
							"源文件【" + toFileName + "】不包含要删除的节点【" + versionOper.getNode() + "】");
				}
			} else {
				throw new BusinessException("9999", "没有对应的处理方式【" + versionOper.getOperate() + "】");
			}
			
			/*
			 * STEP:
			 * 新增  或 修改时 ，考虑处理子节点
			 */
			
			if(OperateType.ADD.getName().equals(versionOper.getOperate()) ||
					OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
				Element ItemTab_from = nowFromElement.element("ItemTab");
				List<Element> Items_from = ItemTab_from.elements();
				for (Element Item_from : Items_from) {
					if(subObjValue.equals(Item_from.attribute(subObjFlag).getText())) {//是对象时
						String subNodeName = Item_from.attribute(subAttrName).getText();
						VersionList versionList2 = new VersionList();
						VersionOper versionOper2 = new VersionOper(OperateType.UPDEAT.getName(), subNodeName);
						ArrayList<VersionOper> operList = new ArrayList<VersionOper>();
						operList.add(versionOper2);
						versionList2.setVersionOpers(operList);
						
						subCount += dealNode(versionList2, from_elements, attrName, to_elements, toFileName, fromFileName, false, to_rootEle
								, subObjFlag ,subObjValue ,subAttrName,isJudgeRemove);
					}
				}
			}
		}
		
		return count + subCount;
	}
	public static void createRoute_xml(String toFileName, String fromFileName, VersionList versionList) {
		String attrName = "RuleID";// 节点属性名
		File toFile = new File(toFileName);
		boolean isCreateToFile = false;
		if (!(toFile).exists()) {
			File toDir = new File(toFileName.substring(0, toFileName.lastIndexOf(File.separator)));
			if (!toDir.exists()) {
				toDir.mkdirs();
			}
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isCreateToFile = true;
		}
		if (!(new File(fromFileName)).exists()) {
			throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
		}
		
		SAXReader saxReader = new SAXReader();
		Document to_document = null;
		Document from_document = null;
		try {
			to_document = saxReader.read(new File(toFileName));
			from_document = saxReader.read(new File(fromFileName));
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		Element to_rootEle = null;
		Element from_rootEle = from_document.getRootElement();
		if (isCreateToFile) {// 新建文件时，创建基本结构
			to_document = (Document) from_document.clone();
			to_rootEle = to_document.getRootElement();
			List<Element> elements = to_rootEle.elements();
			for (Element ele : elements) {
				to_rootEle.remove(ele);
			}
			to_rootEle.attribute("RecNum").setText("0");
			;
		} else {
			to_rootEle = to_document.getRootElement();
		}
		
		List<Element> to_elements1 = to_rootEle.elements();
		List<Element> from_elements1 = from_rootEle.elements();
		
		List<Element> to_elements = to_elements1.get(0).elements();
		List<Element> from_elements = from_elements1.get(0).elements();
		
		int count = dealNode(versionList, from_elements, attrName, to_elements, toFileName, fromFileName, isCreateToFile, to_elements1.get(0));

//		int count = 0 ;
//		// 操作节点
//		for (int i = 0; i < versionList.getVersionOpers().size(); i++) {
//			
//			VersionOper versionOper = versionList.getVersionOpers().get(i);
//			if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
//				for (Element from_element : from_elements) {
//					String nodeName = from_element.attribute(attrName).getText();// 节点名
//					for (Element to_element : to_elements) {//校验重复
//						if (nodeName.equals(to_element.attribute(attrName).getText())) {
//							throw new BusinessException("9999", "源文件【" + toFileName + "】中节点【"+nodeName+"】已存在，不能进行【新增】操作");
//						}
//					}
//					if (nodeName.equals(versionOper.getNode())) {
//						to_elements1.get(0).add((Element) from_element.clone());
//						count++;
//						break;
//					}
//				}
//			} else if (OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
//				if (isCreateToFile) {
//					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【修改】操作");
//				}
//				boolean isRemove = false;
//				for (Element to_element : to_elements) {
//					String nodeName = to_element.attribute(attrName).getText();// 节点名
//					if (nodeName.equals(versionOper.getNode())) {
//						to_elements1.get(0).remove(to_element);
//						isRemove = true;
//						break;
//					}
//				}
//				if (!isRemove) {// 没有删除时
//					throw new BusinessException("9999",
//							"源文件【" + toFileName + "】不包含要修改的节点【" + versionOper.getNode() + "】");
//				}
//				for (Element from_element : from_elements) {
//					String nodeName = from_element.attribute(attrName).getText();// 节点名
//					if (nodeName.equals(versionOper.getNode())) {
//						to_elements1.get(0).add((Element) from_element.clone());
//						break;
//					}
//				}
//			} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
//				if (isCreateToFile) {
//					throw new BusinessException("9999", "源文件【" + toFileName + "】不存在，不能进行【删除】操作");
//				}
//				boolean isRemove = false;
//				for (Element to_element : to_elements) {
//					String nodeName = to_element.attribute(attrName).getText();// 节点名
//					if (nodeName.equals(versionOper.getNode())) {
//						to_elements1.get(0).remove(to_element);
//						isRemove = true;
//						count--;
//						break;
//					}
//				}
//				if (!isRemove) {// 没有删除时
//					throw new BusinessException("9999",
//							"源文件【" + toFileName + "】不包含要删除的节点【" + versionOper.getNode() + "】");
//				}
//			} else {
//				throw new BusinessException("9999", "没有对应的处理方式【" + versionOper.getOperate() + "】");
//			}
//		}
		int total = Integer.valueOf(to_elements1.get(0).attribute("RecNum").getText()) + count;
		to_elements1.get(0).attribute("RecNum").setText(""+total);
		
		OutputFormat format = OutputFormat.createPrettyPrint();// 创建文件输出的时候，自动缩进
		// 有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter;
		try {
			xmlWriter = new XMLWriter(new FileWriter(toFileName), format);
			xmlWriter.write(to_document);
			xmlWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void create_class(String toFileName, String fromFileName, VersionList versionList) {
		VersionOper versionOper = versionList.getVersionOpers().get(0);
		File toFile = new File(toFileName);
		File fromFile = new File(fromFileName);
		if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
//			if(toFile.exists()) {
//				toFile.delete();
//			}
			if(fromFile.exists()) {
				try {
					if(!FileUtil.copyFile(fromFileName, toFileName)) {
						throw new BusinessException("9999", "复制文件【" + fromFileName + "】失败");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
			}
		} else if (OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
//			if(toFile.exists()) {
//				toFile.delete();
//			}
			if(fromFile.exists()) {
				try {
					if(!FileUtil.copyFile(fromFileName, toFileName)) {
						throw new BusinessException("9999", "复制文件【" + fromFileName + "】失败");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
			}
		} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
			if(toFile.exists()) {
				toFile.delete();
			}else {
				throw new BusinessException("9999", "目的文件【" + fromFileName + "】不存在");
			}
		} else {
			throw new BusinessException("9999", "没有对应的处理方式【" + versionOper.getOperate() + "】");
		}
	}
	public static void createLogic(String toFileName, String fromFileName, VersionList versionList) {
//		String fileDir = versionList.getFileName();
		
		String toFileName1 = toFileName ;
		String fromFileName1 = fromFileName;
		for (VersionOper versionOper : versionList.getVersionOpers()) {
			
			toFileName = toFileName1 + File.separator + versionOper.getNode();
			fromFileName = fromFileName1 + File.separator + versionOper.getNode();
			File toFile = new File(toFileName);
			File fromFile = new File(fromFileName);
			if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
//			if(toFile.exists()) {
//				toFile.delete();
//			}
				if(fromFile.exists()) {
					try {
						if(!FileUtil.copyFile(fromFileName, toFileName)) {
							throw new BusinessException("9999", "复制文件【" + fromFileName + "】失败");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else {
					throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
				}
				
				//操作Logic.txt文件
				createLogicTxt(toFileName, versionOper);
			} else if (OperateType.UPDEAT.getName().equals(versionOper.getOperate())) {
//			if(toFile.exists()) {
//				toFile.delete();
//			}
				if(fromFile.exists()) {
					try {
						if(!FileUtil.copyFile(fromFileName, toFileName)) {
							throw new BusinessException("9999", "复制文件【" + fromFileName + "】失败");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else {
					throw new BusinessException("9999", "源文件【" + fromFileName + "】不存在");
				}
				
			} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
				if(toFile.exists()) {
					toFile.delete();
				}else {
					throw new BusinessException("9999", "目的文件【" + fromFileName + "】不存在");
				}
				
				//操作Logic.txt文件
				createLogicTxt(toFileName, versionOper);
			} else {
				throw new BusinessException("9999", "没有对应的处理方式【" + versionOper.getOperate() + "】");
			}
		}
		
	}
	
	/**
	 * 操作Logic.txt文件
	 * @time 2018年10月8日 上午10:20:02
	 * @author dengp_w
	 * @param toFileName
	 * @param versionOper
	 */
	public static void createLogicTxt(String toFileName, VersionOper versionOper) {
		String file = toFileName.replaceAll(versionOper.getNode(), "") +  "Logic.txt";
		if (OperateType.ADD.getName().equals(versionOper.getOperate())) {
			BufferedWriter out = null;   
	        try {   
	            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));   
	            out.write("\n" + versionOper.getNode().replaceAll(".xml", ""));   
	        } catch (Exception e) {   
	            e.printStackTrace();   
	        } finally {   
	            try {   
	            	if(out != null){
	            		out.close();   
	                }
	            } catch (IOException e) {   
	                e.printStackTrace();   
	            }   
	        }
		} else if (OperateType.DELETE.getName().equals(versionOper.getOperate())) {
			BufferedWriter out = null;
			BufferedReader in = null;
			File readFile = new File(file);
			File writeFile = new File(file+"_tmp");
			try {
				writeFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				in = new BufferedReader(new FileReader(readFile));
				out = new BufferedWriter(new FileWriter(writeFile));
				String readLine = null;
				while ((readLine = in.readLine())!=null) {
					if(readLine.startsWith(versionOper.getNode().replaceAll(".xml", ""))) {
						continue;
					}
					out.write(readLine+"\n");
				}
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(out != null) {
						out.close();
					}
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			readFile.delete();
			writeFile.renameTo(readFile);
		}
	}
	
	/**
	 * 获取用于比对的属性名
	 * 
	 * @time 2018年9月21日 上午9:50:17
	 * @author dengp_w
	 * @param srcPath
	 * @return
	 */
	private static String getCompareAttr(String srcPath) {
		for (int i = 0; i < VersionMng2.pubOperateFileType.length; i++) {
			if (srcPath.endsWith(VersionMng2.pubOperateFileType[i])) {
				return VersionMng2.pubOperateAtrrName[i];
			}
		}
		return null;
	}

}
