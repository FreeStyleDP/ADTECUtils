package com.adtec.jfBuilder.entity;

public class EstTestCombineSvcItemKey {
    /**
     * 
     */
    private String combineSvcId;

    /**
     * 
     */
    private String singleSvcId;

    /**
     * 
     */
    private Integer percent;

    /**
     * 
     * @return combine_svc_id 
     */
    public String getCombineSvcId() {
        return combineSvcId;
    }

    /**
     * 
     * @param combineSvcId 
     */
    public void setCombineSvcId(String combineSvcId) {
        this.combineSvcId = combineSvcId == null ? null : combineSvcId.trim();
    }

    /**
     * 
     * @return single_svc_id 
     */
    public String getSingleSvcId() {
        return singleSvcId;
    }

    /**
     * 
     * @param singleSvcId 
     */
    public void setSingleSvcId(String singleSvcId) {
        this.singleSvcId = singleSvcId == null ? null : singleSvcId.trim();
    }

    /**
     * 
     * @return percent 
     */
    public Integer getPercent() {
        return percent;
    }

    /**
     * 
     * @param percent 
     */
    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}