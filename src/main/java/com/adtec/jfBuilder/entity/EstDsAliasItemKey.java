package com.adtec.jfBuilder.entity;

public class EstDsAliasItemKey {
    /**
     * 
     */
    private String dsId;

    /**
     * 
     */
    private String datasrcMngId;

    /**
     * 
     */
    private String envId;

    /**
     * 
     * @return ds_id 
     */
    public String getDsId() {
        return dsId;
    }

    /**
     * 
     * @param dsId 
     */
    public void setDsId(String dsId) {
        this.dsId = dsId == null ? null : dsId.trim();
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

    /**
     * 
     * @return env_id 
     */
    public String getEnvId() {
        return envId;
    }

    /**
     * 
     * @param envId 
     */
    public void setEnvId(String envId) {
        this.envId = envId == null ? null : envId.trim();
    }
}