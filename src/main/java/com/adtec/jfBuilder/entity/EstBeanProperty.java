package com.adtec.jfBuilder.entity;

public class EstBeanProperty {
    /**
     * 
     */
    private String propertyId;

    /**
     * 
     */
    private String beanId;

    /**
     * 
     */
    private String propertyName;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String propertyValue;

    /**
     * 
     */
    private String refBean;

    /**
     * 
     * @return property_id 
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * 
     * @param propertyId 
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId == null ? null : propertyId.trim();
    }

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
     * @return property_name 
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 
     * @param propertyName 
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    /**
     * 
     * @return type 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * @return property_value 
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * 
     * @param propertyValue 
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }

    /**
     * 
     * @return ref_bean 
     */
    public String getRefBean() {
        return refBean;
    }

    /**
     * 
     * @param refBean 
     */
    public void setRefBean(String refBean) {
        this.refBean = refBean == null ? null : refBean.trim();
    }
}