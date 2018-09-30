package com.adtec.jfBuilder.entity;

public class EstDataInheritKey {
    /**
     * 
     */
    private String objId;

    /**
     * 
     */
    private String objType;

    /**
     * 
     */
    private String inheritObjId;

    /**
     * 
     */
    private String inheritObjType;

    /**
     * 
     * @return obj_id 
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 
     * @param objId 
     */
    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    /**
     * 
     * @return obj_type 
     */
    public String getObjType() {
        return objType;
    }

    /**
     * 
     * @param objType 
     */
    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
    }

    /**
     * 
     * @return inherit_obj_id 
     */
    public String getInheritObjId() {
        return inheritObjId;
    }

    /**
     * 
     * @param inheritObjId 
     */
    public void setInheritObjId(String inheritObjId) {
        this.inheritObjId = inheritObjId == null ? null : inheritObjId.trim();
    }

    /**
     * 
     * @return inherit_obj_type 
     */
    public String getInheritObjType() {
        return inheritObjType;
    }

    /**
     * 
     * @param inheritObjType 
     */
    public void setInheritObjType(String inheritObjType) {
        this.inheritObjType = inheritObjType == null ? null : inheritObjType.trim();
    }
}