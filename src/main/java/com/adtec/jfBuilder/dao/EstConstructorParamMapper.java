package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstConstructorParam;
import com.adtec.jfBuilder.entity.EstConstructorParamKey;

public interface EstConstructorParamMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstConstructorParamKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstConstructorParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstConstructorParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstConstructorParam selectByPrimaryKey(EstConstructorParamKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstConstructorParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstConstructorParam record);
}