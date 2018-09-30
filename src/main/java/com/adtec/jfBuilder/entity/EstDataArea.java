package com.adtec.jfBuilder.entity;

public class EstDataArea {
    /**
     * 
     */
    private String dataAreaId;

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
    private String dataAreaName;

    /**
     * 
     */
    private String dataAreaDesc;

    /**
     * 
     */
    private String dataAreaType;

    /**
     * 
     */
    private String cloudProjectId;

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
     * @return data_area_name 
     */
    public String getDataAreaName() {
        return dataAreaName;
    }

    /**
     * 
     * @param dataAreaName 
     */
    public void setDataAreaName(String dataAreaName) {
        this.dataAreaName = dataAreaName == null ? null : dataAreaName.trim();
    }

    /**
     * 
     * @return data_area_desc 
     */
    public String getDataAreaDesc() {
        return dataAreaDesc;
    }

    /**
     * 
     * @param dataAreaDesc 
     */
    public void setDataAreaDesc(String dataAreaDesc) {
        this.dataAreaDesc = dataAreaDesc == null ? null : dataAreaDesc.trim();
    }

    /**
     * 
     * @return data_area_type 
     */
    public String getDataAreaType() {
        return dataAreaType;
    }

    /**
     * 
     * @param dataAreaType 
     */
    public void setDataAreaType(String dataAreaType) {
        this.dataAreaType = dataAreaType == null ? null : dataAreaType.trim();
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