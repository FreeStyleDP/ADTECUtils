package com.adtec.VersionMng.enums;

public enum Enum {

	MON("星期一", "1"),
	TUE("星期二", "2"),
	WEN("星期三", "3"),
	THI("星期四", "4"),
	FRI("星期五", "5") ,
	SAT("星期六", "6"),
	SUN("星期日", "7");
	
	private String value ;
	private String key;
	
	Enum(String value, String key)	{	
		this.value = value;		
		this.key = key;	
	}		
	
	public static String getValue (String key ) {
		for ( Enum t : Enum.values()) {
			if(t.getKey().equals(key)) {
				return t.getValue();
			}
		}
		return null;
	}
	
	public static Enum getEnum (String key ) {
		for ( Enum t : Enum.values()) {
			if(t.getKey().equals(key)) {
				return t;
			}
		}
		return null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String toString () {
		return this.key+"_"+this.value;
	}

}
