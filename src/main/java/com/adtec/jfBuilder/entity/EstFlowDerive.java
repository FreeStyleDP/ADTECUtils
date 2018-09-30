package com.adtec.jfBuilder.entity;

public class EstFlowDerive extends EstFlowDeriveKey {
    /**
     * 
     */
    private String keyDesc;

    /**
     * 
     */
    private String eventBefore;

    /**
     * 
     */
    private String eventFailedAfter;

    /**
     * 
     */
    private String eventSuccessAfter;

    /**
     * 
     * @return key_desc 
     */
    public String getKeyDesc() {
        return keyDesc;
    }

    /**
     * 
     * @param keyDesc 
     */
    public void setKeyDesc(String keyDesc) {
        this.keyDesc = keyDesc == null ? null : keyDesc.trim();
    }

    /**
     * 
     * @return event_before 
     */
    public String getEventBefore() {
        return eventBefore;
    }

    /**
     * 
     * @param eventBefore 
     */
    public void setEventBefore(String eventBefore) {
        this.eventBefore = eventBefore == null ? null : eventBefore.trim();
    }

    /**
     * 
     * @return event_failed_after 
     */
    public String getEventFailedAfter() {
        return eventFailedAfter;
    }

    /**
     * 
     * @param eventFailedAfter 
     */
    public void setEventFailedAfter(String eventFailedAfter) {
        this.eventFailedAfter = eventFailedAfter == null ? null : eventFailedAfter.trim();
    }

    /**
     * 
     * @return event_success_after 
     */
    public String getEventSuccessAfter() {
        return eventSuccessAfter;
    }

    /**
     * 
     * @param eventSuccessAfter 
     */
    public void setEventSuccessAfter(String eventSuccessAfter) {
        this.eventSuccessAfter = eventSuccessAfter == null ? null : eventSuccessAfter.trim();
    }
}