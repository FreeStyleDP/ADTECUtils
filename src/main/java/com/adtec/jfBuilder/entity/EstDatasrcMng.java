package com.adtec.jfBuilder.entity;

public class EstDatasrcMng {
    /**
     * 
     */
    private String datasrcMngId;

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
    private String datasrcMngName;

    /**
     * 
     */
    private String datasrcMngDesc;

    /**
     * 
     */
    private String dbFlag;

    /**
     * 
     */
    private String getsvrFlag;

    /**
     * 
     */
    private String datasrcMngType;

    /**
     * 
     */
    private String dbType;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String autoFlag;

    /**
     * 
     */
    private Integer maxActive;

    /**
     * 
     */
    private Integer maxIdle;

    /**
     * 
     */
    private Integer maxWait;

    /**
     * 
     */
    private Integer acquireIncrement;

    /**
     * 
     */
    private Integer initialPoolSize;

    /**
     * 
     */
    private Integer maxPoolSize;

    /**
     * 
     */
    private Integer checkoutTimeout;

    /**
     * 
     */
    private String jndiName;

    /**
     * 
     */
    private String driverClass;

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
    private String auth;

    /**
     * 
     */
    private String validationQuery;

    /**
     * 
     */
    private String testWhileIdle;

    /**
     * 
     */
    private Integer testPeriod;

    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     */
    private String getsvrExpr;

    /**
     * 
     * @return datasrc_mng_id 
     */
    public String getDatasrcMngId() {
        return datasrcMngId;
    }

    /**
     * 
     * @param datasrcMngId 
     */
    public void setDatasrcMngId(String datasrcMngId) {
        this.datasrcMngId = datasrcMngId == null ? null : datasrcMngId.trim();
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
     * @return datasrc_mng_name 
     */
    public String getDatasrcMngName() {
        return datasrcMngName;
    }

    /**
     * 
     * @param datasrcMngName 
     */
    public void setDatasrcMngName(String datasrcMngName) {
        this.datasrcMngName = datasrcMngName == null ? null : datasrcMngName.trim();
    }

    /**
     * 
     * @return datasrc_mng_desc 
     */
    public String getDatasrcMngDesc() {
        return datasrcMngDesc;
    }

    /**
     * 
     * @param datasrcMngDesc 
     */
    public void setDatasrcMngDesc(String datasrcMngDesc) {
        this.datasrcMngDesc = datasrcMngDesc == null ? null : datasrcMngDesc.trim();
    }

    /**
     * 
     * @return db_flag 
     */
    public String getDbFlag() {
        return dbFlag;
    }

    /**
     * 
     * @param dbFlag 
     */
    public void setDbFlag(String dbFlag) {
        this.dbFlag = dbFlag == null ? null : dbFlag.trim();
    }

    /**
     * 
     * @return getsvr_flag 
     */
    public String getGetsvrFlag() {
        return getsvrFlag;
    }

    /**
     * 
     * @param getsvrFlag 
     */
    public void setGetsvrFlag(String getsvrFlag) {
        this.getsvrFlag = getsvrFlag == null ? null : getsvrFlag.trim();
    }

    /**
     * 
     * @return datasrc_mng_type 
     */
    public String getDatasrcMngType() {
        return datasrcMngType;
    }

    /**
     * 
     * @param datasrcMngType 
     */
    public void setDatasrcMngType(String datasrcMngType) {
        this.datasrcMngType = datasrcMngType == null ? null : datasrcMngType.trim();
    }

    /**
     * 
     * @return db_type 
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * 
     * @param dbType 
     */
    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    /**
     * 
     * @return url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return auto_flag 
     */
    public String getAutoFlag() {
        return autoFlag;
    }

    /**
     * 
     * @param autoFlag 
     */
    public void setAutoFlag(String autoFlag) {
        this.autoFlag = autoFlag == null ? null : autoFlag.trim();
    }

    /**
     * 
     * @return max_active 
     */
    public Integer getMaxActive() {
        return maxActive;
    }

    /**
     * 
     * @param maxActive 
     */
    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    /**
     * 
     * @return max_idle 
     */
    public Integer getMaxIdle() {
        return maxIdle;
    }

    /**
     * 
     * @param maxIdle 
     */
    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    /**
     * 
     * @return max_wait 
     */
    public Integer getMaxWait() {
        return maxWait;
    }

    /**
     * 
     * @param maxWait 
     */
    public void setMaxWait(Integer maxWait) {
        this.maxWait = maxWait;
    }

    /**
     * 
     * @return acquire_increment 
     */
    public Integer getAcquireIncrement() {
        return acquireIncrement;
    }

    /**
     * 
     * @param acquireIncrement 
     */
    public void setAcquireIncrement(Integer acquireIncrement) {
        this.acquireIncrement = acquireIncrement;
    }

    /**
     * 
     * @return initial_pool_size 
     */
    public Integer getInitialPoolSize() {
        return initialPoolSize;
    }

    /**
     * 
     * @param initialPoolSize 
     */
    public void setInitialPoolSize(Integer initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
    }

    /**
     * 
     * @return max_pool_size 
     */
    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * 
     * @param maxPoolSize 
     */
    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    /**
     * 
     * @return checkout_timeout 
     */
    public Integer getCheckoutTimeout() {
        return checkoutTimeout;
    }

    /**
     * 
     * @param checkoutTimeout 
     */
    public void setCheckoutTimeout(Integer checkoutTimeout) {
        this.checkoutTimeout = checkoutTimeout;
    }

    /**
     * 
     * @return jndi_name 
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * 
     * @param jndiName 
     */
    public void setJndiName(String jndiName) {
        this.jndiName = jndiName == null ? null : jndiName.trim();
    }

    /**
     * 
     * @return driver_class 
     */
    public String getDriverClass() {
        return driverClass;
    }

    /**
     * 
     * @param driverClass 
     */
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass == null ? null : driverClass.trim();
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
     * @return auth 
     */
    public String getAuth() {
        return auth;
    }

    /**
     * 
     * @param auth 
     */
    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

    /**
     * 
     * @return validation_query 
     */
    public String getValidationQuery() {
        return validationQuery;
    }

    /**
     * 
     * @param validationQuery 
     */
    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery == null ? null : validationQuery.trim();
    }

    /**
     * 
     * @return test_while_idle 
     */
    public String getTestWhileIdle() {
        return testWhileIdle;
    }

    /**
     * 
     * @param testWhileIdle 
     */
    public void setTestWhileIdle(String testWhileIdle) {
        this.testWhileIdle = testWhileIdle == null ? null : testWhileIdle.trim();
    }

    /**
     * 
     * @return test_period 
     */
    public Integer getTestPeriod() {
        return testPeriod;
    }

    /**
     * 
     * @param testPeriod 
     */
    public void setTestPeriod(Integer testPeriod) {
        this.testPeriod = testPeriod;
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
     * @return getsvr_expr 
     */
    public String getGetsvrExpr() {
        return getsvrExpr;
    }

    /**
     * 
     * @param getsvrExpr 
     */
    public void setGetsvrExpr(String getsvrExpr) {
        this.getsvrExpr = getsvrExpr == null ? null : getsvrExpr.trim();
    }
}