package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstExceptionCode;

public interface EstExceptionCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String exceptionCodeId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstExceptionCode selectByPrimaryKey(String exceptionCodeId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstExceptionCode record);
}