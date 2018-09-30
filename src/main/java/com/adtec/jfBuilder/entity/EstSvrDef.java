package com.adtec.jfBuilder.entity;

public class EstSvrDef {
    /**
     * 
     */
    private String svrId;

    /**
     * 
     */
    private String svrName;

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
    private String svrDesc;

    /**
     * 
     */
    private Integer tranNumRef;

    /**
     * 
     */
    private String tranTimeoutNum;

    /**
     * 
     */
    private Integer timeoutCtrlTime;

    /**
     * 
     */
    private String flowNum;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     * @return svr_id 
     */
    public String getSvrId() {
        return svrId;
    }

    /**
     * 
     * @param svrId 
     */
    public void setSvrId(String svrId) {
        this.svrId = svrId == null ? null : svrId.trim();
    }

    /**
     * 
     * @return svr_name 
     */
    public String getSvrName() {
        return svrName;
    }

    /**
     * 
     * @param svrName 
     */
    public void setSvrName(String svrName) {
        this.svrName = svrName == null ? null : svrName.trim();
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
     * @return svr_desc 
     */
    public String getSvrDesc() {
        return svrDesc;
    }

    /**
     * 
     * @param svrDesc 
     */
    public void setSvrDesc(String svrDesc) {
        this.svrDesc = svrDesc == null ? null : svrDesc.trim();
    }

    /**
     * 
     * @return tran_num_ref 
     */
    public Integer getTranNumRef() {
        return tranNumRef;
    }

    /**
     * 
     * @param tranNumRef 
     */
    public void setTranNumRef(Integer tranNumRef) {
        this.tranNumRef = tranNumRef;
    }

    /**
     * 
     * @return tran_timeout_num 
     */
    public String getTranTimeoutNum() {
        return tranTimeoutNum;
    }

    /**
     * 
     * @param tranTimeoutNum 
     */
    public void setTranTimeoutNum(String tranTimeoutNum) {
        this.tranTimeoutNum = tranTimeoutNum == null ? null : tranTimeoutNum.trim();
    }

    /**
     * 
     * @return timeout_ctrl_time 
     */
    public Integer getTimeoutCtrlTime() {
        return timeoutCtrlTime;
    }

    /**
     * 
     * @param timeoutCtrlTime 
     */
    public void setTimeoutCtrlTime(Integer timeoutCtrlTime) {
        this.timeoutCtrlTime = timeoutCtrlTime;
    }

    /**
     * 
     * @return flow_num 
     */
    public String getFlowNum() {
        return flowNum;
    }

    /**
     * 
     * @param flowNum 
     */
    public void setFlowNum(String flowNum) {
        this.flowNum = flowNum == null ? null : flowNum.trim();
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