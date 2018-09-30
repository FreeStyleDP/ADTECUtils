package com.adtec.jfBuilder.entity;

public class EstFlowRelainfoKey {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String flowpartName;

    /**
     * 
     */
    private String relainfoType;

    /**
     * 
     */
    private String relainfoId;

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
     * @return flowpart_name 
     */
    public String getFlowpartName() {
        return flowpartName;
    }

    /**
     * 
     * @param flowpartName 
     */
    public void setFlowpartName(String flowpartName) {
        this.flowpartName = flowpartName == null ? null : flowpartName.trim();
    }

    /**
     * 
     * @return relainfo_type 
     */
    public String getRelainfoType() {
        return relainfoType;
    }

    /**
     * 
     * @param relainfoType 
     */
    public void setRelainfoType(String relainfoType) {
        this.relainfoType = relainfoType == null ? null : relainfoType.trim();
    }

    /**
     * 
     * @return relainfo_id 
     */
    public String getRelainfoId() {
        return relainfoId;
    }

    /**
     * 
     * @param relainfoId 
     */
    public void setRelainfoId(String relainfoId) {
        this.relainfoId = relainfoId == null ? null : relainfoId.trim();
    }
}