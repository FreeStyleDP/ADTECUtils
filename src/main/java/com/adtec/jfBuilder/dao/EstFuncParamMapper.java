package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFuncParam;
import com.adtec.jfBuilder.entity.EstFuncParamKey;

public interface EstFuncParamMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFuncParamKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFuncParam selectByPrimaryKey(EstFuncParamKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFuncParam record);
}