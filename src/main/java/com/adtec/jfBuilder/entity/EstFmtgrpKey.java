package com.adtec.jfBuilder.entity;

public class EstFmtgrpKey {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private Integer idx;

    /**
     * 
     */
    private String grpType;

    /**
     * 
     * @return svc_id 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

    /**
     * 
     * @return idx 
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * 
     * @param idx 
     */
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    /**
     * 
     * @return grp_type 
     */
    public String getGrpType() {
        return grpType;
    }

    /**
     * 
     * @param grpType 
     */
    public void setGrpType(String grpType) {
        this.grpType = grpType == null ? null : grpType.trim();
    }
}