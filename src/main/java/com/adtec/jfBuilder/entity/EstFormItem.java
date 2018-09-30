package com.adtec.jfBuilder.entity;

public class EstFormItem extends EstFormItemKey {
    /**
     * 
     */
    private String elemId;

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