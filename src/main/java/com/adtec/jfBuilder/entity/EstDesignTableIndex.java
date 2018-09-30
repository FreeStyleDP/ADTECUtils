package com.adtec.jfBuilder.entity;

public class EstDesignTableIndex {
    /**
     * 
     */
    private String indexId;

    /**
     * 
     */
    private String tableId;

    /**
     * 
     */
    private String indexName;

    /**
     * 
     */
    private String indexDesc;

    /**
     * 
     */
    private String uniqueFlag;

    /**
     * 
     */
    private String clusteredFlag;

    /**
     * 
     * @return index_id 
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * 
     * @param indexId 
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId == null ? null : indexId.trim();
    }

    /**
     * 
     * @return table_id 
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 
     * @param tableId 
     */
    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
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

    /**
     * 
     * @return index_desc 
     */
    public String getIndexDesc() {
        return indexDesc;
    }

    /**
     * 
     * @param indexDesc 
     */
    public void setIndexDesc(String indexDesc) {
        this.indexDesc = indexDesc == null ? null : indexDesc.trim();
    }

    /**
     * 
     * @return unique_flag 
     */
    public String getUniqueFlag() {
        return uniqueFlag;
    }

    /**
     * 
     * @param uniqueFlag 
     */
    public void setUniqueFlag(String uniqueFlag) {
        this.uniqueFlag = uniqueFlag == null ? null : uniqueFlag.trim();
    }

    /**
     * 
     * @return clustered_flag 
     */
    public String getClusteredFlag() {
        return clusteredFlag;
    }

    /**
     * 
     * @param clusteredFlag 
     */
    public void setClusteredFlag(String clusteredFlag) {
        this.clusteredFlag = clusteredFlag == null ? null : clusteredFlag.trim();
    }
}