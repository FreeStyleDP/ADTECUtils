package com.adtec.jfBuilder.entity;

public class EstDbRouteEntrance extends EstDbRouteEntranceKey {
    /**
     * 
     */
    private String entranceDesc;

    /**
     * 
     */
    private String matchExpression;

    /**
     * 
     */
    private String datasrcMngId;

    /**
     * 
     * @return entrance_desc 
     */
    public String getEntranceDesc() {
        return entranceDesc;
    }

    /**
     * 
     * @param entranceDesc 
     */
    public void setEntranceDesc(String entranceDesc) {
        this.entranceDesc = entranceDesc == null ? null : entranceDesc.trim();
    }

    /**
     * 
     * @return match_expression 
     */
    public String getMatchExpression() {
        return matchExpression;
    }

    /**
     * 
     * @param matchExpression 
     */
    public void setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression == null ? null : matchExpression.trim();
    }

    /**
     * 
     * @return datasrc_mng_id 
     */
    public String getDatasrcMngId() {
        return datasrcMngId;
    }

    /**
     * 
     * @param datasrcMngId 
     */
    public void setDatasrcMngId(String datasrcMngId) {
        this.datasrcMngId = datasrcMngId == null ? null : datasrcMngId.trim();
    }
}