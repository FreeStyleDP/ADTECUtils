package com.adtec.jfBuilder.entity;

public class EstFormItemKey {
    /**
     * 
     */
    private String formId;

    /**
     * 
     */
    private Short itemId;

    /**
     * 
     * @return form_id 
     */
    public String getFormId() {
        return formId;
    }

    /**
     * 
     * @param formId 
     */
    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    /**
     * 
     * @return item_id 
     */
    public Short getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId 
     */
    public void setItemId(Short itemId) {
        this.itemId = itemId;
    }
}