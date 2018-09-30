package com.adtec.dataElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.adtec.dataElement.entity.DataElement;
import com.adtec.dataElement.entity.DataElementTab;
import com.adtec.dataElement.entity.Item;

/**
 * DataElement的相关操作
 * @time 2018年8月21日下午12:46:44
 * @author dengp_w
 *
 */
public class DataElementAct {
	
	private static final String FILE_NAME = "DataElement.xml";
	
	public static void main(String[] args) throws IOException {
		String filePath = "";
		DataElementTab dataElementTab = readDataElementFile(filePath);
		String filePathXML = writeDataElementFile(filePath,dataElementTab);
		System.out.println(filePathXML);
		System.out.println("Finish!");
	}

	/**
	 * 将dataElementTab写为对应的xml文件
	 * @time 2018年8月21日 下午12:49:34
	 * @author dengp_w
	 * @param dataElementTab
	 * @return
	 * @throws IOException 
	 */
	public static String  writeDataElementFile(String filePath , DataElementTab dataElementTab) throws IOException {
		filePath = filePath.substring(0,filePath.lastIndexOf("/")+1) + FILE_NAME;
//		写xml
		OutputFormat format = OutputFormat.createPrettyPrint();//创建文件输出的时候，自动缩进
//		有中文的时�?�设置编码格式，没有可以不�?�虑xmlWriter的最后一�?
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(filePath),format);
		Document document = DocumentHelper.createDocument();
		
		Element DataElementTab = document.addElement("DataElementTab");//root
		
		int recNum = dataElementTab.getRecNum();
		DataElementTab.addAttribute("RecNum", String.valueOf(recNum));
		List<DataElement> dataElementList = dataElementTab.getDataElement();
		
		for (int i = 0; i < recNum; i++) {//DataElement循环
			DataElement dataElement = dataElementList.get(i);
			Element DataElement = DataElementTab.addElement("DataElement");
			DataElement.addAttribute("DataType", dataElement.getDataType());
			DataElement.addAttribute("ElemName", dataElement.getElemName());
			DataElement.addAttribute("ElemDesc", dataElement.getElemDesc());
			DataElement.addAttribute("NodeClassName", dataElement.getNodeClassName());
			DataElement.addAttribute("NodeClassDesc", dataElement.getNodeClassDesc());
			DataElement.addAttribute("XmlNodeName", dataElement.getXmlNodeName());
			
			Element ItemTab = DataElement.addElement("ItemTab");
			com.adtec.dataElement.entity.ItemTab itemTab = dataElement.getItemTab();
			List<Item> itemList = itemTab.getItem();
			int itemRecNum = itemTab.getRecNum();
			ItemTab.addAttribute("RecNum",  String.valueOf(itemRecNum));
			for (int j = 0; j < itemRecNum; j++) {
				Element Item = ItemTab.addElement("Item");
				com.adtec.dataElement.entity.Item item = itemList.get(j);
				Item.addAttribute("ItemName", item.getItemName());
				Item.addAttribute("ItemDesc", item.getItemDesc());
				Item.addAttribute("ItemType", item.getItemType());
				Item.addAttribute("TypeName", item.getTypeName());
				Item.addAttribute("ItemDeft", item.getItemDeft());
				Item.addAttribute("ElemType", item.getElemType());
				Item.addAttribute("Array", item.getArray());
				Item.addAttribute("NodeType", item.getNodeType());
				Item.addAttribute("Security", item.getSecurity());
				Item.addAttribute("EnumName", item.getEnumName());
				Item.addAttribute("EnumKvp", item.getEnumKvp());
				Item.addAttribute("RelateItemName", item.getRelateItemName());
				
				Element ScopeExpr = Item.addElement("ScopeExpr");
				ScopeExpr.addCDATA(item.getScopeExpr());
			}
		}
		
		xmlWriter.write(document);
		xmlWriter.close();
		return null ;
	}
	
	/**
	 * 将xml文件读为dataElementTab对象
	 * @time 2018年8月21日 下午12:49:54
	 * @author dengp_w
	 * @param filePath
	 * @return
	 */
	public static DataElementTab  readDataElementFile(String filePath) {
		return null ;
	}
}
