package com.adtec.jfBuilder.entity;

public class EstNodeKey {
    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private String nodeName;

    /**
     * 
     * @return dta_id 
     */
    public String getDtaId() {
        return dtaId;
    }

    /**
     * 
     * @param dtaId 
     */
    public void setDtaId(String dtaId) {
        this.dtaId = dtaId == null ? null : dtaId.trim();
    }

    /**
     * 
     * @return node_name 
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 
     * @param nodeName 
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }
}