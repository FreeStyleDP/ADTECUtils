package com.adtec.jfBuilder.entity;

public class EstDtaStack extends EstDtaStackKey {
    /**
     * 
     */
    private String beanId;

    /**
     * 
     */
    private String beanDesc;

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
}