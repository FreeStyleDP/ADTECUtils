package com.adtec.jfBuilder.entity;

public class EstDrqSeqMng extends EstDrqSeqMngKey {
    /**
     * 
     */
    private String seqDesc;

    /**
     * 
     */
    private Integer minVal;

    /**
     * 
     */
    private Long maxVal;

    /**
     * 
     */
    private Integer seqStep;

    /**
     * 
     * @return seq_desc 
     */
    public String getSeqDesc() {
        return seqDesc;
    }

    /**
     * 
     * @param seqDesc 
     */
    public void setSeqDesc(String seqDesc) {
        this.seqDesc = seqDesc == null ? null : seqDesc.trim();
    }

    /**
     * 
     * @return min_val 
     */
    public Integer getMinVal() {
        return minVal;
    }

    /**
     * 
     * @param minVal 
     */
    public void setMinVal(Integer minVal) {
        this.minVal = minVal;
    }

    /**
     * 
     * @return max_val 
     */
    public Long getMaxVal() {
        return maxVal;
    }

    /**
     * 
     * @param maxVal 
     */
    public void setMaxVal(Long maxVal) {
        this.maxVal = maxVal;
    }

    /**
     * 
     * @return seq_step 
     */
    public Integer getSeqStep() {
        return seqStep;
    }

    /**
     * 
     * @param seqStep 
     */
    public void setSeqStep(Integer seqStep) {
        this.seqStep = seqStep;
    }
}