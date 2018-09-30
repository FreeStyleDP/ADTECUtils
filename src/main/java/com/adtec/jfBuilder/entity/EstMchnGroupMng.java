package com.adtec.jfBuilder.entity;

public class EstMchnGroupMng {
    /**
     * 
     */
    private String mchnId;

    /**
     * 
     */
    private String groupId;

    /**
     * 
     * @return mchn_id 
     */
    public String getMchnId() {
        return mchnId;
    }

    /**
     * 
     * @param mchnId 
     */
    public void setMchnId(String mchnId) {
        this.mchnId = mchnId == null ? null : mchnId.trim();
    }

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
}