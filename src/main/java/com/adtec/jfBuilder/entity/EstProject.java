package com.adtec.jfBuilder.entity;

public class EstProject {
    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String projectName;

    /**
     * 
     */
    private String projectDesc;

    /**
     * 
     */
    private String packageName;

    /**
     * 
     */
    private String evtSvcBefore;

    /**
     * 
     */
    private String evtSvcAfter;

    /**
     * 
     */
    private String evtSvcFailed;

    /**
     * 
     */
    private String evtSvcEnd;

    /**
     * 
     */
    private String evtInitEnd;

    /**
     * 
     */
    private String evtTermBegin;

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
    private String runVersion;

    /**
     * 
     */
    private String defDateTime;

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
     * @return project_name 
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     * @param projectName 
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 
     * @return project_desc 
     */
    public String getProjectDesc() {
        return projectDesc;
    }

    /**
     * 
     * @param projectDesc 
     */
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    /**
     * 
     * @return package_name 
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 
     * @param packageName 
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    /**
     * 
     * @return evt_svc_before 
     */
    public String getEvtSvcBefore() {
        return evtSvcBefore;
    }

    /**
     * 
     * @param evtSvcBefore 
     */
    public void setEvtSvcBefore(String evtSvcBefore) {
        this.evtSvcBefore = evtSvcBefore == null ? null : evtSvcBefore.trim();
    }

    /**
     * 
     * @return evt_svc_after 
     */
    public String getEvtSvcAfter() {
        return evtSvcAfter;
    }

    /**
     * 
     * @param evtSvcAfter 
     */
    public void setEvtSvcAfter(String evtSvcAfter) {
        this.evtSvcAfter = evtSvcAfter == null ? null : evtSvcAfter.trim();
    }

    /**
     * 
     * @return evt_svc_failed 
     */
    public String getEvtSvcFailed() {
        return evtSvcFailed;
    }

    /**
     * 
     * @param evtSvcFailed 
     */
    public void setEvtSvcFailed(String evtSvcFailed) {
        this.evtSvcFailed = evtSvcFailed == null ? null : evtSvcFailed.trim();
    }

    /**
     * 
     * @return evt_svc_end 
     */
    public String getEvtSvcEnd() {
        return evtSvcEnd;
    }

    /**
     * 
     * @param evtSvcEnd 
     */
    public void setEvtSvcEnd(String evtSvcEnd) {
        this.evtSvcEnd = evtSvcEnd == null ? null : evtSvcEnd.trim();
    }

    /**
     * 
     * @return evt_init_end 
     */
    public String getEvtInitEnd() {
        return evtInitEnd;
    }

    /**
     * 
     * @param evtInitEnd 
     */
    public void setEvtInitEnd(String evtInitEnd) {
        this.evtInitEnd = evtInitEnd == null ? null : evtInitEnd.trim();
    }

    /**
     * 
     * @return evt_term_begin 
     */
    public String getEvtTermBegin() {
        return evtTermBegin;
    }

    /**
     * 
     * @param evtTermBegin 
     */
    public void setEvtTermBegin(String evtTermBegin) {
        this.evtTermBegin = evtTermBegin == null ? null : evtTermBegin.trim();
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
     * @return run_version 
     */
    public String getRunVersion() {
        return runVersion;
    }

    /**
     * 
     * @param runVersion 
     */
    public void setRunVersion(String runVersion) {
        this.runVersion = runVersion == null ? null : runVersion.trim();
    }

    /**
     * 
     * @return def_date_time 
     */
    public String getDefDateTime() {
        return defDateTime;
    }

    /**
     * 
     * @param defDateTime 
     */
    public void setDefDateTime(String defDateTime) {
        this.defDateTime = defDateTime == null ? null : defDateTime.trim();
    }
}