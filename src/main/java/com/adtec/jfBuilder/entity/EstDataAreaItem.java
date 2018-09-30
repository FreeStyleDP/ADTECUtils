package com.adtec.jfBuilder.entity;

public class EstDataAreaItem {
    /**
     * 
     */
    private String dataAreaId;

    /**
     * 
     */
    private String dataSourceId;

    /**
     * 
     * @return data_area_id 
     */
    public String getDataAreaId() {
        return dataAreaId;
    }

    /**
     * 
     * @param dataAreaId 
     */
    public void setDataAreaId(String dataAreaId) {
        this.dataAreaId = dataAreaId == null ? null : dataAreaId.trim();
    }

    /**
     * 
     * @return data_source_id 
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * 
     * @param dataSourceId 
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId == null ? null : dataSourceId.trim();
    }
}