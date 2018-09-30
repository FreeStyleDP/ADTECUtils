package com.adtec.jfBuilder.entity;

public class EstTaskidMng {
    /**
     * 
     */
    private String taskidId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String taskidName;

    /**
     * 
     */
    private String taskidDesc;

    /**
     * 
     */
    private String taskidStat;

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
     * @return taskid_id 
     */
    public String getTaskidId() {
        return taskidId;
    }

    /**
     * 
     * @param taskidId 
     */
    public void setTaskidId(String taskidId) {
        this.taskidId = taskidId == null ? null : taskidId.trim();
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
     * @return taskid_name 
     */
    public String getTaskidName() {
        return taskidName;
    }

    /**
     * 
     * @param taskidName 
     */
    public void setTaskidName(String taskidName) {
        this.taskidName = taskidName == null ? null : taskidName.trim();
    }

    /**
     * 
     * @return taskid_desc 
     */
    public String getTaskidDesc() {
        return taskidDesc;
    }

    /**
     * 
     * @param taskidDesc 
     */
    public void setTaskidDesc(String taskidDesc) {
        this.taskidDesc = taskidDesc == null ? null : taskidDesc.trim();
    }

    /**
     * 
     * @return taskid_stat 
     */
    public String getTaskidStat() {
        return taskidStat;
    }

    /**
     * 
     * @param taskidStat 
     */
    public void setTaskidStat(String taskidStat) {
        this.taskidStat = taskidStat == null ? null : taskidStat.trim();
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