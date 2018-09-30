package com.adtec.jfBuilder.entity;

public class EstFuncCodeKey {
    /**
     * 
     */
    private String funcId;

    /**
     * 
     */
    private Short codeNo;

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
     * @return code_no 
     */
    public Short getCodeNo() {
        return codeNo;
    }

    /**
     * 
     * @param codeNo 
     */
    public void setCodeNo(Short codeNo) {
        this.codeNo = codeNo;
    }
}