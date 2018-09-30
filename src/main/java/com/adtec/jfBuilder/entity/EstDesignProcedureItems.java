package com.adtec.jfBuilder.entity;

public class EstDesignProcedureItems extends EstDesignProcedureItemsKey {
    /**
     * 
     */
    private String inOutType;

    /**
     * 
     */
    private String jdbcType;

    /**
     * 
     * @return in_out_type 
     */
    public String getInOutType() {
        return inOutType;
    }

    /**
     * 
     * @param inOutType 
     */
    public void setInOutType(String inOutType) {
        this.inOutType = inOutType == null ? null : inOutType.trim();
    }

    /**
     * 
     * @return jdbc_type 
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * 
     * @param jdbcType 
     */
    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType == null ? null : jdbcType.trim();
    }
}