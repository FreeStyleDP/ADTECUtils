package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFormat;

public interface EstFormatMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String fmtId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFormat selectByPrimaryKey(String fmtId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFormat record);

	EstFormat selectByEstFormat(EstFormat estFormat);
}