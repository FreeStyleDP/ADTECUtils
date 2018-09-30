package com.adtec.jfBuilder.entity;

public class EstConstructorParam extends EstConstructorParamKey {
    /**
     * 
     */
    private String paramValue;

    /**
     * 
     */
    private String refBean;

    /**
     * 
     * @return param_value 
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 
     * @param paramValue 
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
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