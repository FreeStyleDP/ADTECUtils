package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstForm;

public interface EstFormMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String formId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstForm selectByPrimaryKey(String formId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstForm record);
}