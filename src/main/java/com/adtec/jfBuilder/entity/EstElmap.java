package com.adtec.jfBuilder.entity;

public class EstElmap {
    /**
     * 
     */
    private String elmapId;

    /**
     * 
     */
    private String sourceId;

    /**
     * 
     */
    private String sourceType;

    /**
     * 
     */
    private String destId;

    /**
     * 
     */
    private String destType;

    /**
     * 
     */
    private String relationId;

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
     * @return elmap_id 
     */
    public String getElmapId() {
        return elmapId;
    }

    /**
     * 
     * @param elmapId 
     */
    public void setElmapId(String elmapId) {
        this.elmapId = elmapId == null ? null : elmapId.trim();
    }

    /**
     * 
     * @return source_id 
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * 
     * @param sourceId 
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * 
     * @return source_type 
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 
     * @param sourceType 
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * 
     * @return dest_id 
     */
    public String getDestId() {
        return destId;
    }

    /**
     * 
     * @param destId 
     */
    public void setDestId(String destId) {
        this.destId = destId == null ? null : destId.trim();
    }

    /**
     * 
     * @return dest_type 
     */
    public String getDestType() {
        return destType;
    }

    /**
     * 
     * @param destType 
     */
    public void setDestType(String destType) {
        this.destType = destType == null ? null : destType.trim();
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