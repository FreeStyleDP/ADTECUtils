package com.adtec.jfBuilder.entity;

public class EstBus extends EstBusKey {
    /**
     * 
     */
    private String busName;

    /**
     * 
     */
    private String busDesc;

    /**
     * 
     */
    private String evtSvcBefore;

    /**
     * 
     */
    private String evtSvcAfter;

    /**
     * 
     */
    private String evtSvcFailed;

    /**
     * 
     */
    private String evtSvcEnd;

    /**
     * 
     */
    private String grpId;

    /**
     * 
     */
    private String crtUser;

    /**
     * 
     */
    private String crtDateTime;

    /**
     * 
     */
    private String lstModUser;

    /**
     * 
     */
    private String lstModDateTime;

    /**
     * 
     */
    private String clientLib;

    /**
     * 
     */
    private String libFunc;

    /**
     * 
     * @return bus_name 
     */
    public String getBusName() {
        return busName;
    }

    /**
     * 
     * @param busName 
     */
    public void setBusName(String busName) {
        this.busName = busName == null ? null : busName.trim();
    }

    /**
     * 
     * @return bus_desc 
     */
    public String getBusDesc() {
        return busDesc;
    }

    /**
     * 
     * @param busDesc 
     */
    public void setBusDesc(String busDesc) {
        this.busDesc = busDesc == null ? null : busDesc.trim();
    }

    /**
     * 
     * @return evt_svc_before 
     */
    public String getEvtSvcBefore() {
        return evtSvcBefore;
    }

    /**
     * 
     * @param evtSvcBefore 
     */
    public void setEvtSvcBefore(String evtSvcBefore) {
        this.evtSvcBefore = evtSvcBefore == null ? null : evtSvcBefore.trim();
    }

    /**
     * 
     * @return evt_svc_after 
     */
    public String getEvtSvcAfter() {
        return evtSvcAfter;
    }

    /**
     * 
     * @param evtSvcAfter 
     */
    public void setEvtSvcAfter(String evtSvcAfter) {
        this.evtSvcAfter = evtSvcAfter == null ? null : evtSvcAfter.trim();
    }

    /**
     * 
     * @return evt_svc_failed 
     */
    public String getEvtSvcFailed() {
        return evtSvcFailed;
    }

    /**
     * 
     * @param evtSvcFailed 
     */
    public void setEvtSvcFailed(String evtSvcFailed) {
        this.evtSvcFailed = evtSvcFailed == null ? null : evtSvcFailed.trim();
    }

    /**
     * 
     * @return evt_svc_end 
     */
    public String getEvtSvcEnd() {
        return evtSvcEnd;
    }

    /**
     * 
     * @param evtSvcEnd 
     */
    public void setEvtSvcEnd(String evtSvcEnd) {
        this.evtSvcEnd = evtSvcEnd == null ? null : evtSvcEnd.trim();
    }

    /**
     * 
     * @return grp_id 
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * 
     * @param grpId 
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId == null ? null : grpId.trim();
    }

    /**
     * 
     * @return crt_user 
     */
    public String getCrtUser() {
        return crtUser;
    }

    /**
     * 
     * @param crtUser 
     */
    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    /**
     * 
     * @return crt_date_time 
     */
    public String getCrtDateTime() {
        return crtDateTime;
    }

    /**
     * 
     * @param crtDateTime 
     */
    public void setCrtDateTime(String crtDateTime) {
        this.crtDateTime = crtDateTime == null ? null : crtDateTime.trim();
    }

    /**
     * 
     * @return lst_mod_user 
     */
    public String getLstModUser() {
        return lstModUser;
    }

    /**
     * 
     * @param lstModUser 
     */
    public void setLstModUser(String lstModUser) {
        this.lstModUser = lstModUser == null ? null : lstModUser.trim();
    }

    /**
     * 
     * @return lst_mod_date_time 
     */
    public String getLstModDateTime() {
        return lstModDateTime;
    }

    /**
     * 
     * @param lstModDateTime 
     */
    public void setLstModDateTime(String lstModDateTime) {
        this.lstModDateTime = lstModDateTime == null ? null : lstModDateTime.trim();
    }

    /**
     * 
     * @return client_lib 
     */
    public String getClientLib() {
        return clientLib;
    }

    /**
     * 
     * @param clientLib 
     */
    public void setClientLib(String clientLib) {
        this.clientLib = clientLib == null ? null : clientLib.trim();
    }

    /**
     * 
     * @return lib_func 
     */
    public String getLibFunc() {
        return libFunc;
    }

    /**
     * 
     * @param libFunc 
     */
    public void setLibFunc(String libFunc) {
        this.libFunc = libFunc == null ? null : libFunc.trim();
    }
}