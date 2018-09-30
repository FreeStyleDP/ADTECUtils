package com.adtec.jfBuilder.entity;

public class EstService {
    /**
     * 
     */
    private String svcId;

    /**
     * 
     */
    private String dtaId;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String svcName;

    /**
     * 
     */
    private String svcDesc;

    /**
     * 
     */
    private Integer timeOut;

    /**
     * 
     */
    private String destTimeout;

    /**
     * 
     */
    private String recJrnl;

    /**
     * 
     */
    private Integer tranPrio;

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
    private String revsSeq;

    /**
     * 
     */
    private String compsSeq;

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
    private String pFile;

    /**
     * 
     */
    private String bFile;

    /**
     * 
     */
    private Short tranFlag;

    /**
     * 
     */
    private String extCode;

    /**
     * 
     */
    private String iFile;

    /**
     * 
     */
    private String oFile;

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
    private String revsFlag;

    /**
     * 
     */
    private String revsDtaType;

    /**
     * 
     */
    private String revsDtaId;

    /**
     * 
     */
    private String revsSvcName;

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
    private String compsFlag;

    /**
     * 
     */
    private String compsDtaType;

    /**
     * 
     */
    private String compsDtaId;

    /**
     * 
     */
    private String compsSvcName;

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
    private String evtOfmtEnd;

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
    private String resourceId;

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
    private String elemIn;

    /**
     * 
     */
    private String elemOut;

    /**
     * 
     */
    private String extCodeExpr;

    /**
     * 
     */
    private String isWsdl;

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
    private String soapBinding;

    /**
     * 
     */
    private String isHavePrefix;

    /**
     * 
     * @return svc_id 
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * 
     * @param svcId 
     */
    public void setSvcId(String svcId) {
        this.svcId = svcId == null ? null : svcId.trim();
    }

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
     * @return svc_name 
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * 
     * @param svcName 
     */
    public void setSvcName(String svcName) {
        this.svcName = svcName == null ? null : svcName.trim();
    }

    /**
     * 
     * @return svc_desc 
     */
    public String getSvcDesc() {
        return svcDesc;
    }

    /**
     * 
     * @param svcDesc 
     */
    public void setSvcDesc(String svcDesc) {
        this.svcDesc = svcDesc == null ? null : svcDesc.trim();
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
     * @return dest_timeout 
     */
    public String getDestTimeout() {
        return destTimeout;
    }

    /**
     * 
     * @param destTimeout 
     */
    public void setDestTimeout(String destTimeout) {
        this.destTimeout = destTimeout == null ? null : destTimeout.trim();
    }

    /**
     * 
     * @return rec_jrnl 
     */
    public String getRecJrnl() {
        return recJrnl;
    }

    /**
     * 
     * @param recJrnl 
     */
    public void setRecJrnl(String recJrnl) {
        this.recJrnl = recJrnl == null ? null : recJrnl.trim();
    }

    /**
     * 
     * @return tran_prio 
     */
    public Integer getTranPrio() {
        return tranPrio;
    }

    /**
     * 
     * @param tranPrio 
     */
    public void setTranPrio(Integer tranPrio) {
        this.tranPrio = tranPrio;
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
     * @return revs_seq 
     */
    public String getRevsSeq() {
        return revsSeq;
    }

    /**
     * 
     * @param revsSeq 
     */
    public void setRevsSeq(String revsSeq) {
        this.revsSeq = revsSeq == null ? null : revsSeq.trim();
    }

    /**
     * 
     * @return comps_seq 
     */
    public String getCompsSeq() {
        return compsSeq;
    }

    /**
     * 
     * @param compsSeq 
     */
    public void setCompsSeq(String compsSeq) {
        this.compsSeq = compsSeq == null ? null : compsSeq.trim();
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
     * @return p_file 
     */
    public String getpFile() {
        return pFile;
    }

    /**
     * 
     * @param pFile 
     */
    public void setpFile(String pFile) {
        this.pFile = pFile == null ? null : pFile.trim();
    }

    /**
     * 
     * @return b_file 
     */
    public String getbFile() {
        return bFile;
    }

    /**
     * 
     * @param bFile 
     */
    public void setbFile(String bFile) {
        this.bFile = bFile == null ? null : bFile.trim();
    }

    /**
     * 
     * @return tran_flag 
     */
    public Short getTranFlag() {
        return tranFlag;
    }

    /**
     * 
     * @param tranFlag 
     */
    public void setTranFlag(Short tranFlag) {
        this.tranFlag = tranFlag;
    }

    /**
     * 
     * @return ext_code 
     */
    public String getExtCode() {
        return extCode;
    }

    /**
     * 
     * @param extCode 
     */
    public void setExtCode(String extCode) {
        this.extCode = extCode == null ? null : extCode.trim();
    }

    /**
     * 
     * @return i_file 
     */
    public String getiFile() {
        return iFile;
    }

    /**
     * 
     * @param iFile 
     */
    public void setiFile(String iFile) {
        this.iFile = iFile == null ? null : iFile.trim();
    }

    /**
     * 
     * @return o_file 
     */
    public String getoFile() {
        return oFile;
    }

    /**
     * 
     * @param oFile 
     */
    public void setoFile(String oFile) {
        this.oFile = oFile == null ? null : oFile.trim();
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
     * @return revs_flag 
     */
    public String getRevsFlag() {
        return revsFlag;
    }

    /**
     * 
     * @param revsFlag 
     */
    public void setRevsFlag(String revsFlag) {
        this.revsFlag = revsFlag == null ? null : revsFlag.trim();
    }

    /**
     * 
     * @return revs_dta_type 
     */
    public String getRevsDtaType() {
        return revsDtaType;
    }

    /**
     * 
     * @param revsDtaType 
     */
    public void setRevsDtaType(String revsDtaType) {
        this.revsDtaType = revsDtaType == null ? null : revsDtaType.trim();
    }

    /**
     * 
     * @return revs_dta_id 
     */
    public String getRevsDtaId() {
        return revsDtaId;
    }

    /**
     * 
     * @param revsDtaId 
     */
    public void setRevsDtaId(String revsDtaId) {
        this.revsDtaId = revsDtaId == null ? null : revsDtaId.trim();
    }

    /**
     * 
     * @return revs_svc_name 
     */
    public String getRevsSvcName() {
        return revsSvcName;
    }

    /**
     * 
     * @param revsSvcName 
     */
    public void setRevsSvcName(String revsSvcName) {
        this.revsSvcName = revsSvcName == null ? null : revsSvcName.trim();
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
     * @return comps_flag 
     */
    public String getCompsFlag() {
        return compsFlag;
    }

    /**
     * 
     * @param compsFlag 
     */
    public void setCompsFlag(String compsFlag) {
        this.compsFlag = compsFlag == null ? null : compsFlag.trim();
    }

    /**
     * 
     * @return comps_dta_type 
     */
    public String getCompsDtaType() {
        return compsDtaType;
    }

    /**
     * 
     * @param compsDtaType 
     */
    public void setCompsDtaType(String compsDtaType) {
        this.compsDtaType = compsDtaType == null ? null : compsDtaType.trim();
    }

    /**
     * 
     * @return comps_dta_id 
     */
    public String getCompsDtaId() {
        return compsDtaId;
    }

    /**
     * 
     * @param compsDtaId 
     */
    public void setCompsDtaId(String compsDtaId) {
        this.compsDtaId = compsDtaId == null ? null : compsDtaId.trim();
    }

    /**
     * 
     * @return comps_svc_name 
     */
    public String getCompsSvcName() {
        return compsSvcName;
    }

    /**
     * 
     * @param compsSvcName 
     */
    public void setCompsSvcName(String compsSvcName) {
        this.compsSvcName = compsSvcName == null ? null : compsSvcName.trim();
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
     * @return evt_ofmt_end 
     */
    public String getEvtOfmtEnd() {
        return evtOfmtEnd;
    }

    /**
     * 
     * @param evtOfmtEnd 
     */
    public void setEvtOfmtEnd(String evtOfmtEnd) {
        this.evtOfmtEnd = evtOfmtEnd == null ? null : evtOfmtEnd.trim();
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
     * @return resource_id 
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId 
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
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
     * @return elem_in 
     */
    public String getElemIn() {
        return elemIn;
    }

    /**
     * 
     * @param elemIn 
     */
    public void setElemIn(String elemIn) {
        this.elemIn = elemIn == null ? null : elemIn.trim();
    }

    /**
     * 
     * @return elem_out 
     */
    public String getElemOut() {
        return elemOut;
    }

    /**
     * 
     * @param elemOut 
     */
    public void setElemOut(String elemOut) {
        this.elemOut = elemOut == null ? null : elemOut.trim();
    }

    /**
     * 
     * @return ext_code_expr 
     */
    public String getExtCodeExpr() {
        return extCodeExpr;
    }

    /**
     * 
     * @param extCodeExpr 
     */
    public void setExtCodeExpr(String extCodeExpr) {
        this.extCodeExpr = extCodeExpr == null ? null : extCodeExpr.trim();
    }

    /**
     * 
     * @return is_wsdl 
     */
    public String getIsWsdl() {
        return isWsdl;
    }

    /**
     * 
     * @param isWsdl 
     */
    public void setIsWsdl(String isWsdl) {
        this.isWsdl = isWsdl == null ? null : isWsdl.trim();
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
}