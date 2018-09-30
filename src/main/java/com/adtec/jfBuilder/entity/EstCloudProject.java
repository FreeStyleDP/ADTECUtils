package com.adtec.jfBuilder.entity;

public class EstCloudProject {
    /**
     * 
     */
    private String cloudProjectId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String addrName;

    /**
     * 
     */
    private String cloudEnvId;

    /**
     * 
     */
    private String cloudProjectName;

    /**
     * 
     */
    private String cloudProjectDesc;

    /**
     * 
     */
    private String projectMode;

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
     * @return addr_name 
     */
    public String getAddrName() {
        return addrName;
    }

    /**
     * 
     * @param addrName 
     */
    public void setAddrName(String addrName) {
        this.addrName = addrName == null ? null : addrName.trim();
    }

    /**
     * 
     * @return cloud_env_id 
     */
    public String getCloudEnvId() {
        return cloudEnvId;
    }

    /**
     * 
     * @param cloudEnvId 
     */
    public void setCloudEnvId(String cloudEnvId) {
        this.cloudEnvId = cloudEnvId == null ? null : cloudEnvId.trim();
    }

    /**
     * 
     * @return cloud_project_name 
     */
    public String getCloudProjectName() {
        return cloudProjectName;
    }

    /**
     * 
     * @param cloudProjectName 
     */
    public void setCloudProjectName(String cloudProjectName) {
        this.cloudProjectName = cloudProjectName == null ? null : cloudProjectName.trim();
    }

    /**
     * 
     * @return cloud_project_desc 
     */
    public String getCloudProjectDesc() {
        return cloudProjectDesc;
    }

    /**
     * 
     * @param cloudProjectDesc 
     */
    public void setCloudProjectDesc(String cloudProjectDesc) {
        this.cloudProjectDesc = cloudProjectDesc == null ? null : cloudProjectDesc.trim();
    }

    /**
     * 
     * @return project_mode 
     */
    public String getProjectMode() {
        return projectMode;
    }

    /**
     * 
     * @param projectMode 
     */
    public void setProjectMode(String projectMode) {
        this.projectMode = projectMode == null ? null : projectMode.trim();
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
}