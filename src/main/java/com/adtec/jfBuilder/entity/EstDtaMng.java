package com.adtec.jfBuilder.entity;

public class EstDtaMng extends EstDtaMngKey {
    /**
     * 
     */
    private String startMode;

    /**
     * 
     */
    private String logLevel;

    /**
     * 
     */
    private String logDir;

    /**
     * 
     */
    private Short logSize;

    /**
     * 
     */
    private String logGrade;

    /**
     * 
     */
    private String autoDel;

    /**
     * 
     */
    private String extComLog;

    /**
     * 
     */
    private String fmtLog;

    /**
     * 
     */
    private String exprLog;

    /**
     * 
     */
    private String rutLog;

    /**
     * 
     */
    private String flwLog;

    /**
     * 
     */
    private String revsLog;

    /**
     * 
     */
    private String dbLog;

    /**
     * 
     */
    private String cfLog;

    /**
     * 
     */
    private String epxLog;

    /**
     * 
     */
    private String fileLog;

    /**
     * 
     */
    private String locale;

    /**
     * 
     */
    private Integer reglvl;

    /**
     * 
     */
    private String operDb;

    /**
     * 
     */
    private String transFlag;

    /**
     * 
     */
    private Integer transNum;

    /**
     * 
     */
    private String timeFlag;

    /**
     * 
     */
    private Integer runTime;

    /**
     * 
     */
    private String memFlag;

    /**
     * 
     */
    private Integer memSize;

    /**
     * 
     */
    private Integer asynDwork;

    /**
     * 
     */
    private Integer sendInst;

    /**
     * 
     */
    private Integer subsysRut;

    /**
     * 
     */
    private Integer maxConnNum;

    /**
     * 
     */
    private String addrCheck;

    /**
     * 
     */
    private String addrClean;

    /**
     * 
     */
    private String tranLog;

    /**
     * 
     */
    private Integer rollingLog;

    /**
     * 
     */
    private String catchFlag;

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
     */
    private String getsvrFlag;

    /**
     * 
     */
    private String version;

    /**
     * 
     */
    private String regsvrFlag;

    /**
     * 
     */
    private String getsvrExpr;

    /**
     * 
     */
    private String regsvrExpr;

    /**
     * 
     */
    private String addsvcFlag;

    /**
     * 
     */
    private String getsvrType;

    /**
     * 
     * @return start_mode 
     */
    public String getStartMode() {
        return startMode;
    }

    /**
     * 
     * @param startMode 
     */
    public void setStartMode(String startMode) {
        this.startMode = startMode == null ? null : startMode.trim();
    }

    /**
     * 
     * @return log_level 
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * 
     * @param logLevel 
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    /**
     * 
     * @return log_dir 
     */
    public String getLogDir() {
        return logDir;
    }

    /**
     * 
     * @param logDir 
     */
    public void setLogDir(String logDir) {
        this.logDir = logDir == null ? null : logDir.trim();
    }

    /**
     * 
     * @return log_size 
     */
    public Short getLogSize() {
        return logSize;
    }

    /**
     * 
     * @param logSize 
     */
    public void setLogSize(Short logSize) {
        this.logSize = logSize;
    }

    /**
     * 
     * @return log_grade 
     */
    public String getLogGrade() {
        return logGrade;
    }

    /**
     * 
     * @param logGrade 
     */
    public void setLogGrade(String logGrade) {
        this.logGrade = logGrade == null ? null : logGrade.trim();
    }

    /**
     * 
     * @return auto_del 
     */
    public String getAutoDel() {
        return autoDel;
    }

    /**
     * 
     * @param autoDel 
     */
    public void setAutoDel(String autoDel) {
        this.autoDel = autoDel == null ? null : autoDel.trim();
    }

    /**
     * 
     * @return ext_com_log 
     */
    public String getExtComLog() {
        return extComLog;
    }

    /**
     * 
     * @param extComLog 
     */
    public void setExtComLog(String extComLog) {
        this.extComLog = extComLog == null ? null : extComLog.trim();
    }

    /**
     * 
     * @return fmt_log 
     */
    public String getFmtLog() {
        return fmtLog;
    }

    /**
     * 
     * @param fmtLog 
     */
    public void setFmtLog(String fmtLog) {
        this.fmtLog = fmtLog == null ? null : fmtLog.trim();
    }

    /**
     * 
     * @return expr_log 
     */
    public String getExprLog() {
        return exprLog;
    }

    /**
     * 
     * @param exprLog 
     */
    public void setExprLog(String exprLog) {
        this.exprLog = exprLog == null ? null : exprLog.trim();
    }

    /**
     * 
     * @return rut_log 
     */
    public String getRutLog() {
        return rutLog;
    }

    /**
     * 
     * @param rutLog 
     */
    public void setRutLog(String rutLog) {
        this.rutLog = rutLog == null ? null : rutLog.trim();
    }

    /**
     * 
     * @return flw_log 
     */
    public String getFlwLog() {
        return flwLog;
    }

    /**
     * 
     * @param flwLog 
     */
    public void setFlwLog(String flwLog) {
        this.flwLog = flwLog == null ? null : flwLog.trim();
    }

    /**
     * 
     * @return revs_log 
     */
    public String getRevsLog() {
        return revsLog;
    }

    /**
     * 
     * @param revsLog 
     */
    public void setRevsLog(String revsLog) {
        this.revsLog = revsLog == null ? null : revsLog.trim();
    }

    /**
     * 
     * @return db_log 
     */
    public String getDbLog() {
        return dbLog;
    }

    /**
     * 
     * @param dbLog 
     */
    public void setDbLog(String dbLog) {
        this.dbLog = dbLog == null ? null : dbLog.trim();
    }

    /**
     * 
     * @return cf_log 
     */
    public String getCfLog() {
        return cfLog;
    }

    /**
     * 
     * @param cfLog 
     */
    public void setCfLog(String cfLog) {
        this.cfLog = cfLog == null ? null : cfLog.trim();
    }

    /**
     * 
     * @return epx_log 
     */
    public String getEpxLog() {
        return epxLog;
    }

    /**
     * 
     * @param epxLog 
     */
    public void setEpxLog(String epxLog) {
        this.epxLog = epxLog == null ? null : epxLog.trim();
    }

    /**
     * 
     * @return file_log 
     */
    public String getFileLog() {
        return fileLog;
    }

    /**
     * 
     * @param fileLog 
     */
    public void setFileLog(String fileLog) {
        this.fileLog = fileLog == null ? null : fileLog.trim();
    }

    /**
     * 
     * @return locale 
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale 
     */
    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    /**
     * 
     * @return reglvl 
     */
    public Integer getReglvl() {
        return reglvl;
    }

    /**
     * 
     * @param reglvl 
     */
    public void setReglvl(Integer reglvl) {
        this.reglvl = reglvl;
    }

    /**
     * 
     * @return oper_db 
     */
    public String getOperDb() {
        return operDb;
    }

    /**
     * 
     * @param operDb 
     */
    public void setOperDb(String operDb) {
        this.operDb = operDb == null ? null : operDb.trim();
    }

    /**
     * 
     * @return trans_flag 
     */
    public String getTransFlag() {
        return transFlag;
    }

    /**
     * 
     * @param transFlag 
     */
    public void setTransFlag(String transFlag) {
        this.transFlag = transFlag == null ? null : transFlag.trim();
    }

    /**
     * 
     * @return trans_num 
     */
    public Integer getTransNum() {
        return transNum;
    }

    /**
     * 
     * @param transNum 
     */
    public void setTransNum(Integer transNum) {
        this.transNum = transNum;
    }

    /**
     * 
     * @return time_flag 
     */
    public String getTimeFlag() {
        return timeFlag;
    }

    /**
     * 
     * @param timeFlag 
     */
    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag == null ? null : timeFlag.trim();
    }

    /**
     * 
     * @return run_time 
     */
    public Integer getRunTime() {
        return runTime;
    }

    /**
     * 
     * @param runTime 
     */
    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    /**
     * 
     * @return mem_flag 
     */
    public String getMemFlag() {
        return memFlag;
    }

    /**
     * 
     * @param memFlag 
     */
    public void setMemFlag(String memFlag) {
        this.memFlag = memFlag == null ? null : memFlag.trim();
    }

    /**
     * 
     * @return mem_size 
     */
    public Integer getMemSize() {
        return memSize;
    }

    /**
     * 
     * @param memSize 
     */
    public void setMemSize(Integer memSize) {
        this.memSize = memSize;
    }

    /**
     * 
     * @return asyn_dwork 
     */
    public Integer getAsynDwork() {
        return asynDwork;
    }

    /**
     * 
     * @param asynDwork 
     */
    public void setAsynDwork(Integer asynDwork) {
        this.asynDwork = asynDwork;
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
     * @return subsys_rut 
     */
    public Integer getSubsysRut() {
        return subsysRut;
    }

    /**
     * 
     * @param subsysRut 
     */
    public void setSubsysRut(Integer subsysRut) {
        this.subsysRut = subsysRut;
    }

    /**
     * 
     * @return max_conn_num 
     */
    public Integer getMaxConnNum() {
        return maxConnNum;
    }

    /**
     * 
     * @param maxConnNum 
     */
    public void setMaxConnNum(Integer maxConnNum) {
        this.maxConnNum = maxConnNum;
    }

    /**
     * 
     * @return addr_check 
     */
    public String getAddrCheck() {
        return addrCheck;
    }

    /**
     * 
     * @param addrCheck 
     */
    public void setAddrCheck(String addrCheck) {
        this.addrCheck = addrCheck == null ? null : addrCheck.trim();
    }

    /**
     * 
     * @return addr_clean 
     */
    public String getAddrClean() {
        return addrClean;
    }

    /**
     * 
     * @param addrClean 
     */
    public void setAddrClean(String addrClean) {
        this.addrClean = addrClean == null ? null : addrClean.trim();
    }

    /**
     * 
     * @return tran_log 
     */
    public String getTranLog() {
        return tranLog;
    }

    /**
     * 
     * @param tranLog 
     */
    public void setTranLog(String tranLog) {
        this.tranLog = tranLog == null ? null : tranLog.trim();
    }

    /**
     * 
     * @return rolling_log 
     */
    public Integer getRollingLog() {
        return rollingLog;
    }

    /**
     * 
     * @param rollingLog 
     */
    public void setRollingLog(Integer rollingLog) {
        this.rollingLog = rollingLog;
    }

    /**
     * 
     * @return catch_flag 
     */
    public String getCatchFlag() {
        return catchFlag;
    }

    /**
     * 
     * @param catchFlag 
     */
    public void setCatchFlag(String catchFlag) {
        this.catchFlag = catchFlag == null ? null : catchFlag.trim();
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

    /**
     * 
     * @return getsvr_flag 
     */
    public String getGetsvrFlag() {
        return getsvrFlag;
    }

    /**
     * 
     * @param getsvrFlag 
     */
    public void setGetsvrFlag(String getsvrFlag) {
        this.getsvrFlag = getsvrFlag == null ? null : getsvrFlag.trim();
    }

    /**
     * 
     * @return version 
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 
     * @return regsvr_flag 
     */
    public String getRegsvrFlag() {
        return regsvrFlag;
    }

    /**
     * 
     * @param regsvrFlag 
     */
    public void setRegsvrFlag(String regsvrFlag) {
        this.regsvrFlag = regsvrFlag == null ? null : regsvrFlag.trim();
    }

    /**
     * 
     * @return getsvr_expr 
     */
    public String getGetsvrExpr() {
        return getsvrExpr;
    }

    /**
     * 
     * @param getsvrExpr 
     */
    public void setGetsvrExpr(String getsvrExpr) {
        this.getsvrExpr = getsvrExpr == null ? null : getsvrExpr.trim();
    }

    /**
     * 
     * @return regsvr_expr 
     */
    public String getRegsvrExpr() {
        return regsvrExpr;
    }

    /**
     * 
     * @param regsvrExpr 
     */
    public void setRegsvrExpr(String regsvrExpr) {
        this.regsvrExpr = regsvrExpr == null ? null : regsvrExpr.trim();
    }

    /**
     * 
     * @return addsvc_flag 
     */
    public String getAddsvcFlag() {
        return addsvcFlag;
    }

    /**
     * 
     * @param addsvcFlag 
     */
    public void setAddsvcFlag(String addsvcFlag) {
        this.addsvcFlag = addsvcFlag == null ? null : addsvcFlag.trim();
    }

    /**
     * 
     * @return getsvr_type 
     */
    public String getGetsvrType() {
        return getsvrType;
    }

    /**
     * 
     * @param getsvrType 
     */
    public void setGetsvrType(String getsvrType) {
        this.getsvrType = getsvrType == null ? null : getsvrType.trim();
    }
}