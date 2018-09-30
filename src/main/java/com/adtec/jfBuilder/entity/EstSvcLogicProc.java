package com.adtec.jfBuilder.entity;

public class EstSvcLogicProc extends EstSvcLogicProcKey {
    /**
     * 
     */
    private Short stepFlag;

    /**
     * 
     */
    private String stepProc;

    /**
     * 
     */
    private Short compsFlag;

    /**
     * 
     */
    private Short ignoreFlag;

    /**
     * 
     */
    private Short maxSynNum;

    /**
     * 
     */
    private Short maxAsynNum;

    /**
     * 
     */
    private String compsInitProc;

    /**
     * 
     */
    private String compsEndProc;

    /**
     * 
     */
    private String befProc;

    /**
     * 
     */
    private String aftProc;

    /**
     * 
     */
    private String failProc;

    /**
     * 
     * @return step_flag 
     */
    public Short getStepFlag() {
        return stepFlag;
    }

    /**
     * 
     * @param stepFlag 
     */
    public void setStepFlag(Short stepFlag) {
        this.stepFlag = stepFlag;
    }

    /**
     * 
     * @return step_proc 
     */
    public String getStepProc() {
        return stepProc;
    }

    /**
     * 
     * @param stepProc 
     */
    public void setStepProc(String stepProc) {
        this.stepProc = stepProc == null ? null : stepProc.trim();
    }

    /**
     * 
     * @return comps_flag 
     */
    public Short getCompsFlag() {
        return compsFlag;
    }

    /**
     * 
     * @param compsFlag 
     */
    public void setCompsFlag(Short compsFlag) {
        this.compsFlag = compsFlag;
    }

    /**
     * 
     * @return ignore_flag 
     */
    public Short getIgnoreFlag() {
        return ignoreFlag;
    }

    /**
     * 
     * @param ignoreFlag 
     */
    public void setIgnoreFlag(Short ignoreFlag) {
        this.ignoreFlag = ignoreFlag;
    }

    /**
     * 
     * @return max_syn_num 
     */
    public Short getMaxSynNum() {
        return maxSynNum;
    }

    /**
     * 
     * @param maxSynNum 
     */
    public void setMaxSynNum(Short maxSynNum) {
        this.maxSynNum = maxSynNum;
    }

    /**
     * 
     * @return max_asyn_num 
     */
    public Short getMaxAsynNum() {
        return maxAsynNum;
    }

    /**
     * 
     * @param maxAsynNum 
     */
    public void setMaxAsynNum(Short maxAsynNum) {
        this.maxAsynNum = maxAsynNum;
    }

    /**
     * 
     * @return comps_init_proc 
     */
    public String getCompsInitProc() {
        return compsInitProc;
    }

    /**
     * 
     * @param compsInitProc 
     */
    public void setCompsInitProc(String compsInitProc) {
        this.compsInitProc = compsInitProc == null ? null : compsInitProc.trim();
    }

    /**
     * 
     * @return comps_end_proc 
     */
    public String getCompsEndProc() {
        return compsEndProc;
    }

    /**
     * 
     * @param compsEndProc 
     */
    public void setCompsEndProc(String compsEndProc) {
        this.compsEndProc = compsEndProc == null ? null : compsEndProc.trim();
    }

    /**
     * 
     * @return bef_proc 
     */
    public String getBefProc() {
        return befProc;
    }

    /**
     * 
     * @param befProc 
     */
    public void setBefProc(String befProc) {
        this.befProc = befProc == null ? null : befProc.trim();
    }

    /**
     * 
     * @return aft_proc 
     */
    public String getAftProc() {
        return aftProc;
    }

    /**
     * 
     * @param aftProc 
     */
    public void setAftProc(String aftProc) {
        this.aftProc = aftProc == null ? null : aftProc.trim();
    }

    /**
     * 
     * @return fail_proc 
     */
    public String getFailProc() {
        return failProc;
    }

    /**
     * 
     * @param failProc 
     */
    public void setFailProc(String failProc) {
        this.failProc = failProc == null ? null : failProc.trim();
    }
}