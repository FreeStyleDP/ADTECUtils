package com.adtec.jfBuilder.entity;

public class EstDesignTableColumn {
    /**
     * 
     */
    private String columnId;

    /**
     * 
     */
    private String tableId;

    /**
     * 
     */
    private String chineseName;

    /**
     * 
     */
    private String columnName;

    /**
     * 
     */
    private String typeFlag;

    /**
     * 
     */
    private String lenStr;

    /**
     * 
     */
    private String nullFlag;

    /**
     * 
     */
    private String defalutStr;

    /**
     * 
     */
    private String primarykeyFlag;

    /**
     * 
     */
    private String foreginkeyTableName;

    /**
     * 
     */
    private String columnDesc;

    /**
     * 
     */
    private String columnRangeExpr;

    /**
     * 
     */
    private Integer seqNo;

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
     * @return chinese_name 
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 
     * @param chineseName 
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * 
     * @return column_name 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName 
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * 
     * @return type_flag 
     */
    public String getTypeFlag() {
        return typeFlag;
    }

    /**
     * 
     * @param typeFlag 
     */
    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag == null ? null : typeFlag.trim();
    }

    /**
     * 
     * @return len_str 
     */
    public String getLenStr() {
        return lenStr;
    }

    /**
     * 
     * @param lenStr 
     */
    public void setLenStr(String lenStr) {
        this.lenStr = lenStr == null ? null : lenStr.trim();
    }

    /**
     * 
     * @return null_flag 
     */
    public String getNullFlag() {
        return nullFlag;
    }

    /**
     * 
     * @param nullFlag 
     */
    public void setNullFlag(String nullFlag) {
        this.nullFlag = nullFlag == null ? null : nullFlag.trim();
    }

    /**
     * 
     * @return defalut_str 
     */
    public String getDefalutStr() {
        return defalutStr;
    }

    /**
     * 
     * @param defalutStr 
     */
    public void setDefalutStr(String defalutStr) {
        this.defalutStr = defalutStr == null ? null : defalutStr.trim();
    }

    /**
     * 
     * @return primarykey_flag 
     */
    public String getPrimarykeyFlag() {
        return primarykeyFlag;
    }

    /**
     * 
     * @param primarykeyFlag 
     */
    public void setPrimarykeyFlag(String primarykeyFlag) {
        this.primarykeyFlag = primarykeyFlag == null ? null : primarykeyFlag.trim();
    }

    /**
     * 
     * @return foreginkey_table_name 
     */
    public String getForeginkeyTableName() {
        return foreginkeyTableName;
    }

    /**
     * 
     * @param foreginkeyTableName 
     */
    public void setForeginkeyTableName(String foreginkeyTableName) {
        this.foreginkeyTableName = foreginkeyTableName == null ? null : foreginkeyTableName.trim();
    }

    /**
     * 
     * @return column_desc 
     */
    public String getColumnDesc() {
        return columnDesc;
    }

    /**
     * 
     * @param columnDesc 
     */
    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc == null ? null : columnDesc.trim();
    }

    /**
     * 
     * @return column_range_expr 
     */
    public String getColumnRangeExpr() {
        return columnRangeExpr;
    }

    /**
     * 
     * @param columnRangeExpr 
     */
    public void setColumnRangeExpr(String columnRangeExpr) {
        this.columnRangeExpr = columnRangeExpr == null ? null : columnRangeExpr.trim();
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