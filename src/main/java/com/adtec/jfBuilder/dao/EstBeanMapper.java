package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBean;

public interface EstBeanMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String beanId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstBean selectByPrimaryKey(String beanId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstBean record);
}