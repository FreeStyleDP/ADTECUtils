package com.adtec.jfBuilder.entity;

public class EstNode extends EstNodeKey {
    /**
     * 
     */
    private String nodeId;

    /**
     * 
     */
    private String nodeDesc;

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
     * @return node_desc 
     */
    public String getNodeDesc() {
        return nodeDesc;
    }

    /**
     * 
     * @param nodeDesc 
     */
    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc == null ? null : nodeDesc.trim();
    }
}