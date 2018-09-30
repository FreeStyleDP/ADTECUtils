package com.adtec.jfBuilder.entity;

public class EstDesignRelateSublistColumn extends EstDesignRelateSublistColumnKey {
    /**
     * 
     */
    private String columnRename;

    /**
     * 
     * @return column_rename 
     */
    public String getColumnRename() {
        return columnRename;
    }

    /**
     * 
     * @param columnRename 
     */
    public void setColumnRename(String columnRename) {
        this.columnRename = columnRename == null ? null : columnRename.trim();
    }
}