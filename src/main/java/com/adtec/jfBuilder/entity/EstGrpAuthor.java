package com.adtec.jfBuilder.entity;

public class EstGrpAuthor extends EstGrpAuthorKey {
    /**
     * 
     */
    private String authorType;

    /**
     * 
     */
    private String authorRes;

    /**
     * 
     * @return author_type 
     */
    public String getAuthorType() {
        return authorType;
    }

    /**
     * 
     * @param authorType 
     */
    public void setAuthorType(String authorType) {
        this.authorType = authorType == null ? null : authorType.trim();
    }

    /**
     * 
     * @return author_res 
     */
    public String getAuthorRes() {
        return authorRes;
    }

    /**
     * 
     * @param authorRes 
     */
    public void setAuthorRes(String authorRes) {
        this.authorRes = authorRes == null ? null : authorRes.trim();
    }
}