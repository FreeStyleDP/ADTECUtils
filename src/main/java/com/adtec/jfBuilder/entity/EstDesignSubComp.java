package com.adtec.jfBuilder.entity;

public class EstDesignSubComp extends EstDesignSubCompKey {
    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     */
    private String subBusName;

    /**
     * 
     */
    private String subBusDesc;

    /**
     * 
     */
    private String designComment;

    /**
     * 
     */
    private String relateBusId;

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
     * @return sub_bus_name 
     */
    public String getSubBusName() {
        return subBusName;
    }

    /**
     * 
     * @param subBusName 
     */
    public void setSubBusName(String subBusName) {
        this.subBusName = subBusName == null ? null : subBusName.trim();
    }

    /**
     * 
     * @return sub_bus_desc 
     */
    public String getSubBusDesc() {
        return subBusDesc;
    }

    /**
     * 
     * @param subBusDesc 
     */
    public void setSubBusDesc(String subBusDesc) {
        this.subBusDesc = subBusDesc == null ? null : subBusDesc.trim();
    }

    /**
     * 
     * @return design_comment 
     */
    public String getDesignComment() {
        return designComment;
    }

    /**
     * 
     * @param designComment 
     */
    public void setDesignComment(String designComment) {
        this.designComment = designComment == null ? null : designComment.trim();
    }

    /**
     * 
     * @return relate_bus_id 
     */
    public String getRelateBusId() {
        return relateBusId;
    }

    /**
     * 
     * @param relateBusId 
     */
    public void setRelateBusId(String relateBusId) {
        this.relateBusId = relateBusId == null ? null : relateBusId.trim();
    }
}