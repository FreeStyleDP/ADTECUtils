package com.adtec.jfBuilder.entity;

public class EstDtaStackKey {
    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     * @return dta_id 
     */
    public String getDtaId() {
        return dtaId;
    }

    /**
     * 
     * @param dtaId 
     */
    public void setDtaId(String dtaId) {
        this.dtaId = dtaId == null ? null : dtaId.trim();
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