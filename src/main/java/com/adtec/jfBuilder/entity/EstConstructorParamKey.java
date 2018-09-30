package com.adtec.jfBuilder.entity;

public class EstConstructorParamKey {
    /**
     * 
     */
    private String beanId;

    /**
     * 
     */
    private Integer seqNo;

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
     * @return seq_no 
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 
     * @param seqNo 
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
}