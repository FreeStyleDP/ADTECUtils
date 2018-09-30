package com.adtec.jfBuilder.entity;

public class EstRouteRule extends EstRouteRuleKey {
    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String ruleName;

    /**
     * 
     */
    private String routeType;

    /**
     * 
     */
    private String servicesMatch;

    /**
     * 
     */
    private String ruleExpression;

    /**
     * 
     */
    private Short serialNo;

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
     * @return rule_name 
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 
     * @param ruleName 
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    /**
     * 
     * @return route_type 
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * 
     * @param routeType 
     */
    public void setRouteType(String routeType) {
        this.routeType = routeType == null ? null : routeType.trim();
    }

    /**
     * 
     * @return services_match 
     */
    public String getServicesMatch() {
        return servicesMatch;
    }

    /**
     * 
     * @param servicesMatch 
     */
    public void setServicesMatch(String servicesMatch) {
        this.servicesMatch = servicesMatch == null ? null : servicesMatch.trim();
    }

    /**
     * 
     * @return rule_expression 
     */
    public String getRuleExpression() {
        return ruleExpression;
    }

    /**
     * 
     * @param ruleExpression 
     */
    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression == null ? null : ruleExpression.trim();
    }

    /**
     * 
     * @return serial_no 
     */
    public Short getSerialNo() {
        return serialNo;
    }

    /**
     * 
     * @param serialNo 
     */
    public void setSerialNo(Short serialNo) {
        this.serialNo = serialNo;
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