package com.adtec.jfBuilder.entity;

public class EstSvcLogicRevsKey {
    /**
     * 
     */
    private String serviceId;

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
     * @return service_id 
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 
     * @param serviceId 
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
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