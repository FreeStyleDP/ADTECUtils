package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaStack;
import com.adtec.jfBuilder.entity.EstDtaStackKey;

public interface EstDtaStackMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDtaStackKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDtaStack selectByPrimaryKey(EstDtaStackKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDtaStack record);
}