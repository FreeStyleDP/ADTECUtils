package com.adtec.jfBuilder.entity;

public class EstFsrvMng extends EstFsrvMngKey {
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
    private String fsrvName;

    /**
     * 
     */
    private String fsrvDesc;

    /**
     * 
     */
    private String fsrvIp;

    /**
     * 
     */
    private Short fsrvPort;

    /**
     * 
     */
    private Short fsrvProcNum;

    /**
     * 
     */
    private Short maxCliNum;

    /**
     * 
     */
    private String rcvFileDir;

    /**
     * 
     */
    private String sndFileDir;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     */
    private String regsvrExpr;

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
     * @return fsrv_name 
     */
    public String getFsrvName() {
        return fsrvName;
    }

    /**
     * 
     * @param fsrvName 
     */
    public void setFsrvName(String fsrvName) {
        this.fsrvName = fsrvName == null ? null : fsrvName.trim();
    }

    /**
     * 
     * @return fsrv_desc 
     */
    public String getFsrvDesc() {
        return fsrvDesc;
    }

    /**
     * 
     * @param fsrvDesc 
     */
    public void setFsrvDesc(String fsrvDesc) {
        this.fsrvDesc = fsrvDesc == null ? null : fsrvDesc.trim();
    }

    /**
     * 
     * @return fsrv_ip 
     */
    public String getFsrvIp() {
        return fsrvIp;
    }

    /**
     * 
     * @param fsrvIp 
     */
    public void setFsrvIp(String fsrvIp) {
        this.fsrvIp = fsrvIp == null ? null : fsrvIp.trim();
    }

    /**
     * 
     * @return fsrv_port 
     */
    public Short getFsrvPort() {
        return fsrvPort;
    }

    /**
     * 
     * @param fsrvPort 
     */
    public void setFsrvPort(Short fsrvPort) {
        this.fsrvPort = fsrvPort;
    }

    /**
     * 
     * @return fsrv_proc_num 
     */
    public Short getFsrvProcNum() {
        return fsrvProcNum;
    }

    /**
     * 
     * @param fsrvProcNum 
     */
    public void setFsrvProcNum(Short fsrvProcNum) {
        this.fsrvProcNum = fsrvProcNum;
    }

    /**
     * 
     * @return max_cli_num 
     */
    public Short getMaxCliNum() {
        return maxCliNum;
    }

    /**
     * 
     * @param maxCliNum 
     */
    public void setMaxCliNum(Short maxCliNum) {
        this.maxCliNum = maxCliNum;
    }

    /**
     * 
     * @return rcv_file_dir 
     */
    public String getRcvFileDir() {
        return rcvFileDir;
    }

    /**
     * 
     * @param rcvFileDir 
     */
    public void setRcvFileDir(String rcvFileDir) {
        this.rcvFileDir = rcvFileDir == null ? null : rcvFileDir.trim();
    }

    /**
     * 
     * @return snd_file_dir 
     */
    public String getSndFileDir() {
        return sndFileDir;
    }

    /**
     * 
     * @param sndFileDir 
     */
    public void setSndFileDir(String sndFileDir) {
        this.sndFileDir = sndFileDir == null ? null : sndFileDir.trim();
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

    /**
     * 
     * @return regsvr_expr 
     */
    public String getRegsvrExpr() {
        return regsvrExpr;
    }

    /**
     * 
     * @param regsvrExpr 
     */
    public void setRegsvrExpr(String regsvrExpr) {
        this.regsvrExpr = regsvrExpr == null ? null : regsvrExpr.trim();
    }
}