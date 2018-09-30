package com.adtec.jfBuilder.entity;

public class EstCode extends EstCodeKey {
    /**
     * 
     */
    private String fieldDesc;

    /**
     * 
     * @return field_desc 
     */
    public String getFieldDesc() {
        return fieldDesc;
    }

    /**
     * 
     * @param fieldDesc 
     */
    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc == null ? null : fieldDesc.trim();
    }
}