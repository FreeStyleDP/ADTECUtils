package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCloudProject;

public interface EstCloudProjectMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String cloudProjectId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCloudProject selectByPrimaryKey(String cloudProjectId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCloudProject record);
}