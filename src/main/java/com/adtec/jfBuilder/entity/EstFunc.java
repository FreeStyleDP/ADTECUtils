package com.adtec.jfBuilder.entity;

public class EstFunc {
    /**
     * 
     */
    private String funcId;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private String funcName;

    /**
     * 
     */
    private String funcDesc;

    /**
     * 
     */
    private String funcType;

    /**
     * 
     */
    private String retvalType;

    /**
     * 
     */
    private Short nochkret;

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
     * @return func_id 
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 
     * @param funcId 
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
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
     * @return dta_id 
     */
    public String getDtaId() {
        return dtaId;
    }

    /**
     * 
     * @param dtaId 
     */
    public void setDtaId(String dtaId) {
        this.dtaId = dtaId == null ? null : dtaId.trim();
    }

    /**
     * 
     * @return func_name 
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * 
     * @param funcName 
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    /**
     * 
     * @return func_desc 
     */
    public String getFuncDesc() {
        return funcDesc;
    }

    /**
     * 
     * @param funcDesc 
     */
    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc == null ? null : funcDesc.trim();
    }

    /**
     * 
     * @return func_type 
     */
    public String getFuncType() {
        return funcType;
    }

    /**
     * 
     * @param funcType 
     */
    public void setFuncType(String funcType) {
        this.funcType = funcType == null ? null : funcType.trim();
    }

    /**
     * 
     * @return retval_type 
     */
    public String getRetvalType() {
        return retvalType;
    }

    /**
     * 
     * @param retvalType 
     */
    public void setRetvalType(String retvalType) {
        this.retvalType = retvalType == null ? null : retvalType.trim();
    }

    /**
     * 
     * @return nochkret 
     */
    public Short getNochkret() {
        return nochkret;
    }

    /**
     * 
     * @param nochkret 
     */
    public void setNochkret(Short nochkret) {
        this.nochkret = nochkret;
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