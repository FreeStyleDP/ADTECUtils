package com.adtec.jfBuilder.entity;

public class EstFlowDeriveKey {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String keyName;

    /**
     * 
     */
    private String flowpartName;

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
     * @return key_name 
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * 
     * @param keyName 
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
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
}