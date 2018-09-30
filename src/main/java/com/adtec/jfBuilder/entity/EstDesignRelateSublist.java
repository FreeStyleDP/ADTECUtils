package com.adtec.jfBuilder.entity;

public class EstDesignRelateSublist extends EstDesignRelateSublistKey {
    /**
     * 
     */
    private String tableId;

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
}