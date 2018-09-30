package com.adtec.jfBuilder.entity;

public class EstElmapElement {
    /**
     * 
     */
    private String elmapId;

    /**
     * 
     */
    private Short itemId;

    /**
     * 
     */
    private String sourceType;

    /**
     * 
     */
    private String sourcePath;

    /**
     * 
     */
    private String destType;

    /**
     * 
     */
    private String destPath;

    /**
     * 
     */
    private String ioType;

    /**
     * 
     * @return elmap_id 
     */
    public String getElmapId() {
        return elmapId;
    }

    /**
     * 
     * @param elmapId 
     */
    public void setElmapId(String elmapId) {
        this.elmapId = elmapId == null ? null : elmapId.trim();
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

    /**
     * 
     * @return source_type 
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 
     * @param sourceType 
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * 
     * @return source_path 
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * 
     * @param sourcePath 
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath == null ? null : sourcePath.trim();
    }

    /**
     * 
     * @return dest_type 
     */
    public String getDestType() {
        return destType;
    }

    /**
     * 
     * @param destType 
     */
    public void setDestType(String destType) {
        this.destType = destType == null ? null : destType.trim();
    }

    /**
     * 
     * @return dest_path 
     */
    public String getDestPath() {
        return destPath;
    }

    /**
     * 
     * @param destPath 
     */
    public void setDestPath(String destPath) {
        this.destPath = destPath == null ? null : destPath.trim();
    }

    /**
     * 
     * @return io_type 
     */
    public String getIoType() {
        return ioType;
    }

    /**
     * 
     * @param ioType 
     */
    public void setIoType(String ioType) {
        this.ioType = ioType == null ? null : ioType.trim();
    }
}