package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCustom;

public interface EstCustomMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String customId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCustom selectByPrimaryKey(String customId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCustom record);
}