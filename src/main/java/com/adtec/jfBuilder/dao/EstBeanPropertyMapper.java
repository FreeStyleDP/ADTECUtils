package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBeanProperty;

public interface EstBeanPropertyMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String propertyId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstBeanProperty selectByPrimaryKey(String propertyId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstBeanProperty record);
}