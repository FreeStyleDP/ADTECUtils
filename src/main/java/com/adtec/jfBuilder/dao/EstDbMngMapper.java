package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbMng;

public interface EstDbMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dbMngId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDbMng selectByPrimaryKey(String dbMngId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDbMng record);
}