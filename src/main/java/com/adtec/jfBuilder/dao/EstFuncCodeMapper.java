package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFuncCode;
import com.adtec.jfBuilder.entity.EstFuncCodeKey;

public interface EstFuncCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFuncCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFuncCode selectByPrimaryKey(EstFuncCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFuncCode record);
}