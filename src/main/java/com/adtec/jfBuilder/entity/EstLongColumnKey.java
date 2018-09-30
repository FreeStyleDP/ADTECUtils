package com.adtec.jfBuilder.entity;

public class EstLongColumnKey {
    /**
     * 
     */
    private String objId;

    /**
     * 
     */
    private String objType;

    /**
     * 
     */
    private String columnName;

    /**
     * 
     */
    private String seqNo;

    /**
     * 
     * @return obj_id 
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 
     * @param objId 
     */
    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    /**
     * 
     * @return obj_type 
     */
    public String getObjType() {
        return objType;
    }

    /**
     * 
     * @param objType 
     */
    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
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
     * @return seq_no 
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 
     * @param seqNo 
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }
}