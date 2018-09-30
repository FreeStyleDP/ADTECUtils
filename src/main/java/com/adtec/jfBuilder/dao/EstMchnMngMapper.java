package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstMchnMng;

public interface EstMchnMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String mchnId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstMchnMng selectByPrimaryKey(String mchnId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstMchnMng record);
}