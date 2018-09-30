package com.adtec.VersionMng;

public class VersionOper {

	private String node;
	private String operate;
	
	
	public VersionOper() {
		super();
	}


	public VersionOper(String operate ,String node) {
		super();
		this.node = node;
		this.operate = operate;
	}


	public String getNode() {
		return node;
	}


	public void setNode(String node) {
		this.node = node;
	}


	public String getOperate() {
		return operate;
	}


	public void setOperate(String operate) {
		this.operate = operate;
	}

	
	
}
