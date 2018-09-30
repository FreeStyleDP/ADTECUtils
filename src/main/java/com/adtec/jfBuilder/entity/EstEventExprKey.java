package com.adtec.jfBuilder.entity;

public class EstEventExprKey {
    /**
     * 
     */
    private String eventExprId;

    /**
     * 
     */
    private Short serialNo;

    /**
     * 
     * @return event_expr_id 
     */
    public String getEventExprId() {
        return eventExprId;
    }

    /**
     * 
     * @param eventExprId 
     */
    public void setEventExprId(String eventExprId) {
        this.eventExprId = eventExprId == null ? null : eventExprId.trim();
    }

    /**
     * 
     * @return serial_no 
     */
    public Short getSerialNo() {
        return serialNo;
    }

    /**
     * 
     * @param serialNo 
     */
    public void setSerialNo(Short serialNo) {
        this.serialNo = serialNo;
    }
}