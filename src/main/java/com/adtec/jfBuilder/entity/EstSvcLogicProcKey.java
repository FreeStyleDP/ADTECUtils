package com.adtec.jfBuilder.entity;

public class EstSvcLogicProcKey {
    /**
     * 
     */
    private String serviceId;

    /**
     * 
     */
    private String flowId;

    /**
     * 
     */
    private Short stepNo;

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
     * @return flow_id 
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 
     * @param flowId 
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    /**
     * 
     * @return step_no 
     */
    public Short getStepNo() {
        return stepNo;
    }

    /**
     * 
     * @param stepNo 
     */
    public void setStepNo(Short stepNo) {
        this.stepNo = stepNo;
    }
}