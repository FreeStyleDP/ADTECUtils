package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstElementItem;

public interface EstElementItemMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String elemItemId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstElementItem selectByPrimaryKey(String elemItemId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstElementItem record);

}