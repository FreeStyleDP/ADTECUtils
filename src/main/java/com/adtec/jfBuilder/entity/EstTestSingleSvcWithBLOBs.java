package com.adtec.jfBuilder.entity;

public class EstTestSingleSvcWithBLOBs extends EstTestSingleSvc {
    /**
     * 
     */
    private byte[] dataXml;

    /**
     * 
     */
    private byte[] inMsg;

    /**
     * 
     */
    private byte[] outMsg;

    /**
     * 
     * @return data_xml 
     */
    public byte[] getDataXml() {
        return dataXml;
    }

    /**
     * 
     * @param dataXml 
     */
    public void setDataXml(byte[] dataXml) {
        this.dataXml = dataXml;
    }

    /**
     * 
     * @return in_msg 
     */
    public byte[] getInMsg() {
        return inMsg;
    }

    /**
     * 
     * @param inMsg 
     */
    public void setInMsg(byte[] inMsg) {
        this.inMsg = inMsg;
    }

    /**
     * 
     * @return out_msg 
     */
    public byte[] getOutMsg() {
        return outMsg;
    }

    /**
     * 
     * @param outMsg 
     */
    public void setOutMsg(byte[] outMsg) {
        this.outMsg = outMsg;
    }
}