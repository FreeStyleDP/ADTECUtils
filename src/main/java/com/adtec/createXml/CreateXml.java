package com.adtec.createXml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.adtec.createXml.enums.ItemTypeEnum;
import com.adtec.exception.BusinessException;
import com.adtec.starring.struct.dataelem.DataElemItem;
import com.adtec.starring.struct.dataelem.DataElement;
import com.adtec.util.ExcelReaderUtil;

/**
 * 创建 jfBuilder所需的xml文件，主要是DataElement Format DataDict
 * @time 2018年10月11日下午2:07:40
 * @author dengp_w
 *
 */
public class CreateXml {
	
	public final static String DATAELEMENT_NAME ="DataElement.xml";
	public final static String FORMAT_NAME ="Fomat.xml";
	public final static int TITLE_LINE = 7;
	private static String NodeClassName = null;
	private static String NodeClassDesc = null;
	
	public static void main(String[] args) {
		CreateXml createXml = new CreateXml();
		createXml.createXml("D:\\dp_work\\4_other\\eclipseWorkspace\\ADTECUtils\\src\\main\\java\\com\\adtec\\createXml\\DataElement.xlsx",
				"D:\\dp_work\\4_other\\eclipseWorkspace\\ADTECUtils\\src\\main\\java\\com\\adtec\\createXml\\");
	}

	public void createXml(String filePathName, String destPath) {
		System.out.println("begin!");
		List<DataElement> dataElements= null;
		try {
			dataElements = readFile(filePathName );
			writeToXml(destPath, dataElements);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish!");
	}
	
	private List<DataElement> readFile(String filePathName) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		ArrayList<DataElement> dataElements = new ArrayList<DataElement>();
		DataElement dataElement =null;
		DataElemItem dataElemItem =null;
		List<String> titles = null;
		boolean isSet = false;
		List<List<String>> fileInfo = ExcelReaderUtil.readExcel(filePathName);
		for (int i = 0; i < fileInfo.size(); i++) {
			List<String> rowList = fileInfo.get(i);
			if(i<TITLE_LINE) {//公共部分
				if(i == 2) {
					NodeClassName = rowList.get(1);
					NodeClassDesc = rowList.get(2);
				}
			}else if(i==TITLE_LINE) { //标题
				titles = rowList ;
			}else if(i>TITLE_LINE) {//内容
				boolean isNewDataElement = false;
				String ElemName = null;
				int col = -1;
				for (int j = 0; j < titles.size(); j++) {
					if(titles.get(j).equals("elementName")) {
						ElemName = rowList.get(j);
						col = j;
						break;
					}
				}
				if(ElemName == null || ElemName.trim().isEmpty()) {
					throw new BusinessException("9999", "第【"+i+"】行【"+col+"】列，数据【"+rowList.get(col)+"】不能为空");
				}
				if(dataElements.size() > 0 && 
						dataElement.getElementName().equals(ElemName)) {
					isNewDataElement =false;
				}else {
					isNewDataElement =true;
					dataElement = new DataElement();
				}
				dataElemItem = new DataElemItem();
				
				
				for (int j = 0; j < titles.size(); j++) {
					 Class DataElement = DataElement.class;
					 Field[] f_DataElement = DataElement.getDeclaredFields();
					 for (int k = 0;isNewDataElement && k < f_DataElement.length; k++) {
						if(f_DataElement[k].getName().equals(titles.get(j))) {
							f_DataElement[k].setAccessible(true);
							f_DataElement[k].set(dataElement , rowList.get(j));
							isSet = true ;
							break;
						}
					}
					 Class DataElemItem = DataElemItem.class;
					 Field[] f_DataElemItem = DataElemItem.getDeclaredFields();
					 for (int k = 0; k < f_DataElemItem.length; k++) {
						 if(f_DataElemItem[k].getName().equals(titles.get(j))) {
							 f_DataElemItem[k].setAccessible(true);
							 Class<?> type = f_DataElemItem[k].getType();
							 if(String.class.isAssignableFrom(type)) {
								 f_DataElemItem[k].set(dataElemItem , String.valueOf(rowList.get(j)));
							 }else if(int.class.isAssignableFrom(type) || Integer.class.isAssignableFrom(type)) {
								 f_DataElemItem[k].set(dataElemItem , Integer.valueOf(rowList.get(j)));
							 }else {
								 f_DataElemItem[k].set(dataElemItem , rowList.get(j));
							 }
							 isSet = true ;
							 break;
						 }
					 }
					 if(!isSet) {
						 throw new BusinessException("9999", "域【"+titles.get(j)+"】不属于DataElement.xml 或 DataElemItem.xml,请检查！");
					 }
				}
				
				if(isNewDataElement) {
					dataElement.addDataElemItem(dataElemItem.getItemName(), dataElemItem);
					dataElement.setName(dataElemItem.getItemName());
					dataElements.add(dataElement);
				}else {
					dataElements.get(dataElements.size()-1).addDataElemItem(dataElemItem.getItemName(), dataElemItem);
					dataElements.get(dataElements.size()-1).setName(dataElemItem.getItemName());
				}
				
			}
		}
		return dataElements;
	}
	
	private void setDefaultValue(){
		
	}
	
	private void writeToXml(String destPath , List<DataElement> dataElements) throws IOException{
		File dataElementFile = new File(destPath+"/"+DATAELEMENT_NAME);
		File formatFile = new File(destPath+"/"+FORMAT_NAME);
		
		if(NodeClassName == null || NodeClassDesc == null) {
			throw new BusinessException("9999", "NodeClassName 或 NodeClassDesc 不能为空");
		}
		writeDataElement(dataElements, dataElementFile);
//		writeFormat(dataElements, formatFile);

		
	}
	
	private void writeFormat(List<DataElement> dataElements, File formatFile) throws IOException {
//		写xml
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(formatFile),format);
		
		Document document = DocumentHelper.createDocument();   
		Element root = document.addElement("DataElementTab");// 创建根节点
		root.attributeValue("RecNum", ""+dataElements.size());
		
		for (DataElement dataElement_src : dataElements) {
			
			Element dataElement_dest = root.addElement("DataElement");
			dataElement_dest.addAttribute("DataType", "Struct");
			dataElement_dest.addAttribute("ElemName", dataElement_src.getElementName());
			dataElement_dest.addAttribute("ElemDesc", dataElement_src.getElementDesc());
			dataElement_dest.addAttribute("NodeClassName", NodeClassName);
			dataElement_dest.addAttribute("NodeClassDesc", NodeClassDesc);
			dataElement_dest.addAttribute("XmlNodeName", dataElement_src.getXmlNodeName());
			
			ConcurrentHashMap<String, DataElemItem> itemList = dataElement_src.getItemList();
			ArrayList<String> nameList = dataElement_src.getNameList();
			Element itemTab_dest = dataElement_dest.addElement("ItemTab");
			itemTab_dest.attributeValue("RecNum", ""+ nameList.size());
			
			for (String name : nameList) {
				DataElemItem dataElemItem = itemList.get(name);
				Element item_dest = itemTab_dest.addElement("Item");
				item_dest.addAttribute("ItemName", dataElemItem.getItemName());
				item_dest.addAttribute("ItemDesc", dataElemItem.getItemDesc());
				item_dest.addAttribute("ItemType", ItemTypeEnum.getName(dataElemItem.getItemType()));
				item_dest.addAttribute("TypeName", dataElemItem.getTypeName());
				item_dest.addAttribute("ItemDeft", "");
				item_dest.addAttribute("ElemType", "No");
				item_dest.addAttribute("NodeType", "Node");
				item_dest.addAttribute("Security", "No");
				item_dest.addAttribute("EnumName", "");
				item_dest.addAttribute("EnumKvp", "");
				item_dest.addAttribute("RelateItemName", "");
				Element scopeExpr = item_dest.addElement("ScopeExpr");
				scopeExpr.addCDATA("");
			}
		}
		
		
		xmlWriter.write(document);
		xmlWriter.close();
		
	}

	private void writeDataElement(List<DataElement> dataElements, File dataElementFile) throws IOException {
//		写xml
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(dataElementFile),format);
		
		Document document = DocumentHelper.createDocument();   
		Element root = document.addElement("DataElementTab");// 创建根节点
		root.addAttribute("RecNum", ""+dataElements.size());
		
		for (DataElement dataElement_src : dataElements) {
			
			Element dataElement_dest = root.addElement("DataElement");
			dataElement_dest.addAttribute("DataType", "Struct");
			dataElement_dest.addAttribute("ElemName", dataElement_src.getElementName());
			dataElement_dest.addAttribute("ElemDesc", dataElement_src.getElementDesc());
			dataElement_dest.addAttribute("NodeClassName", NodeClassName);
			dataElement_dest.addAttribute("NodeClassDesc", NodeClassDesc);
			dataElement_dest.addAttribute("XmlNodeName", dataElement_src.getXmlNodeName());
			
			ConcurrentHashMap<String, DataElemItem> itemList = dataElement_src.getItemList();
			ArrayList<String> nameList = dataElement_src.getNameList();
			Element itemTab_dest = dataElement_dest.addElement("ItemTab");
			itemTab_dest.addAttribute("RecNum", ""+ nameList.size());
			
			for (String name : nameList) {
				DataElemItem dataElemItem = itemList.get(name);
				Element item_dest = itemTab_dest.addElement("Item");
				item_dest.addAttribute("ItemName", dataElemItem.getItemName());
				item_dest.addAttribute("ItemDesc", dataElemItem.getItemDesc());
				item_dest.addAttribute("ItemType", ItemTypeEnum.getName(dataElemItem.getItemType()));
				item_dest.addAttribute("TypeName", dataElemItem.getTypeName());
				item_dest.addAttribute("ItemDeft", "");
				item_dest.addAttribute("ElemType", "No");
				item_dest.addAttribute("NodeType", "Node");
				item_dest.addAttribute("Security", "No");
				item_dest.addAttribute("EnumName", "");
				item_dest.addAttribute("EnumKvp", "");
				item_dest.addAttribute("RelateItemName", "");
				Element scopeExpr = item_dest.addElement("ScopeExpr");
				scopeExpr.addCDATA("");
			}
		}
		
		
		xmlWriter.write(document);
		xmlWriter.close();
		
	}

	public String upperCase(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
