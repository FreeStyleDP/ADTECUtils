package com.adtec.jfBuilder.entity;

public class EstCom extends EstComKey {
    /**
     * 
     */
    private String typeDesc;

    /**
     * 
     */
    private String custLib;

    /**
     * 
     */
    private String linkRule;

    /**
     * 
     * @return type_desc 
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * 
     * @param typeDesc 
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    /**
     * 
     * @return cust_lib 
     */
    public String getCustLib() {
        return custLib;
    }

    /**
     * 
     * @param custLib 
     */
    public void setCustLib(String custLib) {
        this.custLib = custLib == null ? null : custLib.trim();
    }

    /**
     * 
     * @return link_rule 
     */
    public String getLinkRule() {
        return linkRule;
    }

    /**
     * 
     * @param linkRule 
     */
    public void setLinkRule(String linkRule) {
        this.linkRule = linkRule == null ? null : linkRule.trim();
    }
}