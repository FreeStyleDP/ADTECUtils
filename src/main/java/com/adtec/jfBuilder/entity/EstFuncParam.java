package com.adtec.jfBuilder.entity;

public class EstFuncParam extends EstFuncParamKey {
    /**
     * 
     */
    private String paramName;

    /**
     * 
     */
    private String paramType;

    /**
     * 
     */
    private String paramDesc;

    /**
     * 
     * @return param_name 
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 
     * @param paramName 
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * 
     * @return param_type 
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * 
     * @param paramType 
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * 
     * @return param_desc 
     */
    public String getParamDesc() {
        return paramDesc;
    }

    /**
     * 
     * @param paramDesc 
     */
    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }
}