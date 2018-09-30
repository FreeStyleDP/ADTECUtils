package com.adtec.jfBuilder.entity;

public class EstSvcRuleDef {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String svrId;

    /**
     * 
     */
    private String svcName;

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
    private String svcDesc;

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
     * @return svc_id 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

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
     * @return svc_name 
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * 
     * @param svcName 
     */
    public void setSvcName(String svcName) {
        this.svcName = svcName == null ? null : svcName.trim();
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
     * @return svc_desc 
     */
    public String getSvcDesc() {
        return svcDesc;
    }

    /**
     * 
     * @param svcDesc 
     */
    public void setSvcDesc(String svcDesc) {
        this.svcDesc = svcDesc == null ? null : svcDesc.trim();
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