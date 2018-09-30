package com.adtec.jfBuilder.entity;

public class EstDesignSvcDependon {
    /**
     * 
     */
    private Integer seqNo;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String srcType;

    /**
     * 
     */
    private String srcId;

    /**
     * 
     */
    private String srcSvcId;

    /**
     * 
     */
    private String destType;

    /**
     * 
     */
    private String destId;

    /**
     * 
     */
    private String destSvcId;

    /**
     * 
     */
    private String remark;

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
     * @return project_id 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 
     * @return src_type 
     */
    public String getSrcType() {
        return srcType;
    }

    /**
     * 
     * @param srcType 
     */
    public void setSrcType(String srcType) {
        this.srcType = srcType == null ? null : srcType.trim();
    }

    /**
     * 
     * @return src_id 
     */
    public String getSrcId() {
        return srcId;
    }

    /**
     * 
     * @param srcId 
     */
    public void setSrcId(String srcId) {
        this.srcId = srcId == null ? null : srcId.trim();
    }

    /**
     * 
     * @return src_svc_id 
     */
    public String getSrcSvcId() {
        return srcSvcId;
    }

    /**
     * 
     * @param srcSvcId 
     */
    public void setSrcSvcId(String srcSvcId) {
        this.srcSvcId = srcSvcId == null ? null : srcSvcId.trim();
    }

    /**
     * 
     * @return dest_type 
     */
    public String getDestType() {
        return destType;
    }

    /**
     * 
     * @param destType 
     */
    public void setDestType(String destType) {
        this.destType = destType == null ? null : destType.trim();
    }

    /**
     * 
     * @return dest_id 
     */
    public String getDestId() {
        return destId;
    }

    /**
     * 
     * @param destId 
     */
    public void setDestId(String destId) {
        this.destId = destId == null ? null : destId.trim();
    }

    /**
     * 
     * @return dest_svc_id 
     */
    public String getDestSvcId() {
        return destSvcId;
    }

    /**
     * 
     * @param destSvcId 
     */
    public void setDestSvcId(String destSvcId) {
        this.destSvcId = destSvcId == null ? null : destSvcId.trim();
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}