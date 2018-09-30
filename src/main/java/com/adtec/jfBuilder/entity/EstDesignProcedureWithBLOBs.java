package com.adtec.jfBuilder.entity;

public class EstDesignProcedureWithBLOBs extends EstDesignProcedure {
    /**
     * 
     */
    private String codeStr;

    /**
     * 
     */
    private String procedureStr;

    /**
     * 
     * @return code_str 
     */
    public String getCodeStr() {
        return codeStr;
    }

    /**
     * 
     * @param codeStr 
     */
    public void setCodeStr(String codeStr) {
        this.codeStr = codeStr == null ? null : codeStr.trim();
    }

    /**
     * 
     * @return procedure_str 
     */
    public String getProcedureStr() {
        return procedureStr;
    }

    /**
     * 
     * @param procedureStr 
     */
    public void setProcedureStr(String procedureStr) {
        this.procedureStr = procedureStr == null ? null : procedureStr.trim();
    }
}