package com.adtec.jfBuilder.entity;

public class EstResourceNode extends EstResourceNodeKey {
    /**
     * 
     */
    private String resourceName;

    /**
     * 
     */
    private Short resourceType;

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
     * @return resource_type 
     */
    public Short getResourceType() {
        return resourceType;
    }

    /**
     * 
     * @param resourceType 
     */
    public void setResourceType(Short resourceType) {
        this.resourceType = resourceType;
    }
}