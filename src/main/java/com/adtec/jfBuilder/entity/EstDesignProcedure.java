package com.adtec.jfBuilder.entity;

public class EstDesignProcedure {
    /**
     * 
     */
    private String procedureId;

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
    private String mapperId;

    /**
     * 
     */
    private String procedureDesc;

    /**
     * 
     */
    private String parametermapName;

    /**
     * 
     */
    private String mapElemId;

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
     * @return procedure_id 
     */
    public String getProcedureId() {
        return procedureId;
    }

    /**
     * 
     * @param procedureId 
     */
    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId == null ? null : procedureId.trim();
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
     * @return mapper_id 
     */
    public String getMapperId() {
        return mapperId;
    }

    /**
     * 
     * @param mapperId 
     */
    public void setMapperId(String mapperId) {
        this.mapperId = mapperId == null ? null : mapperId.trim();
    }

    /**
     * 
     * @return procedure_desc 
     */
    public String getProcedureDesc() {
        return procedureDesc;
    }

    /**
     * 
     * @param procedureDesc 
     */
    public void setProcedureDesc(String procedureDesc) {
        this.procedureDesc = procedureDesc == null ? null : procedureDesc.trim();
    }

    /**
     * 
     * @return parametermap_name 
     */
    public String getParametermapName() {
        return parametermapName;
    }

    /**
     * 
     * @param parametermapName 
     */
    public void setParametermapName(String parametermapName) {
        this.parametermapName = parametermapName == null ? null : parametermapName.trim();
    }

    /**
     * 
     * @return map_elem_id 
     */
    public String getMapElemId() {
        return mapElemId;
    }

    /**
     * 
     * @param mapElemId 
     */
    public void setMapElemId(String mapElemId) {
        this.mapElemId = mapElemId == null ? null : mapElemId.trim();
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