package com.adtec.jfBuilder.entity;

public class EstDesignBusCompKey {
    /**
     * 
     */
    private String busId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     * @return bus_id 
     */
    public String getBusId() {
        return busId;
    }

    /**
     * 
     * @param busId 
     */
    public void setBusId(String busId) {
        this.busId = busId == null ? null : busId.trim();
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
}