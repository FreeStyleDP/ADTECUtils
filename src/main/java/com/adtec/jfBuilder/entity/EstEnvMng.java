package com.adtec.jfBuilder.entity;

public class EstEnvMng {
    /**
     * 
     */
    private String envId;

    /**
     * 
     */
    private String envName;

    /**
     * 
     */
    private String envDesc;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String userType;

    /**
     * 
     */
    private String crtUser;

    /**
     * 
     */
    private String crtDateTime;

    /**
     * 
     */
    private String lstModUser;

    /**
     * 
     */
    private String lstModDateTime;

    /**
     * 
     */
    private String envFlag;

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
     * @return env_name 
     */
    public String getEnvName() {
        return envName;
    }

    /**
     * 
     * @param envName 
     */
    public void setEnvName(String envName) {
        this.envName = envName == null ? null : envName.trim();
    }

    /**
     * 
     * @return env_desc 
     */
    public String getEnvDesc() {
        return envDesc;
    }

    /**
     * 
     * @param envDesc 
     */
    public void setEnvDesc(String envDesc) {
        this.envDesc = envDesc == null ? null : envDesc.trim();
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
     * @return user_type 
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 
     * @param userType 
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 
     * @return crt_user 
     */
    public String getCrtUser() {
        return crtUser;
    }

    /**
     * 
     * @param crtUser 
     */
    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    /**
     * 
     * @return crt_date_time 
     */
    public String getCrtDateTime() {
        return crtDateTime;
    }

    /**
     * 
     * @param crtDateTime 
     */
    public void setCrtDateTime(String crtDateTime) {
        this.crtDateTime = crtDateTime == null ? null : crtDateTime.trim();
    }

    /**
     * 
     * @return lst_mod_user 
     */
    public String getLstModUser() {
        return lstModUser;
    }

    /**
     * 
     * @param lstModUser 
     */
    public void setLstModUser(String lstModUser) {
        this.lstModUser = lstModUser == null ? null : lstModUser.trim();
    }

    /**
     * 
     * @return lst_mod_date_time 
     */
    public String getLstModDateTime() {
        return lstModDateTime;
    }

    /**
     * 
     * @param lstModDateTime 
     */
    public void setLstModDateTime(String lstModDateTime) {
        this.lstModDateTime = lstModDateTime == null ? null : lstModDateTime.trim();
    }

    /**
     * 
     * @return env_flag 
     */
    public String getEnvFlag() {
        return envFlag;
    }

    /**
     * 
     * @param envFlag 
     */
    public void setEnvFlag(String envFlag) {
        this.envFlag = envFlag == null ? null : envFlag.trim();
    }
}