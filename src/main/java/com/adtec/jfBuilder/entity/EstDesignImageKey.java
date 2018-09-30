package com.adtec.jfBuilder.entity;

public class EstDesignImageKey {
    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String designId;

    /**
     * 
     */
    private String designTyep;

    /**
     * 
     * @return project_id 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 
     * @return design_id 
     */
    public String getDesignId() {
        return designId;
    }

    /**
     * 
     * @param designId 
     */
    public void setDesignId(String designId) {
        this.designId = designId == null ? null : designId.trim();
    }

    /**
     * 
     * @return design_tyep 
     */
    public String getDesignTyep() {
        return designTyep;
    }

    /**
     * 
     * @param designTyep 
     */
    public void setDesignTyep(String designTyep) {
        this.designTyep = designTyep == null ? null : designTyep.trim();
    }
}