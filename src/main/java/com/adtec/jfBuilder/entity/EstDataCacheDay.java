package com.adtec.jfBuilder.entity;

public class EstDataCacheDay {
    /**
     * 
     */
    private String dataCacheId;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String weekType;

    /**
     * 
     */
    private String lastWeekDay;

    /**
     * 
     */
    private String weekBitmap;

    /**
     * 
     */
    private String monthBitmap;

    /**
     * 
     * @return data_cache_id 
     */
    public String getDataCacheId() {
        return dataCacheId;
    }

    /**
     * 
     * @param dataCacheId 
     */
    public void setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId == null ? null : dataCacheId.trim();
    }

    /**
     * 
     * @return type 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * @return week_type 
     */
    public String getWeekType() {
        return weekType;
    }

    /**
     * 
     * @param weekType 
     */
    public void setWeekType(String weekType) {
        this.weekType = weekType == null ? null : weekType.trim();
    }

    /**
     * 
     * @return last_week_day 
     */
    public String getLastWeekDay() {
        return lastWeekDay;
    }

    /**
     * 
     * @param lastWeekDay 
     */
    public void setLastWeekDay(String lastWeekDay) {
        this.lastWeekDay = lastWeekDay == null ? null : lastWeekDay.trim();
    }

    /**
     * 
     * @return week_bitmap 
     */
    public String getWeekBitmap() {
        return weekBitmap;
    }

    /**
     * 
     * @param weekBitmap 
     */
    public void setWeekBitmap(String weekBitmap) {
        this.weekBitmap = weekBitmap == null ? null : weekBitmap.trim();
    }

    /**
     * 
     * @return month_bitmap 
     */
    public String getMonthBitmap() {
        return monthBitmap;
    }

    /**
     * 
     * @param monthBitmap 
     */
    public void setMonthBitmap(String monthBitmap) {
        this.monthBitmap = monthBitmap == null ? null : monthBitmap.trim();
    }
}