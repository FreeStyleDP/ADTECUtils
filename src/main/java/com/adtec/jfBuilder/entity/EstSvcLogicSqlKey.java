package com.adtec.jfBuilder.entity;

public class EstSvcLogicSqlKey {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String sqlId;

    /**
     * 
     * @return svc_id 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

    /**
     * 
     * @return sql_id 
     */
    public String getSqlId() {
        return sqlId;
    }

    /**
     * 
     * @param sqlId 
     */
    public void setSqlId(String sqlId) {
        this.sqlId = sqlId == null ? null : sqlId.trim();
    }
}