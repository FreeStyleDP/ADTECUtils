package com.adtec.jfBuilder.entity;

public class EstAutoTaskTimeKey {
    /**
     * 
     */
    private String serviceId;

    /**
     * 
     */
    private Short seqNo;

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
}