package com.adtec.jfBuilder.entity;

public class EstRouteRuleKey {
    /**
     * 
     */
    private String srcDtaId;

    /**
     * 
     */
    private String ruleId;

    /**
     * 
     * @return src_dta_id 
     */
    public String getSrcDtaId() {
        return srcDtaId;
    }

    /**
     * 
     * @param srcDtaId 
     */
    public void setSrcDtaId(String srcDtaId) {
        this.srcDtaId = srcDtaId == null ? null : srcDtaId.trim();
    }

    /**
     * 
     * @return rule_id 
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 
     * @param ruleId 
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }
}