package com.adtec.jfBuilder.entity;

public class EstTaskidItemKey {
    /**
     * 
     */
    private String taskidId;

    /**
     * 
     */
    private String resType;

    /**
     * 
     */
    private String resId;

    /**
     * 
     */
    private String resPath;

    /**
     * 
     * @return taskid_id 
     */
    public String getTaskidId() {
        return taskidId;
    }

    /**
     * 
     * @param taskidId 
     */
    public void setTaskidId(String taskidId) {
        this.taskidId = taskidId == null ? null : taskidId.trim();
    }

    /**
     * 
     * @return res_type 
     */
    public String getResType() {
        return resType;
    }

    /**
     * 
     * @param resType 
     */
    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    /**
     * 
     * @return res_id 
     */
    public String getResId() {
        return resId;
    }

    /**
     * 
     * @param resId 
     */
    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    /**
     * 
     * @return res_path 
     */
    public String getResPath() {
        return resPath;
    }

    /**
     * 
     * @param resPath 
     */
    public void setResPath(String resPath) {
        this.resPath = resPath == null ? null : resPath.trim();
    }
}