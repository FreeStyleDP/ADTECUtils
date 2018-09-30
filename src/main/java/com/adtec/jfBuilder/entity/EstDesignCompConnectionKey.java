package com.adtec.jfBuilder.entity;

public class EstDesignCompConnectionKey {
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
    private String connectionSrc;

    /**
     * 
     */
    private String connectionDest;

    /**
     * 
     */
    private String type;

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
     * @return connection_src 
     */
    public String getConnectionSrc() {
        return connectionSrc;
    }

    /**
     * 
     * @param connectionSrc 
     */
    public void setConnectionSrc(String connectionSrc) {
        this.connectionSrc = connectionSrc == null ? null : connectionSrc.trim();
    }

    /**
     * 
     * @return connection_dest 
     */
    public String getConnectionDest() {
        return connectionDest;
    }

    /**
     * 
     * @param connectionDest 
     */
    public void setConnectionDest(String connectionDest) {
        this.connectionDest = connectionDest == null ? null : connectionDest.trim();
    }

    /**
     * 
     * @return type 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}