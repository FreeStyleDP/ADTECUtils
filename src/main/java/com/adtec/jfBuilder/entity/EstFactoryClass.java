package com.adtec.jfBuilder.entity;

public class EstFactoryClass {
    /**
     * 
     */
    private String factoryId;

    /**
     * 
     */
    private String factoryName;

    /**
     * 
     */
    private String factoryDesc;

    /**
     * 
     */
    private String factoryType;

    /**
     * 
     */
    private String factoryContent;

    /**
     * 
     * @return factory_id 
     */
    public String getFactoryId() {
        return factoryId;
    }

    /**
     * 
     * @param factoryId 
     */
    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId == null ? null : factoryId.trim();
    }

    /**
     * 
     * @return factory_name 
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * 
     * @param factoryName 
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    /**
     * 
     * @return factory_desc 
     */
    public String getFactoryDesc() {
        return factoryDesc;
    }

    /**
     * 
     * @param factoryDesc 
     */
    public void setFactoryDesc(String factoryDesc) {
        this.factoryDesc = factoryDesc == null ? null : factoryDesc.trim();
    }

    /**
     * 
     * @return factory_type 
     */
    public String getFactoryType() {
        return factoryType;
    }

    /**
     * 
     * @param factoryType 
     */
    public void setFactoryType(String factoryType) {
        this.factoryType = factoryType == null ? null : factoryType.trim();
    }

    /**
     * 
     * @return factory_content 
     */
    public String getFactoryContent() {
        return factoryContent;
    }

    /**
     * 
     * @param factoryContent 
     */
    public void setFactoryContent(String factoryContent) {
        this.factoryContent = factoryContent == null ? null : factoryContent.trim();
    }
}