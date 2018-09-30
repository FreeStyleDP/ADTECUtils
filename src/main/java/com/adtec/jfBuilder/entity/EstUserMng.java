package com.adtec.jfBuilder.entity;

public class EstUserMng {
    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userDesc;

    /**
     * 
     */
    private String userType;

    /**
     * 
     */
    private String userPwd;

    /**
     * 
     */
    private String userStat;

    /**
     * 
     */
    private String grpId;

    /**
     * 
     */
    private String crtDate;

    /**
     * 
     */
    private String lstLoginDate;

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
     * @return user_desc 
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * 
     * @param userDesc 
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
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
     * @return user_pwd 
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 
     * @param userPwd 
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 
     * @return user_stat 
     */
    public String getUserStat() {
        return userStat;
    }

    /**
     * 
     * @param userStat 
     */
    public void setUserStat(String userStat) {
        this.userStat = userStat == null ? null : userStat.trim();
    }

    /**
     * 
     * @return grp_id 
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * 
     * @param grpId 
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId == null ? null : grpId.trim();
    }

    /**
     * 
     * @return crt_date 
     */
    public String getCrtDate() {
        return crtDate;
    }

    /**
     * 
     * @param crtDate 
     */
    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate == null ? null : crtDate.trim();
    }

    /**
     * 
     * @return lst_login_date 
     */
    public String getLstLoginDate() {
        return lstLoginDate;
    }

    /**
     * 
     * @param lstLoginDate 
     */
    public void setLstLoginDate(String lstLoginDate) {
        this.lstLoginDate = lstLoginDate == null ? null : lstLoginDate.trim();
    }
}