package com.adtec.jfBuilder.entity;

public class EstSvcLogicCheck {
    /**
     * 
     */
    private String serviceId;

    /**
     * 
     */
    private String svcType;

    /**
     * 
     */
    private String ioGenre;

    /**
     * 
     */
    private String ioElemId;

    /**
     * 
     */
    private String elemId;

    /**
     * 
     */
    private String elemItemId;

    /**
     * 
     */
    private String chkType;

    /**
     * 
     */
    private String chkParm;

    /**
     * 
     */
    private String relElemItemId;

    /**
     * 
     */
    private String exceptionCodeId;

    /**
     * 
     * @return service_id 
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 
     * @param serviceId 
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    /**
     * 
     * @return svc_type 
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * 
     * @param svcType 
     */
    public void setSvcType(String svcType) {
        this.svcType = svcType == null ? null : svcType.trim();
    }

    /**
     * 
     * @return io_genre 
     */
    public String getIoGenre() {
        return ioGenre;
    }

    /**
     * 
     * @param ioGenre 
     */
    public void setIoGenre(String ioGenre) {
        this.ioGenre = ioGenre == null ? null : ioGenre.trim();
    }

    /**
     * 
     * @return io_elem_id 
     */
    public String getIoElemId() {
        return ioElemId;
    }

    /**
     * 
     * @param ioElemId 
     */
    public void setIoElemId(String ioElemId) {
        this.ioElemId = ioElemId == null ? null : ioElemId.trim();
    }

    /**
     * 
     * @return elem_id 
     */
    public String getElemId() {
        return elemId;
    }

    /**
     * 
     * @param elemId 
     */
    public void setElemId(String elemId) {
        this.elemId = elemId == null ? null : elemId.trim();
    }

    /**
     * 
     * @return elem_item_id 
     */
    public String getElemItemId() {
        return elemItemId;
    }

    /**
     * 
     * @param elemItemId 
     */
    public void setElemItemId(String elemItemId) {
        this.elemItemId = elemItemId == null ? null : elemItemId.trim();
    }

    /**
     * 
     * @return chk_type 
     */
    public String getChkType() {
        return chkType;
    }

    /**
     * 
     * @param chkType 
     */
    public void setChkType(String chkType) {
        this.chkType = chkType == null ? null : chkType.trim();
    }

    /**
     * 
     * @return chk_parm 
     */
    public String getChkParm() {
        return chkParm;
    }

    /**
     * 
     * @param chkParm 
     */
    public void setChkParm(String chkParm) {
        this.chkParm = chkParm == null ? null : chkParm.trim();
    }

    /**
     * 
     * @return rel_elem_item_id 
     */
    public String getRelElemItemId() {
        return relElemItemId;
    }

    /**
     * 
     * @param relElemItemId 
     */
    public void setRelElemItemId(String relElemItemId) {
        this.relElemItemId = relElemItemId == null ? null : relElemItemId.trim();
    }

    /**
     * 
     * @return exception_code_id 
     */
    public String getExceptionCodeId() {
        return exceptionCodeId;
    }

    /**
     * 
     * @param exceptionCodeId 
     */
    public void setExceptionCodeId(String exceptionCodeId) {
        this.exceptionCodeId = exceptionCodeId == null ? null : exceptionCodeId.trim();
    }
}