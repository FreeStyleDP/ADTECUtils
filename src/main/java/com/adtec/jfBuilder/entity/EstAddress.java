package com.adtec.jfBuilder.entity;

public class EstAddress extends EstAddressKey {
    /**
     * 
     */
    private String ipAddr;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String passwd;

    /**
     * 
     */
    private String defAddr;

    /**
     * 
     */
    private String envId;

    /**
     * 
     */
    private String escmdPort;

    /**
     * 
     */
    private String isPassive;

    /**
     * 
     */
    private String ftpType;

    /**
     * 
     */
    private String ipPort;

    /**
     * 
     */
    private String isConsole;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     */
    private String refreshWebName;

    /**
     * 
     */
    private String dockerPort;

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
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 
     * @return passwd 
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 
     * @param passwd 
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * 
     * @return def_addr 
     */
    public String getDefAddr() {
        return defAddr;
    }

    /**
     * 
     * @param defAddr 
     */
    public void setDefAddr(String defAddr) {
        this.defAddr = defAddr == null ? null : defAddr.trim();
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
     * @return escmd_port 
     */
    public String getEscmdPort() {
        return escmdPort;
    }

    /**
     * 
     * @param escmdPort 
     */
    public void setEscmdPort(String escmdPort) {
        this.escmdPort = escmdPort == null ? null : escmdPort.trim();
    }

    /**
     * 
     * @return is_passive 
     */
    public String getIsPassive() {
        return isPassive;
    }

    /**
     * 
     * @param isPassive 
     */
    public void setIsPassive(String isPassive) {
        this.isPassive = isPassive == null ? null : isPassive.trim();
    }

    /**
     * 
     * @return ftp_type 
     */
    public String getFtpType() {
        return ftpType;
    }

    /**
     * 
     * @param ftpType 
     */
    public void setFtpType(String ftpType) {
        this.ftpType = ftpType == null ? null : ftpType.trim();
    }

    /**
     * 
     * @return ip_port 
     */
    public String getIpPort() {
        return ipPort;
    }

    /**
     * 
     * @param ipPort 
     */
    public void setIpPort(String ipPort) {
        this.ipPort = ipPort == null ? null : ipPort.trim();
    }

    /**
     * 
     * @return is_console 
     */
    public String getIsConsole() {
        return isConsole;
    }

    /**
     * 
     * @param isConsole 
     */
    public void setIsConsole(String isConsole) {
        this.isConsole = isConsole == null ? null : isConsole.trim();
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
     * @return refresh_web_name 
     */
    public String getRefreshWebName() {
        return refreshWebName;
    }

    /**
     * 
     * @param refreshWebName 
     */
    public void setRefreshWebName(String refreshWebName) {
        this.refreshWebName = refreshWebName == null ? null : refreshWebName.trim();
    }

    /**
     * 
     * @return docker_port 
     */
    public String getDockerPort() {
        return dockerPort;
    }

    /**
     * 
     * @param dockerPort 
     */
    public void setDockerPort(String dockerPort) {
        this.dockerPort = dockerPort == null ? null : dockerPort.trim();
    }
}