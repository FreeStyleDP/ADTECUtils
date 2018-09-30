package com.adtec.jfBuilder.entity;

public class EstSvcRevsKey {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private Short compsFlag;

    /**
     * 
     */
    private String elemId;

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
     * @return comps_flag 
     */
    public Short getCompsFlag() {
        return compsFlag;
    }

    /**
     * 
     * @param compsFlag 
     */
    public void setCompsFlag(Short compsFlag) {
        this.compsFlag = compsFlag;
    }

    /**
     * 
     * @return elem_id 
     */
    public String getElemId() {
        return elemId;
    }

    /**
     * 
     * @param elemId 
     */
    public void setElemId(String elemId) {
        this.elemId = elemId == null ? null : elemId.trim();
    }
}