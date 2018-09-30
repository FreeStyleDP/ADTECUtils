package com.adtec.jfBuilder.entity;

public class EstCodeKey {
    /**
     * 
     */
    private String tableName;

    /**
     * 
     */
    private String fieldName;

    /**
     * 
     */
    private String fieldValue;

    /**
     * 
     * @return table_name 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName 
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 
     * @return field_name 
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 
     * @param fieldName 
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * 
     * @return field_value 
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * 
     * @param fieldValue 
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue == null ? null : fieldValue.trim();
    }
}