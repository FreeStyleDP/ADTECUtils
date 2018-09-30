package com.adtec.jfBuilder.entity;

public class EstDrqSeqMngKey {
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
    private Integer seqId;

    /**
     * 
     */
    private String cloudProjectId;

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
     * @return seq_id 
     */
    public Integer getSeqId() {
        return seqId;
    }

    /**
     * 
     * @param seqId 
     */
    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
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