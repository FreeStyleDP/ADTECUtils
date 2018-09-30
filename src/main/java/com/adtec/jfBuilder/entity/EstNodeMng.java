package com.adtec.jfBuilder.entity;

public class EstNodeMng extends EstNodeMngKey {
    /**
     * 
     */
    private String nodeIp;

    /**
     * 
     */
    private String nodePort;

    /**
     * 
     */
    private Short maxConn;

    /**
     * 
     */
    private String nodeFsrvIp;

    /**
     * 
     */
    private Short nodeFsrvPort;

    /**
     * 
     */
    private String nodeFuser;

    /**
     * 
     */
    private String nodeFpass;

    /**
     * 
     */
    private String urlType;

    /**
     * 
     */
    private String urlStr;

    /**
     * 
     * @return node_ip 
     */
    public String getNodeIp() {
        return nodeIp;
    }

    /**
     * 
     * @param nodeIp 
     */
    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp == null ? null : nodeIp.trim();
    }

    /**
     * 
     * @return node_port 
     */
    public String getNodePort() {
        return nodePort;
    }

    /**
     * 
     * @param nodePort 
     */
    public void setNodePort(String nodePort) {
        this.nodePort = nodePort == null ? null : nodePort.trim();
    }

    /**
     * 
     * @return max_conn 
     */
    public Short getMaxConn() {
        return maxConn;
    }

    /**
     * 
     * @param maxConn 
     */
    public void setMaxConn(Short maxConn) {
        this.maxConn = maxConn;
    }

    /**
     * 
     * @return node_fsrv_ip 
     */
    public String getNodeFsrvIp() {
        return nodeFsrvIp;
    }

    /**
     * 
     * @param nodeFsrvIp 
     */
    public void setNodeFsrvIp(String nodeFsrvIp) {
        this.nodeFsrvIp = nodeFsrvIp == null ? null : nodeFsrvIp.trim();
    }

    /**
     * 
     * @return node_fsrv_port 
     */
    public Short getNodeFsrvPort() {
        return nodeFsrvPort;
    }

    /**
     * 
     * @param nodeFsrvPort 
     */
    public void setNodeFsrvPort(Short nodeFsrvPort) {
        this.nodeFsrvPort = nodeFsrvPort;
    }

    /**
     * 
     * @return node_fuser 
     */
    public String getNodeFuser() {
        return nodeFuser;
    }

    /**
     * 
     * @param nodeFuser 
     */
    public void setNodeFuser(String nodeFuser) {
        this.nodeFuser = nodeFuser == null ? null : nodeFuser.trim();
    }

    /**
     * 
     * @return node_fpass 
     */
    public String getNodeFpass() {
        return nodeFpass;
    }

    /**
     * 
     * @param nodeFpass 
     */
    public void setNodeFpass(String nodeFpass) {
        this.nodeFpass = nodeFpass == null ? null : nodeFpass.trim();
    }

    /**
     * 
     * @return url_type 
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * 
     * @param urlType 
     */
    public void setUrlType(String urlType) {
        this.urlType = urlType == null ? null : urlType.trim();
    }

    /**
     * 
     * @return url_str 
     */
    public String getUrlStr() {
        return urlStr;
    }

    /**
     * 
     * @param urlStr 
     */
    public void setUrlStr(String urlStr) {
        this.urlStr = urlStr == null ? null : urlStr.trim();
    }
}