package com.adtec.VersionMng;

import java.util.List;

/**
 * 版本清单对象
 * @time 2018年9月25日下午3:14:17
 * @author dengp_w
 *
 */
public class VersionList {
	
	private String fileName;
	
	/**
	 * 操作明细
	 */
	private List<VersionOper> versionOpers;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<VersionOper> getVersionOpers() {
		return versionOpers;
	}

	public void setVersionOpers(List<VersionOper> versionOpers) {
		this.versionOpers = versionOpers;
	}
	
	
}

