package com.adtec.jfBuilder.entity;

public class EstCmdConfig {
    /**
     * 
     */
    private String adapterName;

    /**
     * 
     */
    private String startCmd;

    /**
     * 
     */
    private String stopCmd;

    /**
     * 
     * @return adapter_name 
     */
    public String getAdapterName() {
        return adapterName;
    }

    /**
     * 
     * @param adapterName 
     */
    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName == null ? null : adapterName.trim();
    }

    /**
     * 
     * @return start_cmd 
     */
    public String getStartCmd() {
        return startCmd;
    }

    /**
     * 
     * @param startCmd 
     */
    public void setStartCmd(String startCmd) {
        this.startCmd = startCmd == null ? null : startCmd.trim();
    }

    /**
     * 
     * @return stop_cmd 
     */
    public String getStopCmd() {
        return stopCmd;
    }

    /**
     * 
     * @param stopCmd 
     */
    public void setStopCmd(String stopCmd) {
        this.stopCmd = stopCmd == null ? null : stopCmd.trim();
    }
}