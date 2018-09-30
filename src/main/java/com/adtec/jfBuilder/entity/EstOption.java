package com.adtec.jfBuilder.entity;

public class EstOption {
    /**
     * 
     */
    private String secKey;

    /**
     * 
     */
    private Short jnlSave;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String versionNum;

    /**
     * 
     */
    private String encoding;

    /**
     * 
     */
    private String isSvnConf;

    /**
     * 
     */
    private String svnUrl;

    /**
     * 
     * @return sec_key 
     */
    public String getSecKey() {
        return secKey;
    }

    /**
     * 
     * @param secKey 
     */
    public void setSecKey(String secKey) {
        this.secKey = secKey == null ? null : secKey.trim();
    }

    /**
     * 
     * @return jnl_save 
     */
    public Short getJnlSave() {
        return jnlSave;
    }

    /**
     * 
     * @param jnlSave 
     */
    public void setJnlSave(Short jnlSave) {
        this.jnlSave = jnlSave;
    }

    /**
     * 
     * @return project_id 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 
     * @return version_num 
     */
    public String getVersionNum() {
        return versionNum;
    }

    /**
     * 
     * @param versionNum 
     */
    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    /**
     * 
     * @return encoding 
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * 
     * @param encoding 
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding == null ? null : encoding.trim();
    }

    /**
     * 
     * @return is_svn_conf 
     */
    public String getIsSvnConf() {
        return isSvnConf;
    }

    /**
     * 
     * @param isSvnConf 
     */
    public void setIsSvnConf(String isSvnConf) {
        this.isSvnConf = isSvnConf == null ? null : isSvnConf.trim();
    }

    /**
     * 
     * @return svn_url 
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     * 
     * @param svnUrl 
     */
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl == null ? null : svnUrl.trim();
    }
}