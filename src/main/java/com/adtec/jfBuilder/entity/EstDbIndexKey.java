package com.adtec.jfBuilder.entity;

public class EstDbIndexKey {
    /**
     * 
     */
    private Integer tabid;

    /**
     * 
     */
    private String indexName;

    /**
     * 
     * @return tabid 
     */
    public Integer getTabid() {
        return tabid;
    }

    /**
     * 
     * @param tabid 
     */
    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    /**
     * 
     * @return index_name 
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * 
     * @param indexName 
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }
}