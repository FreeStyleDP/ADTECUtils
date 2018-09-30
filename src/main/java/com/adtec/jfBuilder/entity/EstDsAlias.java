package com.adtec.jfBuilder.entity;

public class EstDsAlias {
    /**
     * 
     */
    private String dsId;

    /**
     * 
     */
    private String projectId;

    /**
     * 
     */
    private String dsName;

    /**
     * 
     */
    private String dsDesc;

    /**
     * 
     * @return ds_id 
     */
    public String getDsId() {
        return dsId;
    }

    /**
     * 
     * @param dsId 
     */
    public void setDsId(String dsId) {
        this.dsId = dsId == null ? null : dsId.trim();
    }

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
     * @return ds_name 
     */
    public String getDsName() {
        return dsName;
    }

    /**
     * 
     * @param dsName 
     */
    public void setDsName(String dsName) {
        this.dsName = dsName == null ? null : dsName.trim();
    }

    /**
     * 
     * @return ds_desc 
     */
    public String getDsDesc() {
        return dsDesc;
    }

    /**
     * 
     * @param dsDesc 
     */
    public void setDsDesc(String dsDesc) {
        this.dsDesc = dsDesc == null ? null : dsDesc.trim();
    }
}