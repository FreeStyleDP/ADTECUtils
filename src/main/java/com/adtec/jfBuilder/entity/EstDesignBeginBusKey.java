package com.adtec.jfBuilder.entity;

public class EstDesignBeginBusKey {
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
    private String relateType;

    /**
     * 
     */
    private String cpId;

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
     * @return relate_type 
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * 
     * @param relateType 
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType == null ? null : relateType.trim();
    }

    /**
     * 
     * @return cp_id 
     */
    public String getCpId() {
        return cpId;
    }

    /**
     * 
     * @param cpId 
     */
    public void setCpId(String cpId) {
        this.cpId = cpId == null ? null : cpId.trim();
    }
}