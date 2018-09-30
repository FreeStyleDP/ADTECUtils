package com.adtec.jfBuilder.entity;

public class EstForm {
    /**
     * 
     */
    private String formId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String formName;

    /**
     * 
     */
    private String formDesc;

    /**
     * 
     */
    private Integer tabid;

    /**
     * 
     */
    private String resourceId;

    /**
     * 
     */
    private String grpId;

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
     * @return form_id 
     */
    public String getFormId() {
        return formId;
    }

    /**
     * 
     * @param formId 
     */
    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
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
     * @return relation_id 
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * 
     * @param relationId 
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    /**
     * 
     * @return form_name 
     */
    public String getFormName() {
        return formName;
    }

    /**
     * 
     * @param formName 
     */
    public void setFormName(String formName) {
        this.formName = formName == null ? null : formName.trim();
    }

    /**
     * 
     * @return form_desc 
     */
    public String getFormDesc() {
        return formDesc;
    }

    /**
     * 
     * @param formDesc 
     */
    public void setFormDesc(String formDesc) {
        this.formDesc = formDesc == null ? null : formDesc.trim();
    }

    /**
     * 
     * @return tabid 
     */
    public Integer getTabid() {
        return tabid;
    }

    /**
     * 
     * @param tabid 
     */
    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    /**
     * 
     * @return resource_id 
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId 
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 
     * @return grp_id 
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * 
     * @param grpId 
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId == null ? null : grpId.trim();
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