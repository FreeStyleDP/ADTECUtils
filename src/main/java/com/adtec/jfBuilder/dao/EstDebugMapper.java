package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDebug;

public interface EstDebugMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String unionId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDebug selectByPrimaryKey(String unionId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDebug record);
}