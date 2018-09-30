package com.adtec.dataElement.entity;

import java.util.List;

public class DataElementTab {

	private int RecNum;
	private List<DataElement> DataElement;
	public int getRecNum() {
		return RecNum;
	}
	public void setRecNum(int recNum) {
		RecNum = recNum;
	}
	public List<DataElement> getDataElement() {
		return DataElement;
	}
	public void setDataElement(List<DataElement> dataElement) {
		DataElement = dataElement;
	}
	@Override
	public String toString() {
		return "DataElementTab [RecNum=" + RecNum + ", DataElement=" + DataElement + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataElement == null) ? 0 : DataElement.hashCode());
		result = prime * result + RecNum;
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
		DataElementTab other = (DataElementTab) obj;
		if (DataElement == null) {
			if (other.DataElement != null)
				return false;
		} else if (!DataElement.equals(other.DataElement))
			return false;
		if (RecNum != other.RecNum)
			return false;
		return true;
	}
	
	
	
}
