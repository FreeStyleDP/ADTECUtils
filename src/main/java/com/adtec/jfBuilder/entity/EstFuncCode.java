package com.adtec.jfBuilder.entity;

public class EstFuncCode extends EstFuncCodeKey {
    /**
     * 
     */
    private String code;

    /**
     * 
     * @return code 
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}