package com.adtec.jfBuilder.entity;

public class EstEnumValue {
    /**
     * 
     */
    private String enumItemId;

    /**
     * 
     */
    private String enumId;

    /**
     * 
     */
    private Short seqNo;

    /**
     * 
     */
    private String enumKey;

    /**
     * 
     */
    private String enumVal;

    /**
     * 
     */
    private String defVal;

    /**
     * 
     * @return enum_item_id 
     */
    public String getEnumItemId() {
        return enumItemId;
    }

    /**
     * 
     * @param enumItemId 
     */
    public void setEnumItemId(String enumItemId) {
        this.enumItemId = enumItemId == null ? null : enumItemId.trim();
    }

    /**
     * 
     * @return enum_id 
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * 
     * @param enumId 
     */
    public void setEnumId(String enumId) {
        this.enumId = enumId == null ? null : enumId.trim();
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

    /**
     * 
     * @return enum_key 
     */
    public String getEnumKey() {
        return enumKey;
    }

    /**
     * 
     * @param enumKey 
     */
    public void setEnumKey(String enumKey) {
        this.enumKey = enumKey == null ? null : enumKey.trim();
    }

    /**
     * 
     * @return enum_val 
     */
    public String getEnumVal() {
        return enumVal;
    }

    /**
     * 
     * @param enumVal 
     */
    public void setEnumVal(String enumVal) {
        this.enumVal = enumVal == null ? null : enumVal.trim();
    }

    /**
     * 
     * @return def_val 
     */
    public String getDefVal() {
        return defVal;
    }

    /**
     * 
     * @param defVal 
     */
    public void setDefVal(String defVal) {
        this.defVal = defVal == null ? null : defVal.trim();
    }
}