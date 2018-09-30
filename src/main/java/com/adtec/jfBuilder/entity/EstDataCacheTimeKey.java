package com.adtec.jfBuilder.entity;

public class EstDataCacheTimeKey {
    /**
     * 
     */
    private String dataCacheId;

    /**
     * 
     */
    private Short seqNo;

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