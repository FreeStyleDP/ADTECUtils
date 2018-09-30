package com.adtec.jfBuilder.entity;

public class EstDta {
    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String dtaName;

    /**
     * 
     */
    private String dtaDesc;

    /**
     * 
     */
    private String consType;

    /**
     * 
     */
    private String protocolType;

    /**
     * 
     */
    private String requestElemId;

    /**
     * 
     */
    private String responseElemId;

    /**
     * 
     */
    private String failedElemId;

    /**
     * 
     */
    private String evtSvcCode;

    /**
     * 
     */
    private String roleType;

    /**
     * 
     */
    private String dbOpen;

    /**
     * 
     */
    private String cnctType;

    /**
     * 
     */
    private Integer timeOut;

    /**
     * 
     */
    private String errFmt;

    /**
     * 
     */
    private String iPrtcFmt;

    /**
     * 
     */
    private String oPrtcFmt;

    /**
     * 
     */
    private String errOpn;

    /**
     * 
     */
    private String iFmt;

    /**
     * 
     */
    private String oFmt;

    /**
     * 
     */
    private String session;

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
    private Short maxRevsNum;

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
    private Short maxCompsNum;

    /**
     * 
     */
    private String evtInitEnd;

    /**
     * 
     */
    private String evtTermBegin;

    /**
     * 
     */
    private String evtIprtcfmtBegin;

    /**
     * 
     */
    private String evtIprtcfmtEnd;

    /**
     * 
     */
    private String evtOprtcfmtBegin;

    /**
     * 
     */
    private String evtOprtcfmtEnd;

    /**
     * 
     */
    private String evtIfmtBegin;

    /**
     * 
     */
    private String evtIfmtEnd;

    /**
     * 
     */
    private String evtOfmtBegin;

    /**
     * 
     */
    private String evtOfmtTerm;

    /**
     * 
     */
    private String evtAcallBegin;

    /**
     * 
     */
    private String evtAcallEnd;

    /**
     * 
     */
    private String evtReturnBegin;

    /**
     * 
     */
    private String evtReturnEnd;

    /**
     * 
     */
    private String evtConvsvcBegin;

    /**
     * 
     */
    private String evtConvsvcEnd;

    /**
     * 
     */
    private String evtPfileBegin;

    /**
     * 
     */
    private String evtPfileEnd;

    /**
     * 
     */
    private String evtBfileBegin;

    /**
     * 
     */
    private String evtBfileEnd;

    /**
     * 
     */
    private String evtSfileBegin;

    /**
     * 
     */
    private String evtSfileEnd;

    /**
     * 
     */
    private String evtRfileBegin;

    /**
     * 
     */
    private String evtRfileEnd;

    /**
     * 
     */
    private String comType;

    /**
     * 
     */
    private String dtaFactory;

    /**
     * 
     */
    private String dtaFlow;

    /**
     * 
     */
    private String comFactoryConf;

    /**
     * 
     */
    private String fmtFactoryConf;

    /**
     * 
     */
    private String xmlFactoryConf;

    /**
     * 
     */
    private String jsonFactoryConf;

    /**
     * 
     */
    private String soapFactoryConf;

    /**
     * 
     */
    private String sign8583FactoryConf;

    /**
     * 
     */
    private String signFmlFactoryConf;

    /**
     * 
     */
    private String signHttpFactoryConf;

    /**
     * 
     */
    private String signHttpServletFactoryConf;

    /**
     * 
     */
    private String syserrOk;

    /**
     * 
     */
    private String syserrApp;

    /**
     * 
     */
    private String syserrReq;

    /**
     * 
     */
    private String syserrAck;

    /**
     * 
     */
    private String syserrBusy;

    /**
     * 
     */
    private String belongDta;

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
    private String pricalcExpr;

    /**
     * 
     */
    private String servExpr;

    /**
     * 
     */
    private String custExpr;

    /**
     * 
     */
    private String sendHbFmt;

    /**
     * 
     */
    private String recvHbFmt;

    /**
     * 
     */
    private String requestHbFmt;

    /**
     * 
     */
    private String responseHbFmt;

    /**
     * 
     */
    private Integer hbfmtTime;

    /**
     * 
     */
    private String hbfmtExpr;

    /**
     * 
     */
    private String wsdlNameSpace;

    /**
     * 
     */
    private String wsdlNs;

    /**
     * 
     */
    private String fmtSendBegin;

    /**
     * 
     */
    private String fmtRecvBegin;

    /**
     * 
     */
    private String soapBinding;

    /**
     * 
     */
    private String isHavePrefix;

    /**
     * 
     */
    private String encode;

    /**
     * 
     * @return dta_id 
     */
    public String getDtaId() {
        return dtaId;
    }

    /**
     * 
     * @param dtaId 
     */
    public void setDtaId(String dtaId) {
        this.dtaId = dtaId == null ? null : dtaId.trim();
    }

    /**
     * 
     * @return project_id 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 
     * @return relation_id 
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * 
     * @param relationId 
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    /**
     * 
     * @return dta_name 
     */
    public String getDtaName() {
        return dtaName;
    }

    /**
     * 
     * @param dtaName 
     */
    public void setDtaName(String dtaName) {
        this.dtaName = dtaName == null ? null : dtaName.trim();
    }

    /**
     * 
     * @return dta_desc 
     */
    public String getDtaDesc() {
        return dtaDesc;
    }

    /**
     * 
     * @param dtaDesc 
     */
    public void setDtaDesc(String dtaDesc) {
        this.dtaDesc = dtaDesc == null ? null : dtaDesc.trim();
    }

    /**
     * 
     * @return cons_type 
     */
    public String getConsType() {
        return consType;
    }

    /**
     * 
     * @param consType 
     */
    public void setConsType(String consType) {
        this.consType = consType == null ? null : consType.trim();
    }

    /**
     * 
     * @return protocol_type 
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 
     * @param protocolType 
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType == null ? null : protocolType.trim();
    }

    /**
     * 
     * @return request_elem_id 
     */
    public String getRequestElemId() {
        return requestElemId;
    }

    /**
     * 
     * @param requestElemId 
     */
    public void setRequestElemId(String requestElemId) {
        this.requestElemId = requestElemId == null ? null : requestElemId.trim();
    }

    /**
     * 
     * @return response_elem_id 
     */
    public String getResponseElemId() {
        return responseElemId;
    }

    /**
     * 
     * @param responseElemId 
     */
    public void setResponseElemId(String responseElemId) {
        this.responseElemId = responseElemId == null ? null : responseElemId.trim();
    }

    /**
     * 
     * @return failed_elem_id 
     */
    public String getFailedElemId() {
        return failedElemId;
    }

    /**
     * 
     * @param failedElemId 
     */
    public void setFailedElemId(String failedElemId) {
        this.failedElemId = failedElemId == null ? null : failedElemId.trim();
    }

    /**
     * 
     * @return evt_svc_code 
     */
    public String getEvtSvcCode() {
        return evtSvcCode;
    }

    /**
     * 
     * @param evtSvcCode 
     */
    public void setEvtSvcCode(String evtSvcCode) {
        this.evtSvcCode = evtSvcCode == null ? null : evtSvcCode.trim();
    }

    /**
     * 
     * @return role_type 
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 
     * @param roleType 
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    /**
     * 
     * @return db_open 
     */
    public String getDbOpen() {
        return dbOpen;
    }

    /**
     * 
     * @param dbOpen 
     */
    public void setDbOpen(String dbOpen) {
        this.dbOpen = dbOpen == null ? null : dbOpen.trim();
    }

    /**
     * 
     * @return cnct_type 
     */
    public String getCnctType() {
        return cnctType;
    }

    /**
     * 
     * @param cnctType 
     */
    public void setCnctType(String cnctType) {
        this.cnctType = cnctType == null ? null : cnctType.trim();
    }

    /**
     * 
     * @return time_out 
     */
    public Integer getTimeOut() {
        return timeOut;
    }

    /**
     * 
     * @param timeOut 
     */
    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * 
     * @return err_fmt 
     */
    public String getErrFmt() {
        return errFmt;
    }

    /**
     * 
     * @param errFmt 
     */
    public void setErrFmt(String errFmt) {
        this.errFmt = errFmt == null ? null : errFmt.trim();
    }

    /**
     * 
     * @return i_prtc_fmt 
     */
    public String getiPrtcFmt() {
        return iPrtcFmt;
    }

    /**
     * 
     * @param iPrtcFmt 
     */
    public void setiPrtcFmt(String iPrtcFmt) {
        this.iPrtcFmt = iPrtcFmt == null ? null : iPrtcFmt.trim();
    }

    /**
     * 
     * @return o_prtc_fmt 
     */
    public String getoPrtcFmt() {
        return oPrtcFmt;
    }

    /**
     * 
     * @param oPrtcFmt 
     */
    public void setoPrtcFmt(String oPrtcFmt) {
        this.oPrtcFmt = oPrtcFmt == null ? null : oPrtcFmt.trim();
    }

    /**
     * 
     * @return err_opn 
     */
    public String getErrOpn() {
        return errOpn;
    }

    /**
     * 
     * @param errOpn 
     */
    public void setErrOpn(String errOpn) {
        this.errOpn = errOpn == null ? null : errOpn.trim();
    }

    /**
     * 
     * @return i_fmt 
     */
    public String getiFmt() {
        return iFmt;
    }

    /**
     * 
     * @param iFmt 
     */
    public void setiFmt(String iFmt) {
        this.iFmt = iFmt == null ? null : iFmt.trim();
    }

    /**
     * 
     * @return o_fmt 
     */
    public String getoFmt() {
        return oFmt;
    }

    /**
     * 
     * @param oFmt 
     */
    public void setoFmt(String oFmt) {
        this.oFmt = oFmt == null ? null : oFmt.trim();
    }

    /**
     * 
     * @return session 
     */
    public String getSession() {
        return session;
    }

    /**
     * 
     * @param session 
     */
    public void setSession(String session) {
        this.session = session == null ? null : session.trim();
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
     * @return evt_init_end 
     */
    public String getEvtInitEnd() {
        return evtInitEnd;
    }

    /**
     * 
     * @param evtInitEnd 
     */
    public void setEvtInitEnd(String evtInitEnd) {
        this.evtInitEnd = evtInitEnd == null ? null : evtInitEnd.trim();
    }

    /**
     * 
     * @return evt_term_begin 
     */
    public String getEvtTermBegin() {
        return evtTermBegin;
    }

    /**
     * 
     * @param evtTermBegin 
     */
    public void setEvtTermBegin(String evtTermBegin) {
        this.evtTermBegin = evtTermBegin == null ? null : evtTermBegin.trim();
    }

    /**
     * 
     * @return evt_iprtcfmt_begin 
     */
    public String getEvtIprtcfmtBegin() {
        return evtIprtcfmtBegin;
    }

    /**
     * 
     * @param evtIprtcfmtBegin 
     */
    public void setEvtIprtcfmtBegin(String evtIprtcfmtBegin) {
        this.evtIprtcfmtBegin = evtIprtcfmtBegin == null ? null : evtIprtcfmtBegin.trim();
    }

    /**
     * 
     * @return evt_iprtcfmt_end 
     */
    public String getEvtIprtcfmtEnd() {
        return evtIprtcfmtEnd;
    }

    /**
     * 
     * @param evtIprtcfmtEnd 
     */
    public void setEvtIprtcfmtEnd(String evtIprtcfmtEnd) {
        this.evtIprtcfmtEnd = evtIprtcfmtEnd == null ? null : evtIprtcfmtEnd.trim();
    }

    /**
     * 
     * @return evt_oprtcfmt_begin 
     */
    public String getEvtOprtcfmtBegin() {
        return evtOprtcfmtBegin;
    }

    /**
     * 
     * @param evtOprtcfmtBegin 
     */
    public void setEvtOprtcfmtBegin(String evtOprtcfmtBegin) {
        this.evtOprtcfmtBegin = evtOprtcfmtBegin == null ? null : evtOprtcfmtBegin.trim();
    }

    /**
     * 
     * @return evt_oprtcfmt_end 
     */
    public String getEvtOprtcfmtEnd() {
        return evtOprtcfmtEnd;
    }

    /**
     * 
     * @param evtOprtcfmtEnd 
     */
    public void setEvtOprtcfmtEnd(String evtOprtcfmtEnd) {
        this.evtOprtcfmtEnd = evtOprtcfmtEnd == null ? null : evtOprtcfmtEnd.trim();
    }

    /**
     * 
     * @return evt_ifmt_begin 
     */
    public String getEvtIfmtBegin() {
        return evtIfmtBegin;
    }

    /**
     * 
     * @param evtIfmtBegin 
     */
    public void setEvtIfmtBegin(String evtIfmtBegin) {
        this.evtIfmtBegin = evtIfmtBegin == null ? null : evtIfmtBegin.trim();
    }

    /**
     * 
     * @return evt_ifmt_end 
     */
    public String getEvtIfmtEnd() {
        return evtIfmtEnd;
    }

    /**
     * 
     * @param evtIfmtEnd 
     */
    public void setEvtIfmtEnd(String evtIfmtEnd) {
        this.evtIfmtEnd = evtIfmtEnd == null ? null : evtIfmtEnd.trim();
    }

    /**
     * 
     * @return evt_ofmt_begin 
     */
    public String getEvtOfmtBegin() {
        return evtOfmtBegin;
    }

    /**
     * 
     * @param evtOfmtBegin 
     */
    public void setEvtOfmtBegin(String evtOfmtBegin) {
        this.evtOfmtBegin = evtOfmtBegin == null ? null : evtOfmtBegin.trim();
    }

    /**
     * 
     * @return evt_ofmt_term 
     */
    public String getEvtOfmtTerm() {
        return evtOfmtTerm;
    }

    /**
     * 
     * @param evtOfmtTerm 
     */
    public void setEvtOfmtTerm(String evtOfmtTerm) {
        this.evtOfmtTerm = evtOfmtTerm == null ? null : evtOfmtTerm.trim();
    }

    /**
     * 
     * @return evt_acall_begin 
     */
    public String getEvtAcallBegin() {
        return evtAcallBegin;
    }

    /**
     * 
     * @param evtAcallBegin 
     */
    public void setEvtAcallBegin(String evtAcallBegin) {
        this.evtAcallBegin = evtAcallBegin == null ? null : evtAcallBegin.trim();
    }

    /**
     * 
     * @return evt_acall_end 
     */
    public String getEvtAcallEnd() {
        return evtAcallEnd;
    }

    /**
     * 
     * @param evtAcallEnd 
     */
    public void setEvtAcallEnd(String evtAcallEnd) {
        this.evtAcallEnd = evtAcallEnd == null ? null : evtAcallEnd.trim();
    }

    /**
     * 
     * @return evt_return_begin 
     */
    public String getEvtReturnBegin() {
        return evtReturnBegin;
    }

    /**
     * 
     * @param evtReturnBegin 
     */
    public void setEvtReturnBegin(String evtReturnBegin) {
        this.evtReturnBegin = evtReturnBegin == null ? null : evtReturnBegin.trim();
    }

    /**
     * 
     * @return evt_return_end 
     */
    public String getEvtReturnEnd() {
        return evtReturnEnd;
    }

    /**
     * 
     * @param evtReturnEnd 
     */
    public void setEvtReturnEnd(String evtReturnEnd) {
        this.evtReturnEnd = evtReturnEnd == null ? null : evtReturnEnd.trim();
    }

    /**
     * 
     * @return evt_convsvc_begin 
     */
    public String getEvtConvsvcBegin() {
        return evtConvsvcBegin;
    }

    /**
     * 
     * @param evtConvsvcBegin 
     */
    public void setEvtConvsvcBegin(String evtConvsvcBegin) {
        this.evtConvsvcBegin = evtConvsvcBegin == null ? null : evtConvsvcBegin.trim();
    }

    /**
     * 
     * @return evt_convsvc_end 
     */
    public String getEvtConvsvcEnd() {
        return evtConvsvcEnd;
    }

    /**
     * 
     * @param evtConvsvcEnd 
     */
    public void setEvtConvsvcEnd(String evtConvsvcEnd) {
        this.evtConvsvcEnd = evtConvsvcEnd == null ? null : evtConvsvcEnd.trim();
    }

    /**
     * 
     * @return evt_pfile_begin 
     */
    public String getEvtPfileBegin() {
        return evtPfileBegin;
    }

    /**
     * 
     * @param evtPfileBegin 
     */
    public void setEvtPfileBegin(String evtPfileBegin) {
        this.evtPfileBegin = evtPfileBegin == null ? null : evtPfileBegin.trim();
    }

    /**
     * 
     * @return evt_pfile_end 
     */
    public String getEvtPfileEnd() {
        return evtPfileEnd;
    }

    /**
     * 
     * @param evtPfileEnd 
     */
    public void setEvtPfileEnd(String evtPfileEnd) {
        this.evtPfileEnd = evtPfileEnd == null ? null : evtPfileEnd.trim();
    }

    /**
     * 
     * @return evt_bfile_begin 
     */
    public String getEvtBfileBegin() {
        return evtBfileBegin;
    }

    /**
     * 
     * @param evtBfileBegin 
     */
    public void setEvtBfileBegin(String evtBfileBegin) {
        this.evtBfileBegin = evtBfileBegin == null ? null : evtBfileBegin.trim();
    }

    /**
     * 
     * @return evt_bfile_end 
     */
    public String getEvtBfileEnd() {
        return evtBfileEnd;
    }

    /**
     * 
     * @param evtBfileEnd 
     */
    public void setEvtBfileEnd(String evtBfileEnd) {
        this.evtBfileEnd = evtBfileEnd == null ? null : evtBfileEnd.trim();
    }

    /**
     * 
     * @return evt_sfile_begin 
     */
    public String getEvtSfileBegin() {
        return evtSfileBegin;
    }

    /**
     * 
     * @param evtSfileBegin 
     */
    public void setEvtSfileBegin(String evtSfileBegin) {
        this.evtSfileBegin = evtSfileBegin == null ? null : evtSfileBegin.trim();
    }

    /**
     * 
     * @return evt_sfile_end 
     */
    public String getEvtSfileEnd() {
        return evtSfileEnd;
    }

    /**
     * 
     * @param evtSfileEnd 
     */
    public void setEvtSfileEnd(String evtSfileEnd) {
        this.evtSfileEnd = evtSfileEnd == null ? null : evtSfileEnd.trim();
    }

    /**
     * 
     * @return evt_rfile_begin 
     */
    public String getEvtRfileBegin() {
        return evtRfileBegin;
    }

    /**
     * 
     * @param evtRfileBegin 
     */
    public void setEvtRfileBegin(String evtRfileBegin) {
        this.evtRfileBegin = evtRfileBegin == null ? null : evtRfileBegin.trim();
    }

    /**
     * 
     * @return evt_rfile_end 
     */
    public String getEvtRfileEnd() {
        return evtRfileEnd;
    }

    /**
     * 
     * @param evtRfileEnd 
     */
    public void setEvtRfileEnd(String evtRfileEnd) {
        this.evtRfileEnd = evtRfileEnd == null ? null : evtRfileEnd.trim();
    }

    /**
     * 
     * @return com_type 
     */
    public String getComType() {
        return comType;
    }

    /**
     * 
     * @param comType 
     */
    public void setComType(String comType) {
        this.comType = comType == null ? null : comType.trim();
    }

    /**
     * 
     * @return dta_factory 
     */
    public String getDtaFactory() {
        return dtaFactory;
    }

    /**
     * 
     * @param dtaFactory 
     */
    public void setDtaFactory(String dtaFactory) {
        this.dtaFactory = dtaFactory == null ? null : dtaFactory.trim();
    }

    /**
     * 
     * @return dta_flow 
     */
    public String getDtaFlow() {
        return dtaFlow;
    }

    /**
     * 
     * @param dtaFlow 
     */
    public void setDtaFlow(String dtaFlow) {
        this.dtaFlow = dtaFlow == null ? null : dtaFlow.trim();
    }

    /**
     * 
     * @return com_factory_conf 
     */
    public String getComFactoryConf() {
        return comFactoryConf;
    }

    /**
     * 
     * @param comFactoryConf 
     */
    public void setComFactoryConf(String comFactoryConf) {
        this.comFactoryConf = comFactoryConf == null ? null : comFactoryConf.trim();
    }

    /**
     * 
     * @return fmt_factory_conf 
     */
    public String getFmtFactoryConf() {
        return fmtFactoryConf;
    }

    /**
     * 
     * @param fmtFactoryConf 
     */
    public void setFmtFactoryConf(String fmtFactoryConf) {
        this.fmtFactoryConf = fmtFactoryConf == null ? null : fmtFactoryConf.trim();
    }

    /**
     * 
     * @return xml_factory_conf 
     */
    public String getXmlFactoryConf() {
        return xmlFactoryConf;
    }

    /**
     * 
     * @param xmlFactoryConf 
     */
    public void setXmlFactoryConf(String xmlFactoryConf) {
        this.xmlFactoryConf = xmlFactoryConf == null ? null : xmlFactoryConf.trim();
    }

    /**
     * 
     * @return json_factory_conf 
     */
    public String getJsonFactoryConf() {
        return jsonFactoryConf;
    }

    /**
     * 
     * @param jsonFactoryConf 
     */
    public void setJsonFactoryConf(String jsonFactoryConf) {
        this.jsonFactoryConf = jsonFactoryConf == null ? null : jsonFactoryConf.trim();
    }

    /**
     * 
     * @return soap_factory_conf 
     */
    public String getSoapFactoryConf() {
        return soapFactoryConf;
    }

    /**
     * 
     * @param soapFactoryConf 
     */
    public void setSoapFactoryConf(String soapFactoryConf) {
        this.soapFactoryConf = soapFactoryConf == null ? null : soapFactoryConf.trim();
    }

    /**
     * 
     * @return sign_8583_factory_conf 
     */
    public String getSign8583FactoryConf() {
        return sign8583FactoryConf;
    }

    /**
     * 
     * @param sign8583FactoryConf 
     */
    public void setSign8583FactoryConf(String sign8583FactoryConf) {
        this.sign8583FactoryConf = sign8583FactoryConf == null ? null : sign8583FactoryConf.trim();
    }

    /**
     * 
     * @return sign_fml_factory_conf 
     */
    public String getSignFmlFactoryConf() {
        return signFmlFactoryConf;
    }

    /**
     * 
     * @param signFmlFactoryConf 
     */
    public void setSignFmlFactoryConf(String signFmlFactoryConf) {
        this.signFmlFactoryConf = signFmlFactoryConf == null ? null : signFmlFactoryConf.trim();
    }

    /**
     * 
     * @return sign_http_factory_conf 
     */
    public String getSignHttpFactoryConf() {
        return signHttpFactoryConf;
    }

    /**
     * 
     * @param signHttpFactoryConf 
     */
    public void setSignHttpFactoryConf(String signHttpFactoryConf) {
        this.signHttpFactoryConf = signHttpFactoryConf == null ? null : signHttpFactoryConf.trim();
    }

    /**
     * 
     * @return sign_http_servlet_factory_conf 
     */
    public String getSignHttpServletFactoryConf() {
        return signHttpServletFactoryConf;
    }

    /**
     * 
     * @param signHttpServletFactoryConf 
     */
    public void setSignHttpServletFactoryConf(String signHttpServletFactoryConf) {
        this.signHttpServletFactoryConf = signHttpServletFactoryConf == null ? null : signHttpServletFactoryConf.trim();
    }

    /**
     * 
     * @return syserr_ok 
     */
    public String getSyserrOk() {
        return syserrOk;
    }

    /**
     * 
     * @param syserrOk 
     */
    public void setSyserrOk(String syserrOk) {
        this.syserrOk = syserrOk == null ? null : syserrOk.trim();
    }

    /**
     * 
     * @return syserr_app 
     */
    public String getSyserrApp() {
        return syserrApp;
    }

    /**
     * 
     * @param syserrApp 
     */
    public void setSyserrApp(String syserrApp) {
        this.syserrApp = syserrApp == null ? null : syserrApp.trim();
    }

    /**
     * 
     * @return syserr_req 
     */
    public String getSyserrReq() {
        return syserrReq;
    }

    /**
     * 
     * @param syserrReq 
     */
    public void setSyserrReq(String syserrReq) {
        this.syserrReq = syserrReq == null ? null : syserrReq.trim();
    }

    /**
     * 
     * @return syserr_ack 
     */
    public String getSyserrAck() {
        return syserrAck;
    }

    /**
     * 
     * @param syserrAck 
     */
    public void setSyserrAck(String syserrAck) {
        this.syserrAck = syserrAck == null ? null : syserrAck.trim();
    }

    /**
     * 
     * @return syserr_busy 
     */
    public String getSyserrBusy() {
        return syserrBusy;
    }

    /**
     * 
     * @param syserrBusy 
     */
    public void setSyserrBusy(String syserrBusy) {
        this.syserrBusy = syserrBusy == null ? null : syserrBusy.trim();
    }

    /**
     * 
     * @return belong_dta 
     */
    public String getBelongDta() {
        return belongDta;
    }

    /**
     * 
     * @param belongDta 
     */
    public void setBelongDta(String belongDta) {
        this.belongDta = belongDta == null ? null : belongDta.trim();
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
     * @return pricalc_expr 
     */
    public String getPricalcExpr() {
        return pricalcExpr;
    }

    /**
     * 
     * @param pricalcExpr 
     */
    public void setPricalcExpr(String pricalcExpr) {
        this.pricalcExpr = pricalcExpr == null ? null : pricalcExpr.trim();
    }

    /**
     * 
     * @return serv_expr 
     */
    public String getServExpr() {
        return servExpr;
    }

    /**
     * 
     * @param servExpr 
     */
    public void setServExpr(String servExpr) {
        this.servExpr = servExpr == null ? null : servExpr.trim();
    }

    /**
     * 
     * @return cust_expr 
     */
    public String getCustExpr() {
        return custExpr;
    }

    /**
     * 
     * @param custExpr 
     */
    public void setCustExpr(String custExpr) {
        this.custExpr = custExpr == null ? null : custExpr.trim();
    }

    /**
     * 
     * @return send_hb_fmt 
     */
    public String getSendHbFmt() {
        return sendHbFmt;
    }

    /**
     * 
     * @param sendHbFmt 
     */
    public void setSendHbFmt(String sendHbFmt) {
        this.sendHbFmt = sendHbFmt == null ? null : sendHbFmt.trim();
    }

    /**
     * 
     * @return recv_hb_fmt 
     */
    public String getRecvHbFmt() {
        return recvHbFmt;
    }

    /**
     * 
     * @param recvHbFmt 
     */
    public void setRecvHbFmt(String recvHbFmt) {
        this.recvHbFmt = recvHbFmt == null ? null : recvHbFmt.trim();
    }

    /**
     * 
     * @return request_hb_fmt 
     */
    public String getRequestHbFmt() {
        return requestHbFmt;
    }

    /**
     * 
     * @param requestHbFmt 
     */
    public void setRequestHbFmt(String requestHbFmt) {
        this.requestHbFmt = requestHbFmt == null ? null : requestHbFmt.trim();
    }

    /**
     * 
     * @return response_hb_fmt 
     */
    public String getResponseHbFmt() {
        return responseHbFmt;
    }

    /**
     * 
     * @param responseHbFmt 
     */
    public void setResponseHbFmt(String responseHbFmt) {
        this.responseHbFmt = responseHbFmt == null ? null : responseHbFmt.trim();
    }

    /**
     * 
     * @return hbfmt_time 
     */
    public Integer getHbfmtTime() {
        return hbfmtTime;
    }

    /**
     * 
     * @param hbfmtTime 
     */
    public void setHbfmtTime(Integer hbfmtTime) {
        this.hbfmtTime = hbfmtTime;
    }

    /**
     * 
     * @return hbfmt_expr 
     */
    public String getHbfmtExpr() {
        return hbfmtExpr;
    }

    /**
     * 
     * @param hbfmtExpr 
     */
    public void setHbfmtExpr(String hbfmtExpr) {
        this.hbfmtExpr = hbfmtExpr == null ? null : hbfmtExpr.trim();
    }

    /**
     * 
     * @return wsdl_name_space 
     */
    public String getWsdlNameSpace() {
        return wsdlNameSpace;
    }

    /**
     * 
     * @param wsdlNameSpace 
     */
    public void setWsdlNameSpace(String wsdlNameSpace) {
        this.wsdlNameSpace = wsdlNameSpace == null ? null : wsdlNameSpace.trim();
    }

    /**
     * 
     * @return wsdl_ns 
     */
    public String getWsdlNs() {
        return wsdlNs;
    }

    /**
     * 
     * @param wsdlNs 
     */
    public void setWsdlNs(String wsdlNs) {
        this.wsdlNs = wsdlNs == null ? null : wsdlNs.trim();
    }

    /**
     * 
     * @return fmt_send_begin 
     */
    public String getFmtSendBegin() {
        return fmtSendBegin;
    }

    /**
     * 
     * @param fmtSendBegin 
     */
    public void setFmtSendBegin(String fmtSendBegin) {
        this.fmtSendBegin = fmtSendBegin == null ? null : fmtSendBegin.trim();
    }

    /**
     * 
     * @return fmt_recv_begin 
     */
    public String getFmtRecvBegin() {
        return fmtRecvBegin;
    }

    /**
     * 
     * @param fmtRecvBegin 
     */
    public void setFmtRecvBegin(String fmtRecvBegin) {
        this.fmtRecvBegin = fmtRecvBegin == null ? null : fmtRecvBegin.trim();
    }

    /**
     * 
     * @return soap_binding 
     */
    public String getSoapBinding() {
        return soapBinding;
    }

    /**
     * 
     * @param soapBinding 
     */
    public void setSoapBinding(String soapBinding) {
        this.soapBinding = soapBinding == null ? null : soapBinding.trim();
    }

    /**
     * 
     * @return is_have_prefix 
     */
    public String getIsHavePrefix() {
        return isHavePrefix;
    }

    /**
     * 
     * @param isHavePrefix 
     */
    public void setIsHavePrefix(String isHavePrefix) {
        this.isHavePrefix = isHavePrefix == null ? null : isHavePrefix.trim();
    }

    /**
     * 
     * @return encode 
     */
    public String getEncode() {
        return encode;
    }

    /**
     * 
     * @param encode 
     */
    public void setEncode(String encode) {
        this.encode = encode == null ? null : encode.trim();
    }
}