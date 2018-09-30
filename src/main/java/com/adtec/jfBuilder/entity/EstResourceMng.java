package com.adtec.jfBuilder.entity;

public class EstResourceMng {
    /**
     * 
     */
    private String resourceId;

    /**
     * 
     */
    private String parentId;

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
    private String resourceType;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String objId;

    /**
     * 
     */
    private String relationId;

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
     * @return parent_id 
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId 
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
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
     * @return obj_id 
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 
     * @param objId 
     */
    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
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
}