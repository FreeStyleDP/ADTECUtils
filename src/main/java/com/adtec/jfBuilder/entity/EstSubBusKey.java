package com.adtec.jfBuilder.entity;

public class EstSubBusKey {
    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String busId;

    /**
     * 
     */
    private String subBusId;

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
}