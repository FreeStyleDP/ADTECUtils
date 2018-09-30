package com.adtec.jfBuilder.entity;

public class EstDesignProcedureItemsKey {
    /**
     * 
     */
    private String procedureId;

    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     */
    private String subElemId;

    /**
     * 
     * @return procedure_id 
     */
    public String getProcedureId() {
        return procedureId;
    }

    /**
     * 
     * @param procedureId 
     */
    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId == null ? null : procedureId.trim();
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

    /**
     * 
     * @return sub_elem_id 
     */
    public String getSubElemId() {
        return subElemId;
    }

    /**
     * 
     * @param subElemId 
     */
    public void setSubElemId(String subElemId) {
        this.subElemId = subElemId == null ? null : subElemId.trim();
    }
}