package com.adtec.dataElement.entity;

/**
 * 多条数据集合，及其相应的位置信息
 * @time 2018年8月21日下午12:41:46
 * @author dengp_w
 *
 */
public class DataElement {
	
	private String DataType;
	private String ElemName;
	private String ElemDesc;
	private String NodeClassName;
	private String NodeClassDesc;
	private String XmlNodeName;
	private ItemTab ItemTab;
	public String getDataType() {
		return DataType;
	}
	public void setDataType(String dataType) {
		DataType = dataType;
	}
	public String getElemName() {
		return ElemName;
	}
	public void setElemName(String elemName) {
		ElemName = elemName;
	}
	public String getElemDesc() {
		return ElemDesc;
	}
	public void setElemDesc(String elemDesc) {
		ElemDesc = elemDesc;
	}
	public String getNodeClassName() {
		return NodeClassName;
	}
	public void setNodeClassName(String nodeClassName) {
		NodeClassName = nodeClassName;
	}
	public String getNodeClassDesc() {
		return NodeClassDesc;
	}
	public void setNodeClassDesc(String nodeClassDesc) {
		NodeClassDesc = nodeClassDesc;
	}
	public String getXmlNodeName() {
		return XmlNodeName;
	}
	public void setXmlNodeName(String xmlNodeName) {
		XmlNodeName = xmlNodeName;
	}
	public ItemTab getItemTab() {
		return ItemTab;
	}
	public void setItemTab(ItemTab itemTab) {
		ItemTab = itemTab;
	}
	@Override
	public String toString() {
		return "DataElement [DataType=" + DataType + ", ElemName=" + ElemName + ", ElemDesc=" + ElemDesc
				+ ", NodeClassName=" + NodeClassName + ", NodeClassDesc=" + NodeClassDesc + ", XmlNodeName="
				+ XmlNodeName + ", ItemTab=" + ItemTab + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataType == null) ? 0 : DataType.hashCode());
		result = prime * result + ((ElemDesc == null) ? 0 : ElemDesc.hashCode());
		result = prime * result + ((ElemName == null) ? 0 : ElemName.hashCode());
		result = prime * result + ((ItemTab == null) ? 0 : ItemTab.hashCode());
		result = prime * result + ((NodeClassDesc == null) ? 0 : NodeClassDesc.hashCode());
		result = prime * result + ((NodeClassName == null) ? 0 : NodeClassName.hashCode());
		result = prime * result + ((XmlNodeName == null) ? 0 : XmlNodeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataElement other = (DataElement) obj;
		if (DataType == null) {
			if (other.DataType != null)
				return false;
		} else if (!DataType.equals(other.DataType))
			return false;
		if (ElemDesc == null) {
			if (other.ElemDesc != null)
				return false;
		} else if (!ElemDesc.equals(other.ElemDesc))
			return false;
		if (ElemName == null) {
			if (other.ElemName != null)
				return false;
		} else if (!ElemName.equals(other.ElemName))
			return false;
		if (ItemTab == null) {
			if (other.ItemTab != null)
				return false;
		} else if (!ItemTab.equals(other.ItemTab))
			return false;
		if (NodeClassDesc == null) {
			if (other.NodeClassDesc != null)
				return false;
		} else if (!NodeClassDesc.equals(other.NodeClassDesc))
			return false;
		if (NodeClassName == null) {
			if (other.NodeClassName != null)
				return false;
		} else if (!NodeClassName.equals(other.NodeClassName))
			return false;
		if (XmlNodeName == null) {
			if (other.XmlNodeName != null)
				return false;
		} else if (!XmlNodeName.equals(other.XmlNodeName))
			return false;
		return true;
	}
	
	
}
