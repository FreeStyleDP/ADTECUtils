package com.adtec.jfBuilder.entity;

public class EstTypeMngKey {
    /**
     * 
     */
    private String typeFlag;

    /**
     * 
     */
    private String acronymName;

    /**
     * 
     */
    private String fullName;

    /**
     * 
     * @return type_flag 
     */
    public String getTypeFlag() {
        return typeFlag;
    }

    /**
     * 
     * @param typeFlag 
     */
    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag == null ? null : typeFlag.trim();
    }

    /**
     * 
     * @return acronym_name 
     */
    public String getAcronymName() {
        return acronymName;
    }

    /**
     * 
     * @param acronymName 
     */
    public void setAcronymName(String acronymName) {
        this.acronymName = acronymName == null ? null : acronymName.trim();
    }

    /**
     * 
     * @return full_name 
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName 
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }
}