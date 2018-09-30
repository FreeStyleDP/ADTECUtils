package com.adtec.jfBuilder.entity;

public class EstRutMngKey {
    /**
     * 
     */
    private String srcDtaId;

    /**
     * 
     */
    private String ruleId;

    /**
     * 
     */
    private Short serialNo;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String envId;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     * @return src_dta_id 
     */
    public String getSrcDtaId() {
        return srcDtaId;
    }

    /**
     * 
     * @param srcDtaId 
     */
    public void setSrcDtaId(String srcDtaId) {
        this.srcDtaId = srcDtaId == null ? null : srcDtaId.trim();
    }

    /**
     * 
     * @return rule_id 
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 
     * @param ruleId 
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * 
     * @return serial_no 
     */
    public Short getSerialNo() {
        return serialNo;
    }

    /**
     * 
     * @param serialNo 
     */
    public void setSerialNo(Short serialNo) {
        this.serialNo = serialNo;
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
     * @return env_id 
     */
    public String getEnvId() {
        return envId;
    }

    /**
     * 
     * @param envId 
     */
    public void setEnvId(String envId) {
        this.envId = envId == null ? null : envId.trim();
    }

    /**
     * 
     * @return cloud_project_id 
     */
    public String getCloudProjectId() {
        return cloudProjectId;
    }

    /**
     * 
     * @param cloudProjectId 
     */
    public void setCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId == null ? null : cloudProjectId.trim();
    }
}