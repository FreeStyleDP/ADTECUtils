package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCode;
import com.adtec.jfBuilder.entity.EstCodeKey;

public interface EstCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCode selectByPrimaryKey(EstCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCode record);
}