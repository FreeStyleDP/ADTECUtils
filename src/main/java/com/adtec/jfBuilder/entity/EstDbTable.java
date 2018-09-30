package com.adtec.jfBuilder.entity;

public class EstDbTable {
    /**
     * 
     */
    private Integer tabid;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String tabname;

    /**
     * 
     */
    private Short ncols;

    /**
     * 
     */
    private Short indexNum;

    /**
     * 
     * @return tabid 
     */
    public Integer getTabid() {
        return tabid;
    }

    /**
     * 
     * @param tabid 
     */
    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    /**
     * 
     * @return relation_id 
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * 
     * @param relationId 
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    /**
     * 
     * @return tabname 
     */
    public String getTabname() {
        return tabname;
    }

    /**
     * 
     * @param tabname 
     */
    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    /**
     * 
     * @return ncols 
     */
    public Short getNcols() {
        return ncols;
    }

    /**
     * 
     * @param ncols 
     */
    public void setNcols(Short ncols) {
        this.ncols = ncols;
    }

    /**
     * 
     * @return index_num 
     */
    public Short getIndexNum() {
        return indexNum;
    }

    /**
     * 
     * @param indexNum 
     */
    public void setIndexNum(Short indexNum) {
        this.indexNum = indexNum;
    }
}