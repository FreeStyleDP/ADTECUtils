package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCloudProjectDetail;

public interface EstCloudProjectDetailMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String detailId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCloudProjectDetail selectByPrimaryKey(String detailId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCloudProjectDetail record);
}