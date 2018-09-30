package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFactoryClass;

public interface EstFactoryClassMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String factoryId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFactoryClass selectByPrimaryKey(String factoryId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFactoryClass record);
}