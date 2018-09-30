package com.adtec.jfBuilder.entity;

public class EstDesignRelateSublistKey {
    /**
     * 
     */
    private String viewId;

    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     * @return view_id 
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * 
     * @param viewId 
     */
    public void setViewId(String viewId) {
        this.viewId = viewId == null ? null : viewId.trim();
    }

    /**
     * 
     * @return seq_no 
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 
     * @param seqNo 
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
}