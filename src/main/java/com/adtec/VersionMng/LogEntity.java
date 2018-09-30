package com.adtec.VersionMng;

public class LogEntity {
	
	public static final String[] OPERATE_ENUM = {"0-未处理","1-修改","2-新增","3-新增文件"};
	
	private String fileName;
	private String operate;
	private String node;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	
	
	public LogEntity(String fileName, String node, String operate) {
		super();
		this.fileName = fileName;
		this.operate = operate;
		this.node = node;
	}
	/**
	 *  通过key获取value ， 没有为空
	 * @time 2018年8月31日 下午5:34:56
	 * @author dengp_w
	 * @param key
	 * @return
	 */
	public static String getValueByKey(String[] enu , String key) {
		for (int i = 0; i < enu.length; i++) {
			String[] split = enu[i].split("-");
			if(split[0].equals(key)) {
				return split[1];
			}
		}
		return key;
	}
}

