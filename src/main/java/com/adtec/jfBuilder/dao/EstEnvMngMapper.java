package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnvMng;

public interface EstEnvMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String envId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstEnvMng selectByPrimaryKey(String envId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstEnvMng record);
}