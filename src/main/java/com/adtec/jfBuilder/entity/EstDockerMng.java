package com.adtec.jfBuilder.entity;

public class EstDockerMng extends EstDockerMngKey {
    /**
     * 
     */
    private String ipAddr;

    /**
     * 
     */
    private String ipPort;

    /**
     * 
     */
    private String tenantName;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userPwd;

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
     * @return tenant_name 
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * 
     * @param tenantName 
     */
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName == null ? null : tenantName.trim();
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
     * @return user_pwd 
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 
     * @param userPwd 
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }
}