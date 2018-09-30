package com.adtec.jfBuilder.entity;

public class EstRouteEntrance extends EstRouteEntranceKey {
    /**
     * 
     */
    private String entranceDesc;

    /**
     * 
     */
    private String matchExpression;

    /**
     * 
     */
    private String destDtaId;

    /**
     * 
     */
    private String destType;

    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String nodeId;

    /**
     * 
     */
    private String respFlag;

    /**
     * 
     */
    private String nodeSvcName;

    /**
     * 
     * @return entrance_desc 
     */
    public String getEntranceDesc() {
        return entranceDesc;
    }

    /**
     * 
     * @param entranceDesc 
     */
    public void setEntranceDesc(String entranceDesc) {
        this.entranceDesc = entranceDesc == null ? null : entranceDesc.trim();
    }

    /**
     * 
     * @return match_expression 
     */
    public String getMatchExpression() {
        return matchExpression;
    }

    /**
     * 
     * @param matchExpression 
     */
    public void setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression == null ? null : matchExpression.trim();
    }

    /**
     * 
     * @return dest_dta_id 
     */
    public String getDestDtaId() {
        return destDtaId;
    }

    /**
     * 
     * @param destDtaId 
     */
    public void setDestDtaId(String destDtaId) {
        this.destDtaId = destDtaId == null ? null : destDtaId.trim();
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
     * @return node_id 
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 
     * @param nodeId 
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    /**
     * 
     * @return resp_flag 
     */
    public String getRespFlag() {
        return respFlag;
    }

    /**
     * 
     * @param respFlag 
     */
    public void setRespFlag(String respFlag) {
        this.respFlag = respFlag == null ? null : respFlag.trim();
    }

    /**
     * 
     * @return node_svc_name 
     */
    public String getNodeSvcName() {
        return nodeSvcName;
    }

    /**
     * 
     * @param nodeSvcName 
     */
    public void setNodeSvcName(String nodeSvcName) {
        this.nodeSvcName = nodeSvcName == null ? null : nodeSvcName.trim();
    }
}