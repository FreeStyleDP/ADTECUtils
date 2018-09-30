package com.adtec.jfBuilder.entity;

public class EstPropertyValueList {
    /**
     * 
     */
    private String valueId;

    /**
     * 
     */
    private String propertyId;

    /**
     * 
     */
    private String keyStr;

    /**
     * 
     */
    private String valueStr;

    /**
     * 
     */
    private String refBean;

    /**
     * 
     * @return value_id 
     */
    public String getValueId() {
        return valueId;
    }

    /**
     * 
     * @param valueId 
     */
    public void setValueId(String valueId) {
        this.valueId = valueId == null ? null : valueId.trim();
    }

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
     * @return key_str 
     */
    public String getKeyStr() {
        return keyStr;
    }

    /**
     * 
     * @param keyStr 
     */
    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr == null ? null : keyStr.trim();
    }

    /**
     * 
     * @return value_str 
     */
    public String getValueStr() {
        return valueStr;
    }

    /**
     * 
     * @param valueStr 
     */
    public void setValueStr(String valueStr) {
        this.valueStr = valueStr == null ? null : valueStr.trim();
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