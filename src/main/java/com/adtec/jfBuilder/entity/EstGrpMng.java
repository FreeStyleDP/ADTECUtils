package com.adtec.jfBuilder.entity;

public class EstGrpMng {
    /**
     * 
     */
    private String grpId;

    /**
     * 
     */
    private String grpName;

    /**
     * 
     */
    private String grpDesc;

    /**
     * 
     * @return grp_id 
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * 
     * @param grpId 
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId == null ? null : grpId.trim();
    }

    /**
     * 
     * @return grp_name 
     */
    public String getGrpName() {
        return grpName;
    }

    /**
     * 
     * @param grpName 
     */
    public void setGrpName(String grpName) {
        this.grpName = grpName == null ? null : grpName.trim();
    }

    /**
     * 
     * @return grp_desc 
     */
    public String getGrpDesc() {
        return grpDesc;
    }

    /**
     * 
     * @param grpDesc 
     */
    public void setGrpDesc(String grpDesc) {
        this.grpDesc = grpDesc == null ? null : grpDesc.trim();
    }
}