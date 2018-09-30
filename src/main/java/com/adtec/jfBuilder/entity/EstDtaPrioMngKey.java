package com.adtec.jfBuilder.entity;

public class EstDtaPrioMngKey {
    /**
     * 
     */
    private String objId;

    /**
     * 
     */
    private String objType;

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
    private String mchnId;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     * @return obj_id 
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 
     * @param objId 
     */
    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    /**
     * 
     * @return obj_type 
     */
    public String getObjType() {
        return objType;
    }

    /**
     * 
     * @param objType 
     */
    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
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
     * @return mchn_id 
     */
    public String getMchnId() {
        return mchnId;
    }

    /**
     * 
     * @param mchnId 
     */
    public void setMchnId(String mchnId) {
        this.mchnId = mchnId == null ? null : mchnId.trim();
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