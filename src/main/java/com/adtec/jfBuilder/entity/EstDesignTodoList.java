package com.adtec.jfBuilder.entity;

public class EstDesignTodoList {
    /**
     * 
     */
    private String todoId;

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
    private String resourceId;

    /**
     * 
     */
    private String resourceType;

    /**
     * 
     */
    private String resourceName;

    /**
     * 
     */
    private String resourceDesc;

    /**
     * 
     */
    private String grpId;

    /**
     * 
     */
    private String operateUser;

    /**
     * 
     */
    private String recordTime;

    /**
     * 
     */
    private String processUser;

    /**
     * 
     */
    private String processTime;

    /**
     * 
     * @return todo_id 
     */
    public String getTodoId() {
        return todoId;
    }

    /**
     * 
     * @param todoId 
     */
    public void setTodoId(String todoId) {
        this.todoId = todoId == null ? null : todoId.trim();
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
     * @return resource_type 
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 
     * @param resourceType 
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * 
     * @return resource_name 
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 
     * @param resourceName 
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * 
     * @return resource_desc 
     */
    public String getResourceDesc() {
        return resourceDesc;
    }

    /**
     * 
     * @param resourceDesc 
     */
    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc == null ? null : resourceDesc.trim();
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
     * @return operate_user 
     */
    public String getOperateUser() {
        return operateUser;
    }

    /**
     * 
     * @param operateUser 
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    /**
     * 
     * @return record_time 
     */
    public String getRecordTime() {
        return recordTime;
    }

    /**
     * 
     * @param recordTime 
     */
    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    /**
     * 
     * @return process_user 
     */
    public String getProcessUser() {
        return processUser;
    }

    /**
     * 
     * @param processUser 
     */
    public void setProcessUser(String processUser) {
        this.processUser = processUser == null ? null : processUser.trim();
    }

    /**
     * 
     * @return process_time 
     */
    public String getProcessTime() {
        return processTime;
    }

    /**
     * 
     * @param processTime 
     */
    public void setProcessTime(String processTime) {
        this.processTime = processTime == null ? null : processTime.trim();
    }
}