package com.adtec.jfBuilder.entity;

public class EstDbSql extends EstDbSqlKey {
    /**
     * 
     */
    private String sqlStatm;

    /**
     * 
     * @return sql_statm 
     */
    public String getSqlStatm() {
        return sqlStatm;
    }

    /**
     * 
     * @param sqlStatm 
     */
    public void setSqlStatm(String sqlStatm) {
        this.sqlStatm = sqlStatm == null ? null : sqlStatm.trim();
    }
}