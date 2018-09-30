package com.adtec.jfBuilder.entity;

public class EstEventExpr extends EstEventExprKey {
    /**
     * 
     */
    private Short eventExprType;

    /**
     * 
     */
    private String eventExprProc;

    /**
     * 
     */
    private String eventExprDesc;

    /**
     * 
     */
    private String compId;

    /**
     * 
     * @return event_expr_type 
     */
    public Short getEventExprType() {
        return eventExprType;
    }

    /**
     * 
     * @param eventExprType 
     */
    public void setEventExprType(Short eventExprType) {
        this.eventExprType = eventExprType;
    }

    /**
     * 
     * @return event_expr_proc 
     */
    public String getEventExprProc() {
        return eventExprProc;
    }

    /**
     * 
     * @param eventExprProc 
     */
    public void setEventExprProc(String eventExprProc) {
        this.eventExprProc = eventExprProc == null ? null : eventExprProc.trim();
    }

    /**
     * 
     * @return event_expr_desc 
     */
    public String getEventExprDesc() {
        return eventExprDesc;
    }

    /**
     * 
     * @param eventExprDesc 
     */
    public void setEventExprDesc(String eventExprDesc) {
        this.eventExprDesc = eventExprDesc == null ? null : eventExprDesc.trim();
    }

    /**
     * 
     * @return comp_id 
     */
    public String getCompId() {
        return compId;
    }

    /**
     * 
     * @param compId 
     */
    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }
}