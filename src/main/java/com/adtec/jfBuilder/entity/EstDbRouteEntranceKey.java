package com.adtec.jfBuilder.entity;

public class EstDbRouteEntranceKey {
    /**
     * 
     */
    private String dbRuleId;

    /**
     * 
     */
    private Short serialNo;

    /**
     * 
     * @return db_rule_id 
     */
    public String getDbRuleId() {
        return dbRuleId;
    }

    /**
     * 
     * @param dbRuleId 
     */
    public void setDbRuleId(String dbRuleId) {
        this.dbRuleId = dbRuleId == null ? null : dbRuleId.trim();
    }

    /**
     * 
     * @return serial_no 
     */
    public Short getSerialNo() {
        return serialNo;
    }

    /**
     * 
     * @param serialNo 
     */
    public void setSerialNo(Short serialNo) {
        this.serialNo = serialNo;
    }
}