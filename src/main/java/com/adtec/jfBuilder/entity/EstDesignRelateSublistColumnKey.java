package com.adtec.jfBuilder.entity;

public class EstDesignRelateSublistColumnKey {
    /**
     * 
     */
    private String viewId;

    /**
     * 
     */
    private String tableId;

    /**
     * 
     */
    private String columnId;

    /**
     * 
     * @return view_id 
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * 
     * @param viewId 
     */
    public void setViewId(String viewId) {
        this.viewId = viewId == null ? null : viewId.trim();
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
}