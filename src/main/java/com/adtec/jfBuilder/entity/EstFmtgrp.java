package com.adtec.jfBuilder.entity;

public class EstFmtgrp extends EstFmtgrpKey {
    /**
     * 
     */
    private String mfmt;

    /**
     * 
     */
    private String efmt;

    /**
     * 
     */
    private String retCycle;

    /**
     * 
     */
    private String cycle;

    /**
     * 
     */
    private String cycleCond;

    /**
     * 
     */
    private String efmtCond;

    /**
     * 
     * @return mfmt 
     */
    public String getMfmt() {
        return mfmt;
    }

    /**
     * 
     * @param mfmt 
     */
    public void setMfmt(String mfmt) {
        this.mfmt = mfmt == null ? null : mfmt.trim();
    }

    /**
     * 
     * @return efmt 
     */
    public String getEfmt() {
        return efmt;
    }

    /**
     * 
     * @param efmt 
     */
    public void setEfmt(String efmt) {
        this.efmt = efmt == null ? null : efmt.trim();
    }

    /**
     * 
     * @return ret_cycle 
     */
    public String getRetCycle() {
        return retCycle;
    }

    /**
     * 
     * @param retCycle 
     */
    public void setRetCycle(String retCycle) {
        this.retCycle = retCycle == null ? null : retCycle.trim();
    }

    /**
     * 
     * @return cycle 
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * 
     * @param cycle 
     */
    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    /**
     * 
     * @return cycle_cond 
     */
    public String getCycleCond() {
        return cycleCond;
    }

    /**
     * 
     * @param cycleCond 
     */
    public void setCycleCond(String cycleCond) {
        this.cycleCond = cycleCond == null ? null : cycleCond.trim();
    }

    /**
     * 
     * @return efmt_cond 
     */
    public String getEfmtCond() {
        return efmtCond;
    }

    /**
     * 
     * @param efmtCond 
     */
    public void setEfmtCond(String efmtCond) {
        this.efmtCond = efmtCond == null ? null : efmtCond.trim();
    }
}