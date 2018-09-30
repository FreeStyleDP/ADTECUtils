package com.adtec.jfBuilder.entity;

public class EstFsrvMngKey {
    /**
     * 
     */
    private String fsrvId;

    /**
     * 
     */
    private String mchnId;

    /**
     * 
     * @return fsrv_id 
     */
    public String getFsrvId() {
        return fsrvId;
    }

    /**
     * 
     * @param fsrvId 
     */
    public void setFsrvId(String fsrvId) {
        this.fsrvId = fsrvId == null ? null : fsrvId.trim();
    }

    /**
     * 
     * @return mchn_id 
     */
    public String getMchnId() {
        return mchnId;
    }

    /**
     * 
     * @param mchnId 
     */
    public void setMchnId(String mchnId) {
        this.mchnId = mchnId == null ? null : mchnId.trim();
    }
}