package com.adtec.jfBuilder.entity;

public class EstDesignSvcDefine {
    /**
     * 
     */
    private String svcDefineId;

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
    private String svcType;

    /**
     * 
     */
    private String belongsId;

    /**
     * 
     */
    private String svcDefineName;

    /**
     * 
     */
    private String svcDefineDesc;

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
     * @return svc_define_id 
     */
    public String getSvcDefineId() {
        return svcDefineId;
    }

    /**
     * 
     * @param svcDefineId 
     */
    public void setSvcDefineId(String svcDefineId) {
        this.svcDefineId = svcDefineId == null ? null : svcDefineId.trim();
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
     * @return svc_type 
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * 
     * @param svcType 
     */
    public void setSvcType(String svcType) {
        this.svcType = svcType == null ? null : svcType.trim();
    }

    /**
     * 
     * @return belongs_id 
     */
    public String getBelongsId() {
        return belongsId;
    }

    /**
     * 
     * @param belongsId 
     */
    public void setBelongsId(String belongsId) {
        this.belongsId = belongsId == null ? null : belongsId.trim();
    }

    /**
     * 
     * @return svc_define_name 
     */
    public String getSvcDefineName() {
        return svcDefineName;
    }

    /**
     * 
     * @param svcDefineName 
     */
    public void setSvcDefineName(String svcDefineName) {
        this.svcDefineName = svcDefineName == null ? null : svcDefineName.trim();
    }

    /**
     * 
     * @return svc_define_desc 
     */
    public String getSvcDefineDesc() {
        return svcDefineDesc;
    }

    /**
     * 
     * @param svcDefineDesc 
     */
    public void setSvcDefineDesc(String svcDefineDesc) {
        this.svcDefineDesc = svcDefineDesc == null ? null : svcDefineDesc.trim();
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