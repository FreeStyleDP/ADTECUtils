package com.adtec.jfBuilder.entity;

public class EstComKey {
    /**
     * 
     */
    private String typeName;

    /**
     * 
     */
    private String comType;

    /**
     * 
     */
    private String agtType;

    /**
     * 
     * @return type_name 
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 
     * @param typeName 
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 
     * @return com_type 
     */
    public String getComType() {
        return comType;
    }

    /**
     * 
     * @param comType 
     */
    public void setComType(String comType) {
        this.comType = comType == null ? null : comType.trim();
    }

    /**
     * 
     * @return agt_type 
     */
    public String getAgtType() {
        return agtType;
    }

    /**
     * 
     * @param agtType 
     */
    public void setAgtType(String agtType) {
        this.agtType = agtType == null ? null : agtType.trim();
    }
}