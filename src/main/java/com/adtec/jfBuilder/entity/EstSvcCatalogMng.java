package com.adtec.jfBuilder.entity;

public class EstSvcCatalogMng extends EstSvcCatalogMngKey {
    /**
     * 
     */
    private String svcIp;

    /**
     * 
     */
    private String svcPort;

    /**
     * 
     * @return svc_ip 
     */
    public String getSvcIp() {
        return svcIp;
    }

    /**
     * 
     * @param svcIp 
     */
    public void setSvcIp(String svcIp) {
        this.svcIp = svcIp == null ? null : svcIp.trim();
    }

    /**
     * 
     * @return svc_port 
     */
    public String getSvcPort() {
        return svcPort;
    }

    /**
     * 
     * @param svcPort 
     */
    public void setSvcPort(String svcPort) {
        this.svcPort = svcPort == null ? null : svcPort.trim();
    }
}