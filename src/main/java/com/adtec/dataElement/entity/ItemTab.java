package com.adtec.dataElement.entity;

import java.util.List;

/**
 * 包含Item及其循环次数
 * @time 2018年8月21日下午12:39:55
 * @author dengp_w
 *
 */
public class ItemTab {
	
	private int RecNum;
	private List<Item> Item;
	public int getRecNum() {
		return RecNum;
	}
	public void setRecNum(int recNum) {
		RecNum = recNum;
	}
	public List<Item> getItem() {
		return Item;
	}
	public void setItem(List<Item> item) {
		Item = item;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Item == null) ? 0 : Item.hashCode());
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
		ItemTab other = (ItemTab) obj;
		if (Item == null) {
			if (other.Item != null)
				return false;
		} else if (!Item.equals(other.Item))
			return false;
		if (RecNum != other.RecNum)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ItemTab [RecNum=" + RecNum + ", Item=" + Item + ", getRecNum()=" + getRecNum() + ", getItem()="
				+ getItem() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
