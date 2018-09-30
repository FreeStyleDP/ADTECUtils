package com.adtec.jfBuilder.entity;

public class EstInSvc extends EstInSvcKey {
    /**
     * 
     */
    private String extCode;

    /**
     * 
     */
    private String extCodeDesc;

    /**
     * 
     * @return ext_code 
     */
    public String getExtCode() {
        return extCode;
    }

    /**
     * 
     * @param extCode 
     */
    public void setExtCode(String extCode) {
        this.extCode = extCode == null ? null : extCode.trim();
    }

    /**
     * 
     * @return ext_code_desc 
     */
    public String getExtCodeDesc() {
        return extCodeDesc;
    }

    /**
     * 
     * @param extCodeDesc 
     */
    public void setExtCodeDesc(String extCodeDesc) {
        this.extCodeDesc = extCodeDesc == null ? null : extCodeDesc.trim();
    }
}