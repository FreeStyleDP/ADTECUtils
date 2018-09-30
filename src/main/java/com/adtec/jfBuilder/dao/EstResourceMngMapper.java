package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstResourceMng;

public interface EstResourceMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstResourceMng selectByPrimaryKey(String resourceId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstResourceMng record);
}