package com.adtec.jfBuilder.entity;

import java.math.BigDecimal;

public class EstDebug {
    /**
     * 
     */
    private String unionId;

    /**
     * 
     */
    private String unionName;

    /**
     * 
     */
    private String unionDesc;

    /**
     * 
     */
    private Short shortDef;

    /**
     * 
     */
    private Integer intDef;

    /**
     * 
     */
    private Integer longDef;

    /**
     * 
     */
    private BigDecimal floatDef;

    /**
     * 
     */
    private BigDecimal doubleDef;

    /**
     * 
     */
    private String stringDef;

    /**
     * 
     */
    private String binaryDef;

    /**
     * 
     * @return union_id 
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 
     * @param unionId 
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    /**
     * 
     * @return union_name 
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 
     * @param unionName 
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 
     * @return union_desc 
     */
    public String getUnionDesc() {
        return unionDesc;
    }

    /**
     * 
     * @param unionDesc 
     */
    public void setUnionDesc(String unionDesc) {
        this.unionDesc = unionDesc == null ? null : unionDesc.trim();
    }

    /**
     * 
     * @return short_def 
     */
    public Short getShortDef() {
        return shortDef;
    }

    /**
     * 
     * @param shortDef 
     */
    public void setShortDef(Short shortDef) {
        this.shortDef = shortDef;
    }

    /**
     * 
     * @return int_def 
     */
    public Integer getIntDef() {
        return intDef;
    }

    /**
     * 
     * @param intDef 
     */
    public void setIntDef(Integer intDef) {
        this.intDef = intDef;
    }

    /**
     * 
     * @return long_def 
     */
    public Integer getLongDef() {
        return longDef;
    }

    /**
     * 
     * @param longDef 
     */
    public void setLongDef(Integer longDef) {
        this.longDef = longDef;
    }

    /**
     * 
     * @return float_def 
     */
    public BigDecimal getFloatDef() {
        return floatDef;
    }

    /**
     * 
     * @param floatDef 
     */
    public void setFloatDef(BigDecimal floatDef) {
        this.floatDef = floatDef;
    }

    /**
     * 
     * @return double_def 
     */
    public BigDecimal getDoubleDef() {
        return doubleDef;
    }

    /**
     * 
     * @param doubleDef 
     */
    public void setDoubleDef(BigDecimal doubleDef) {
        this.doubleDef = doubleDef;
    }

    /**
     * 
     * @return string_def 
     */
    public String getStringDef() {
        return stringDef;
    }

    /**
     * 
     * @param stringDef 
     */
    public void setStringDef(String stringDef) {
        this.stringDef = stringDef == null ? null : stringDef.trim();
    }

    /**
     * 
     * @return binary_def 
     */
    public String getBinaryDef() {
        return binaryDef;
    }

    /**
     * 
     * @param binaryDef 
     */
    public void setBinaryDef(String binaryDef) {
        this.binaryDef = binaryDef == null ? null : binaryDef.trim();
    }
}