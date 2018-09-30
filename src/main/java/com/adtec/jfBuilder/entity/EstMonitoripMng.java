package com.adtec.jfBuilder.entity;

public class EstMonitoripMng {
    /**
     * 
     */
    private String objId;

    /**
     * 
     */
    private String mchnId;

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
    private String ipAddr;

    /**
     * 
     */
    private String port;

    /**
     * 
     */
    private Short maxConn;

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
     * @return ip_addr 
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * 
     * @param ipAddr 
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    /**
     * 
     * @return port 
     */
    public String getPort() {
        return port;
    }

    /**
     * 
     * @param port 
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * 
     * @return max_conn 
     */
    public Short getMaxConn() {
        return maxConn;
    }

    /**
     * 
     * @param maxConn 
     */
    public void setMaxConn(Short maxConn) {
        this.maxConn = maxConn;
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