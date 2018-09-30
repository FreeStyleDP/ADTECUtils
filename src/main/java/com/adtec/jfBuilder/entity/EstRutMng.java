package com.adtec.jfBuilder.entity;

public class EstRutMng extends EstRutMngKey {
    /**
     * 
     */
    private String mchnId;

    /**
     * 
     * @return mchn_id 
     */
    public String getMchnId() {
        return mchnId;
    }

    /**
     * 
     * @param mchnId 
     */
    public void setMchnId(String mchnId) {
        this.mchnId = mchnId == null ? null : mchnId.trim();
    }
}