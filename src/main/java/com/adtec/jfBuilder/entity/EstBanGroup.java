package com.adtec.jfBuilder.entity;

public class EstBanGroup {
    /**
     * 
     */
    private String groupId;

    /**
     * 
     */
    private String pastGroupId;

    /**
     * 
     * @return group_id 
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * 
     * @return past_group_id 
     */
    public String getPastGroupId() {
        return pastGroupId;
    }

    /**
     * 
     * @param pastGroupId 
     */
    public void setPastGroupId(String pastGroupId) {
        this.pastGroupId = pastGroupId == null ? null : pastGroupId.trim();
    }
}