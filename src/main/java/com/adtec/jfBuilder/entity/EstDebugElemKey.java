package com.adtec.jfBuilder.entity;

public class EstDebugElemKey {
    /**
     * 
     */
    private String unionId;

    /**
     * 
     */
    private String elemId;

    /**
     * 
     * @return union_id 
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 
     * @param unionId 
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
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
}