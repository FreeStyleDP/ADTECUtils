package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDatasrcMng;

public interface EstDatasrcMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String datasrcMngId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDatasrcMng selectByPrimaryKey(String datasrcMngId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDatasrcMng record);
}