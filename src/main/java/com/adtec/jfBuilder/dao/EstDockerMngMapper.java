package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDockerMng;
import com.adtec.jfBuilder.entity.EstDockerMngKey;

public interface EstDockerMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDockerMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDockerMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDockerMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDockerMng selectByPrimaryKey(EstDockerMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDockerMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDockerMng record);
}