package com.adtec.jfBuilder.entity;

public class EstIdMng {
    /**
     * 
     */
    private String idType;

    /**
     * 
     */
    private String idDesc;

    /**
     * 
     */
    private String idNo;

    /**
     * 
     * @return id_type 
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 
     * @param idType 
     */
    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    /**
     * 
     * @return id_desc 
     */
    public String getIdDesc() {
        return idDesc;
    }

    /**
     * 
     * @param idDesc 
     */
    public void setIdDesc(String idDesc) {
        this.idDesc = idDesc == null ? null : idDesc.trim();
    }

    /**
     * 
     * @return id_no 
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 
     * @param idNo 
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }
}