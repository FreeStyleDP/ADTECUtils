package com.adtec.interfaceDoc;

/**
 * 接口文档输出对象
 * @time 2018年8月30日下午12:50:22
 * @author dengp_w
 *
 */
public class InteraceDocObj {
	
	/**
	 * 交易码
	 */
	private String tranCode ;
	/**
	 * 输入输出
	 */
	private String inOut;
	/**
	 * 层级关系
	 */
	private String packge;
	/**
	 * 数据元素
	 */
	private String element;
	/**
	 * 是否必选
	 */
	private String isMusChoice;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 长度
	 */
	private String length ;
	/**
	 * 描述
	 */
	private String eleDesc;
	/**
	 * 默认值
	 */
	private String defaultVal;
	/**
	 * 备注
	 */
	private String bk;
	public String getTranCode() {
		return tranCode;
	}
	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}
	public String getInOut() {
		return inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}
	public String getPackge() {
		return packge;
	}
	public void setPackge(String packge) {
		this.packge = packge;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String getIsMusChoice() {
		return isMusChoice;
	}
	public void setIsMusChoice(String isMusChoice) {
		this.isMusChoice = isMusChoice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getEleDesc() {
		return eleDesc;
	}
	public void setEleDesc(String eleDesc) {
		this.eleDesc = eleDesc;
	}
	public String getDefaultVal() {
		return defaultVal;
	}
	public void setDefaultVal(String defaultVal) {
		this.defaultVal = defaultVal;
	}
	public String getBk() {
		return bk;
	}
	public void setBk(String bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "InteraceDocObj [tranCode=" + tranCode + ", inOut=" + inOut + ", packge=" + packge + ", element="
				+ element + ", isMusChoice=" + isMusChoice + ", type=" + type + ", length=" + length + ", eleDesc="
				+ eleDesc + ", defaultVal=" + defaultVal + ", bk=" + bk + "]";
	}
	
}
