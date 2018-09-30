package com.adtec.jfBuilder.entity;

public class EstResourceNodeKey {
    /**
     * 
     */
    private Short seqNo;

    /**
     * 
     */
    private String resourceLvl;

    /**
     * 
     * @return seq_no 
     */
    public Short getSeqNo() {
        return seqNo;
    }

    /**
     * 
     * @param seqNo 
     */
    public void setSeqNo(Short seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * 
     * @return resource_lvl 
     */
    public String getResourceLvl() {
        return resourceLvl;
    }

    /**
     * 
     * @param resourceLvl 
     */
    public void setResourceLvl(String resourceLvl) {
        this.resourceLvl = resourceLvl == null ? null : resourceLvl.trim();
    }
}