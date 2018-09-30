package com.adtec.jfBuilder.entity;

public class EstAutoTaskTime extends EstAutoTaskTimeKey {
    /**
     * 
     */
    private String beginTime;

    /**
     * 
     */
    private String endTime;

    /**
     * 
     * @return begin_time 
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * 
     * @param beginTime 
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    /**
     * 
     * @return end_time 
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime 
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }
}