package com.adtec.jfBuilder.entity;

public class EstDbRouteRule {
    /**
     * 
     */
    private String dbRuleId;

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
    private String subBusId;

    /**
     * 
     */
    private String dataAreaId;

    /**
     * 
     */
    private String dbRuleName;

    /**
     * 
     */
    private String servicesMatch;

    /**
     * 
     */
    private String ruleExpression;

    /**
     * 
     */
    private Short serialNo;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     * @return db_rule_id 
     */
    public String getDbRuleId() {
        return dbRuleId;
    }

    /**
     * 
     * @param dbRuleId 
     */
    public void setDbRuleId(String dbRuleId) {
        this.dbRuleId = dbRuleId == null ? null : dbRuleId.trim();
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
     * @return sub_bus_id 
     */
    public String getSubBusId() {
        return subBusId;
    }

    /**
     * 
     * @param subBusId 
     */
    public void setSubBusId(String subBusId) {
        this.subBusId = subBusId == null ? null : subBusId.trim();
    }

    /**
     * 
     * @return data_area_id 
     */
    public String getDataAreaId() {
        return dataAreaId;
    }

    /**
     * 
     * @param dataAreaId 
     */
    public void setDataAreaId(String dataAreaId) {
        this.dataAreaId = dataAreaId == null ? null : dataAreaId.trim();
    }

    /**
     * 
     * @return db_rule_name 
     */
    public String getDbRuleName() {
        return dbRuleName;
    }

    /**
     * 
     * @param dbRuleName 
     */
    public void setDbRuleName(String dbRuleName) {
        this.dbRuleName = dbRuleName == null ? null : dbRuleName.trim();
    }

    /**
     * 
     * @return services_match 
     */
    public String getServicesMatch() {
        return servicesMatch;
    }

    /**
     * 
     * @param servicesMatch 
     */
    public void setServicesMatch(String servicesMatch) {
        this.servicesMatch = servicesMatch == null ? null : servicesMatch.trim();
    }

    /**
     * 
     * @return rule_expression 
     */
    public String getRuleExpression() {
        return ruleExpression;
    }

    /**
     * 
     * @param ruleExpression 
     */
    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression == null ? null : ruleExpression.trim();
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