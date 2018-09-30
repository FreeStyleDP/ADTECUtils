package com.adtec.jfBuilder.entity;

public class EstDockerMngKey {
    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String addrName;

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
     * @return addr_name 
     */
    public String getAddrName() {
        return addrName;
    }

    /**
     * 
     * @param addrName 
     */
    public void setAddrName(String addrName) {
        this.addrName = addrName == null ? null : addrName.trim();
    }
}