package com.adtec.jfBuilder.entity;

public class EstDesignIndexColumnKey {
    /**
     * 
     */
    private String tableId;

    /**
     * 
     */
    private String indexId;

    /**
     * 
     */
    private String columnId;

    /**
     * 
     */
    private Integer seqNo;

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
     * @return column_id 
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 
     * @param columnId 
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId == null ? null : columnId.trim();
    }

    /**
     * 
     * @return seq_no 
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 
     * @param seqNo 
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
}