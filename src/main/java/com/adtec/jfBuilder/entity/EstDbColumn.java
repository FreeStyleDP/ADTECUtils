package com.adtec.jfBuilder.entity;

public class EstDbColumn extends EstDbColumnKey {
    /**
     * 
     */
    private String colname;

    /**
     * 
     */
    private Short coltype;

    /**
     * 
     */
    private Short collength;

    /**
     * 
     * @return colname 
     */
    public String getColname() {
        return colname;
    }

    /**
     * 
     * @param colname 
     */
    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    /**
     * 
     * @return coltype 
     */
    public Short getColtype() {
        return coltype;
    }

    /**
     * 
     * @param coltype 
     */
    public void setColtype(Short coltype) {
        this.coltype = coltype;
    }

    /**
     * 
     * @return collength 
     */
    public Short getCollength() {
        return collength;
    }

    /**
     * 
     * @param collength 
     */
    public void setCollength(Short collength) {
        this.collength = collength;
    }
}