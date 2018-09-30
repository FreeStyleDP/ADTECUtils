package com.adtec.jfBuilder.entity;

public class EstGroupMng {
    /**
     * 
     */
    private String groupId;

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
    private String groupName;

    /**
     * 
     */
    private String groupDesc;

    /**
     * 
     */
    private String handleDb;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     * @return group_id 
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
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
     * @return group_name 
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 
     * @param groupName 
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 
     * @return group_desc 
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * 
     * @param groupDesc 
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    /**
     * 
     * @return handle_db 
     */
    public String getHandleDb() {
        return handleDb;
    }

    /**
     * 
     * @param handleDb 
     */
    public void setHandleDb(String handleDb) {
        this.handleDb = handleDb == null ? null : handleDb.trim();
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