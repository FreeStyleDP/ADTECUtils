package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDta;

public interface EstDtaMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dtaId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDta record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDta record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDta selectByPrimaryKey(String dtaId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDta record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDta record);

    EstDta selectByDtaName(String dtaName);
}