package com.adtec.jfBuilder.entity;

public class EstCloudProjectDetail {
    /**
     * 
     */
    private String detailId;

    /**
     * 
     */
    private String cloudProjectId;

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
     * @return detail_id 
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 
     * @param detailId 
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    /**
     * 
     * @return cloud_project_id 
     */
    public String getCloudProjectId() {
        return cloudProjectId;
    }

    /**
     * 
     * @param cloudProjectId 
     */
    public void setCloudProjectId(String cloudProjectId) {
        this.cloudProjectId = cloudProjectId == null ? null : cloudProjectId.trim();
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
}