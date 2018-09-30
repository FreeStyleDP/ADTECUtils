package com.adtec.VersionMng.enums;

/**
 * 文件操作类型
 * @time 2018年9月25日下午2:57:20
 * @author dengp_w
 *
 */
public enum OperateType {
	
	NO_DEAL("未处理",0),UPDEAT("修改",1),ADD("新增",2),DELETE("删除",3);
	
	private String name ;
	private int index;
	
	private OperateType(String name ,int index){
		this.name = name;
		this.index = index;
	}
	
	public static String getName(int index) {
        for (OperateType c : OperateType.values()) {
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

