package com.adtec.createXml.enums;

public enum ItemTypeEnum{
	DataDict("DataDict", 1), GREEN("DataElem", 2), BLANK("白色", 3), YELLO("黄色", 4);
	
	private String name ;
	private int index;
	
	private ItemTypeEnum(String name ,int index){
		this.name = name;
		this.index = index;
	}
	
	public static String getName(int index) {
        for (ItemTypeEnum c : ItemTypeEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
