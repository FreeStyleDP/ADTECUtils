package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstProject;

public interface EstProjectMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String projectId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstProject selectByPrimaryKey(String projectId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstProject record);
    
    EstProject selectByProjectName(String projectName);
}