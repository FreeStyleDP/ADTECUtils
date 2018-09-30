package com.adtec.jfBuilder.entity;

public class EstDtaMchnMng extends EstDtaMchnMngKey {
    /**
     * 
     */
    private String cmdParm;

    /**
     * 
     */
    private Integer instNum;

    /**
     * 
     */
    private Integer maxInst;

    /**
     * 
     */
    private String ipAddr;

    /**
     * 
     */
    private Integer sendInst;

    /**
     * 
     */
    private Integer recvInst;

    /**
     * 
     */
    private String groupId;

    /**
     * 
     */
    private Integer instControl;

    /**
     * 
     * @return cmd_parm 
     */
    public String getCmdParm() {
        return cmdParm;
    }

    /**
     * 
     * @param cmdParm 
     */
    public void setCmdParm(String cmdParm) {
        this.cmdParm = cmdParm == null ? null : cmdParm.trim();
    }

    /**
     * 
     * @return inst_num 
     */
    public Integer getInstNum() {
        return instNum;
    }

    /**
     * 
     * @param instNum 
     */
    public void setInstNum(Integer instNum) {
        this.instNum = instNum;
    }

    /**
     * 
     * @return max_inst 
     */
    public Integer getMaxInst() {
        return maxInst;
    }

    /**
     * 
     * @param maxInst 
     */
    public void setMaxInst(Integer maxInst) {
        this.maxInst = maxInst;
    }

    /**
     * 
     * @return ip_addr 
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * 
     * @param ipAddr 
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    /**
     * 
     * @return send_inst 
     */
    public Integer getSendInst() {
        return sendInst;
    }

    /**
     * 
     * @param sendInst 
     */
    public void setSendInst(Integer sendInst) {
        this.sendInst = sendInst;
    }

    /**
     * 
     * @return recv_inst 
     */
    public Integer getRecvInst() {
        return recvInst;
    }

    /**
     * 
     * @param recvInst 
     */
    public void setRecvInst(Integer recvInst) {
        this.recvInst = recvInst;
    }

    /**
     * 
     * @return group_id 
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * 
     * @return inst_control 
     */
    public Integer getInstControl() {
        return instControl;
    }

    /**
     * 
     * @param instControl 
     */
    public void setInstControl(Integer instControl) {
        this.instControl = instControl;
    }
}