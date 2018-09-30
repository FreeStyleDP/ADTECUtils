package com.adtec.jfBuilder.entity;

public class EstSubBus extends EstSubBusKey {
    /**
     * 
     */
    private String subBusName;

    /**
     * 
     */
    private String subBusDesc;

    /**
     * 
     */
    private String tranFlag;

    /**
     * 
     */
    private String respFlag;

    /**
     * 
     */
    private String prio;

    /**
     * 
     */
    private Short timeout;

    /**
     * 
     */
    private Short maxRevsNum;

    /**
     * 
     */
    private Short maxCompsNum;

    /**
     * 
     */
    private String alaInitEnd;

    /**
     * 
     */
    private String alaTermBegin;

    /**
     * 
     */
    private String alaTermEnd;

    /**
     * 
     */
    private String svcPreProc;

    /**
     * 
     */
    private String svcSuccProc;

    /**
     * 
     */
    private String svcLostProc;

    /**
     * 
     */
    private String svcTermProc;

    /**
     * 
     */
    private String revsInit;

    /**
     * 
     */
    private String revsSucc;

    /**
     * 
     */
    private String revsFail;

    /**
     * 
     */
    private String revsCond;

    /**
     * 
     */
    private String compsInit;

    /**
     * 
     */
    private String compsSucc;

    /**
     * 
     */
    private String compsFail;

    /**
     * 
     */
    private String compsCond;

    /**
     * 
     */
    private String inElem;

    /**
     * 
     */
    private String outElem;

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
     * @return sub_bus_name 
     */
    public String getSubBusName() {
        return subBusName;
    }

    /**
     * 
     * @param subBusName 
     */
    public void setSubBusName(String subBusName) {
        this.subBusName = subBusName == null ? null : subBusName.trim();
    }

    /**
     * 
     * @return sub_bus_desc 
     */
    public String getSubBusDesc() {
        return subBusDesc;
    }

    /**
     * 
     * @param subBusDesc 
     */
    public void setSubBusDesc(String subBusDesc) {
        this.subBusDesc = subBusDesc == null ? null : subBusDesc.trim();
    }

    /**
     * 
     * @return tran_flag 
     */
    public String getTranFlag() {
        return tranFlag;
    }

    /**
     * 
     * @param tranFlag 
     */
    public void setTranFlag(String tranFlag) {
        this.tranFlag = tranFlag == null ? null : tranFlag.trim();
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
     * @return prio 
     */
    public String getPrio() {
        return prio;
    }

    /**
     * 
     * @param prio 
     */
    public void setPrio(String prio) {
        this.prio = prio == null ? null : prio.trim();
    }

    /**
     * 
     * @return timeout 
     */
    public Short getTimeout() {
        return timeout;
    }

    /**
     * 
     * @param timeout 
     */
    public void setTimeout(Short timeout) {
        this.timeout = timeout;
    }

    /**
     * 
     * @return max_revs_num 
     */
    public Short getMaxRevsNum() {
        return maxRevsNum;
    }

    /**
     * 
     * @param maxRevsNum 
     */
    public void setMaxRevsNum(Short maxRevsNum) {
        this.maxRevsNum = maxRevsNum;
    }

    /**
     * 
     * @return max_comps_num 
     */
    public Short getMaxCompsNum() {
        return maxCompsNum;
    }

    /**
     * 
     * @param maxCompsNum 
     */
    public void setMaxCompsNum(Short maxCompsNum) {
        this.maxCompsNum = maxCompsNum;
    }

    /**
     * 
     * @return ala_init_end 
     */
    public String getAlaInitEnd() {
        return alaInitEnd;
    }

    /**
     * 
     * @param alaInitEnd 
     */
    public void setAlaInitEnd(String alaInitEnd) {
        this.alaInitEnd = alaInitEnd == null ? null : alaInitEnd.trim();
    }

    /**
     * 
     * @return ala_term_begin 
     */
    public String getAlaTermBegin() {
        return alaTermBegin;
    }

    /**
     * 
     * @param alaTermBegin 
     */
    public void setAlaTermBegin(String alaTermBegin) {
        this.alaTermBegin = alaTermBegin == null ? null : alaTermBegin.trim();
    }

    /**
     * 
     * @return ala_term_end 
     */
    public String getAlaTermEnd() {
        return alaTermEnd;
    }

    /**
     * 
     * @param alaTermEnd 
     */
    public void setAlaTermEnd(String alaTermEnd) {
        this.alaTermEnd = alaTermEnd == null ? null : alaTermEnd.trim();
    }

    /**
     * 
     * @return svc_pre_proc 
     */
    public String getSvcPreProc() {
        return svcPreProc;
    }

    /**
     * 
     * @param svcPreProc 
     */
    public void setSvcPreProc(String svcPreProc) {
        this.svcPreProc = svcPreProc == null ? null : svcPreProc.trim();
    }

    /**
     * 
     * @return svc_succ_proc 
     */
    public String getSvcSuccProc() {
        return svcSuccProc;
    }

    /**
     * 
     * @param svcSuccProc 
     */
    public void setSvcSuccProc(String svcSuccProc) {
        this.svcSuccProc = svcSuccProc == null ? null : svcSuccProc.trim();
    }

    /**
     * 
     * @return svc_lost_proc 
     */
    public String getSvcLostProc() {
        return svcLostProc;
    }

    /**
     * 
     * @param svcLostProc 
     */
    public void setSvcLostProc(String svcLostProc) {
        this.svcLostProc = svcLostProc == null ? null : svcLostProc.trim();
    }

    /**
     * 
     * @return svc_term_proc 
     */
    public String getSvcTermProc() {
        return svcTermProc;
    }

    /**
     * 
     * @param svcTermProc 
     */
    public void setSvcTermProc(String svcTermProc) {
        this.svcTermProc = svcTermProc == null ? null : svcTermProc.trim();
    }

    /**
     * 
     * @return revs_init 
     */
    public String getRevsInit() {
        return revsInit;
    }

    /**
     * 
     * @param revsInit 
     */
    public void setRevsInit(String revsInit) {
        this.revsInit = revsInit == null ? null : revsInit.trim();
    }

    /**
     * 
     * @return revs_succ 
     */
    public String getRevsSucc() {
        return revsSucc;
    }

    /**
     * 
     * @param revsSucc 
     */
    public void setRevsSucc(String revsSucc) {
        this.revsSucc = revsSucc == null ? null : revsSucc.trim();
    }

    /**
     * 
     * @return revs_fail 
     */
    public String getRevsFail() {
        return revsFail;
    }

    /**
     * 
     * @param revsFail 
     */
    public void setRevsFail(String revsFail) {
        this.revsFail = revsFail == null ? null : revsFail.trim();
    }

    /**
     * 
     * @return revs_cond 
     */
    public String getRevsCond() {
        return revsCond;
    }

    /**
     * 
     * @param revsCond 
     */
    public void setRevsCond(String revsCond) {
        this.revsCond = revsCond == null ? null : revsCond.trim();
    }

    /**
     * 
     * @return comps_init 
     */
    public String getCompsInit() {
        return compsInit;
    }

    /**
     * 
     * @param compsInit 
     */
    public void setCompsInit(String compsInit) {
        this.compsInit = compsInit == null ? null : compsInit.trim();
    }

    /**
     * 
     * @return comps_succ 
     */
    public String getCompsSucc() {
        return compsSucc;
    }

    /**
     * 
     * @param compsSucc 
     */
    public void setCompsSucc(String compsSucc) {
        this.compsSucc = compsSucc == null ? null : compsSucc.trim();
    }

    /**
     * 
     * @return comps_fail 
     */
    public String getCompsFail() {
        return compsFail;
    }

    /**
     * 
     * @param compsFail 
     */
    public void setCompsFail(String compsFail) {
        this.compsFail = compsFail == null ? null : compsFail.trim();
    }

    /**
     * 
     * @return comps_cond 
     */
    public String getCompsCond() {
        return compsCond;
    }

    /**
     * 
     * @param compsCond 
     */
    public void setCompsCond(String compsCond) {
        this.compsCond = compsCond == null ? null : compsCond.trim();
    }

    /**
     * 
     * @return in_elem 
     */
    public String getInElem() {
        return inElem;
    }

    /**
     * 
     * @param inElem 
     */
    public void setInElem(String inElem) {
        this.inElem = inElem == null ? null : inElem.trim();
    }

    /**
     * 
     * @return out_elem 
     */
    public String getOutElem() {
        return outElem;
    }

    /**
     * 
     * @param outElem 
     */
    public void setOutElem(String outElem) {
        this.outElem = outElem == null ? null : outElem.trim();
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
}