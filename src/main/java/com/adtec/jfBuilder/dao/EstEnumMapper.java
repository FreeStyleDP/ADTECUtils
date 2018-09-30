package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnum;

public interface EstEnumMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String enumId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstEnum selectByPrimaryKey(String enumId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstEnum record);
}