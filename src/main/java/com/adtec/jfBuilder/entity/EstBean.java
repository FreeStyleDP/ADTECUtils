package com.adtec.jfBuilder.entity;

public class EstBean {
    /**
     * 
     */
    private String beanId;

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
    private String classId;

    /**
     * 
     */
    private String beanName;

    /**
     * 
     */
    private String beanDesc;

    /**
     * 
     */
    private String parentBean;

    /**
     * 
     */
    private String initMethodName;

    /**
     * 
     */
    private String destroyMethodName;

    /**
     * 
     */
    private String scope;

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
     * @return bean_id 
     */
    public String getBeanId() {
        return beanId;
    }

    /**
     * 
     * @param beanId 
     */
    public void setBeanId(String beanId) {
        this.beanId = beanId == null ? null : beanId.trim();
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
     * @return class_id 
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 
     * @param classId 
     */
    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    /**
     * 
     * @return bean_name 
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 
     * @param beanName 
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName == null ? null : beanName.trim();
    }

    /**
     * 
     * @return bean_desc 
     */
    public String getBeanDesc() {
        return beanDesc;
    }

    /**
     * 
     * @param beanDesc 
     */
    public void setBeanDesc(String beanDesc) {
        this.beanDesc = beanDesc == null ? null : beanDesc.trim();
    }

    /**
     * 
     * @return parent_bean 
     */
    public String getParentBean() {
        return parentBean;
    }

    /**
     * 
     * @param parentBean 
     */
    public void setParentBean(String parentBean) {
        this.parentBean = parentBean == null ? null : parentBean.trim();
    }

    /**
     * 
     * @return init_method_name 
     */
    public String getInitMethodName() {
        return initMethodName;
    }

    /**
     * 
     * @param initMethodName 
     */
    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName == null ? null : initMethodName.trim();
    }

    /**
     * 
     * @return destroy_method_name 
     */
    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    /**
     * 
     * @param destroyMethodName 
     */
    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName == null ? null : destroyMethodName.trim();
    }

    /**
     * 
     * @return scope 
     */
    public String getScope() {
        return scope;
    }

    /**
     * 
     * @param scope 
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
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