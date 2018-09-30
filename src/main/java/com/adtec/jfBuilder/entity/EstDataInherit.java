package com.adtec.jfBuilder.entity;

public class EstDataInherit extends EstDataInheritKey {
    /**
     * 
     */
    private String inheritRelatId;

    /**
     * 
     * @return inherit_relat_id 
     */
    public String getInheritRelatId() {
        return inheritRelatId;
    }

    /**
     * 
     * @param inheritRelatId 
     */
    public void setInheritRelatId(String inheritRelatId) {
        this.inheritRelatId = inheritRelatId == null ? null : inheritRelatId.trim();
    }
}