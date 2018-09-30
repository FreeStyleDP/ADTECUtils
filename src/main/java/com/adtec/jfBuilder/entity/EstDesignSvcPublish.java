package com.adtec.jfBuilder.entity;

public class EstDesignSvcPublish {
    /**
     * 
     */
    private String svcPublishId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String subBusId;

    /**
     * 
     */
    private String srcSvcId;

    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private String svcName;

    /**
     * 
     * @return svc_publish_id 
     */
    public String getSvcPublishId() {
        return svcPublishId;
    }

    /**
     * 
     * @param svcPublishId 
     */
    public void setSvcPublishId(String svcPublishId) {
        this.svcPublishId = svcPublishId == null ? null : svcPublishId.trim();
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
     * @return sub_bus_id 
     */
    public String getSubBusId() {
        return subBusId;
    }

    /**
     * 
     * @param subBusId 
     */
    public void setSubBusId(String subBusId) {
        this.subBusId = subBusId == null ? null : subBusId.trim();
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
     * @return svc_name 
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * 
     * @param svcName 
     */
    public void setSvcName(String svcName) {
        this.svcName = svcName == null ? null : svcName.trim();
    }
}