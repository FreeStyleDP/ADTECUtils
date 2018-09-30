package com.adtec.jfBuilder.entity;

public class EstDebugElem extends EstDebugElemKey {
    /**
     * 
     */
    private String debugVal;

    /**
     * 
     */
    private Integer maxIndx;

    /**
     * 
     * @return debug_val 
     */
    public String getDebugVal() {
        return debugVal;
    }

    /**
     * 
     * @param debugVal 
     */
    public void setDebugVal(String debugVal) {
        this.debugVal = debugVal == null ? null : debugVal.trim();
    }

    /**
     * 
     * @return max_indx 
     */
    public Integer getMaxIndx() {
        return maxIndx;
    }

    /**
     * 
     * @param maxIndx 
     */
    public void setMaxIndx(Integer maxIndx) {
        this.maxIndx = maxIndx;
    }
}