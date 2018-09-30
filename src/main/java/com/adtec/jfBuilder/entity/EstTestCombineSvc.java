package com.adtec.jfBuilder.entity;

public class EstTestCombineSvc {
    /**
     * 
     */
    private String combineSvcId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String combineSvcName;

    /**
     * 
     */
    private String combineSvcDesc;

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
    private String singleSvcType;

    /**
     * 
     * @return combine_svc_id 
     */
    public String getCombineSvcId() {
        return combineSvcId;
    }

    /**
     * 
     * @param combineSvcId 
     */
    public void setCombineSvcId(String combineSvcId) {
        this.combineSvcId = combineSvcId == null ? null : combineSvcId.trim();
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
     * @return combine_svc_name 
     */
    public String getCombineSvcName() {
        return combineSvcName;
    }

    /**
     * 
     * @param combineSvcName 
     */
    public void setCombineSvcName(String combineSvcName) {
        this.combineSvcName = combineSvcName == null ? null : combineSvcName.trim();
    }

    /**
     * 
     * @return combine_svc_desc 
     */
    public String getCombineSvcDesc() {
        return combineSvcDesc;
    }

    /**
     * 
     * @param combineSvcDesc 
     */
    public void setCombineSvcDesc(String combineSvcDesc) {
        this.combineSvcDesc = combineSvcDesc == null ? null : combineSvcDesc.trim();
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
     * @return single_svc_type 
     */
    public String getSingleSvcType() {
        return singleSvcType;
    }

    /**
     * 
     * @param singleSvcType 
     */
    public void setSingleSvcType(String singleSvcType) {
        this.singleSvcType = singleSvcType == null ? null : singleSvcType.trim();
    }
}