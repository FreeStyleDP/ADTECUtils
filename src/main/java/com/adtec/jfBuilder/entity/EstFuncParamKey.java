package com.adtec.jfBuilder.entity;

public class EstFuncParamKey {
    /**
     * 
     */
    private String funcId;

    /**
     * 
     */
    private Short serialNo;

    /**
     * 
     * @return func_id 
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 
     * @param funcId 
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
    }

    /**
     * 
     * @return serial_no 
     */
    public Short getSerialNo() {
        return serialNo;
    }

    /**
     * 
     * @param serialNo 
     */
    public void setSerialNo(Short serialNo) {
        this.serialNo = serialNo;
    }
}