package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstLongColumn;
import com.adtec.jfBuilder.entity.EstLongColumnKey;

public interface EstLongColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstLongColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstLongColumn selectByPrimaryKey(EstLongColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstLongColumn record);
}