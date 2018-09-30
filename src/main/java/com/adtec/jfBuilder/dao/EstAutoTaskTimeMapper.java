package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAutoTaskTime;
import com.adtec.jfBuilder.entity.EstAutoTaskTimeKey;

public interface EstAutoTaskTimeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstAutoTaskTimeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstAutoTaskTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstAutoTaskTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstAutoTaskTime selectByPrimaryKey(EstAutoTaskTimeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstAutoTaskTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstAutoTaskTime record);
}