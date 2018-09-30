package com.adtec.jfBuilder.entity;

public class EstDevJnl {
    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String modDate;

    /**
     * 
     */
    private String relationId;

    /**
     * 
     */
    private String userType;

    /**
     * 
     */
    private String infoType;

    /**
     * 
     */
    private String infoName;

    /**
     * 
     */
    private String action;

    /**
     * 
     */
    private String summary;

    /**
     * 
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 
     * @return mod_date 
     */
    public String getModDate() {
        return modDate;
    }

    /**
     * 
     * @param modDate 
     */
    public void setModDate(String modDate) {
        this.modDate = modDate == null ? null : modDate.trim();
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
     * @return user_type 
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 
     * @param userType 
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 
     * @return info_type 
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * 
     * @param infoType 
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    /**
     * 
     * @return info_name 
     */
    public String getInfoName() {
        return infoName;
    }

    /**
     * 
     * @param infoName 
     */
    public void setInfoName(String infoName) {
        this.infoName = infoName == null ? null : infoName.trim();
    }

    /**
     * 
     * @return action 
     */
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action 
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 
     * @return summary 
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary 
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}