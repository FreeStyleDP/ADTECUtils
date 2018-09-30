package com.adtec.jfBuilder.entity;

public class EstDataCacheKey {
    /**
     * 
     */
    private String dataCacheId;

    /**
     * 
     */
    private String dataCacheName;

    /**
     * 
     */
    private String dataCacheDesc;

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
     * @return data_cache_name 
     */
    public String getDataCacheName() {
        return dataCacheName;
    }

    /**
     * 
     * @param dataCacheName 
     */
    public void setDataCacheName(String dataCacheName) {
        this.dataCacheName = dataCacheName == null ? null : dataCacheName.trim();
    }

    /**
     * 
     * @return data_cache_desc 
     */
    public String getDataCacheDesc() {
        return dataCacheDesc;
    }

    /**
     * 
     * @param dataCacheDesc 
     */
    public void setDataCacheDesc(String dataCacheDesc) {
        this.dataCacheDesc = dataCacheDesc == null ? null : dataCacheDesc.trim();
    }
}