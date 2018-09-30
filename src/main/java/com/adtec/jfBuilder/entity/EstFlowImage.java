package com.adtec.jfBuilder.entity;

public class EstFlowImage {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private byte[] flowImage;

    /**
     * 
     */
    private byte[] flowJpgImage;

    /**
     * 
     */
    private byte[] flowDiagramImage;

    /**
     * 
     * @return svc_id 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

    /**
     * 
     * @return flow_image 
     */
    public byte[] getFlowImage() {
        return flowImage;
    }

    /**
     * 
     * @param flowImage 
     */
    public void setFlowImage(byte[] flowImage) {
        this.flowImage = flowImage;
    }

    /**
     * 
     * @return flow_jpg_image 
     */
    public byte[] getFlowJpgImage() {
        return flowJpgImage;
    }

    /**
     * 
     * @param flowJpgImage 
     */
    public void setFlowJpgImage(byte[] flowJpgImage) {
        this.flowJpgImage = flowJpgImage;
    }

    /**
     * 
     * @return flow_diagram_image 
     */
    public byte[] getFlowDiagramImage() {
        return flowDiagramImage;
    }

    /**
     * 
     * @param flowDiagramImage 
     */
    public void setFlowDiagramImage(byte[] flowDiagramImage) {
        this.flowDiagramImage = flowDiagramImage;
    }
}