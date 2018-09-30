package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnumValue;

public interface EstEnumValueMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String enumItemId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstEnumValue selectByPrimaryKey(String enumItemId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstEnumValue record);
}