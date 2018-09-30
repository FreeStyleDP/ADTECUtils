package com.adtec.jfBuilder.entity;

public class EstDesignBusComp extends EstDesignBusCompKey {
    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     */
    private String busName;

    /**
     * 
     */
    private String busDesc;

    /**
     * 
     */
    private String designComment;

    /**
     * 
     */
    private String flag;

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
     * @return bus_name 
     */
    public String getBusName() {
        return busName;
    }

    /**
     * 
     * @param busName 
     */
    public void setBusName(String busName) {
        this.busName = busName == null ? null : busName.trim();
    }

    /**
     * 
     * @return bus_desc 
     */
    public String getBusDesc() {
        return busDesc;
    }

    /**
     * 
     * @param busDesc 
     */
    public void setBusDesc(String busDesc) {
        this.busDesc = busDesc == null ? null : busDesc.trim();
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
     * @return flag 
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * @param flag 
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}