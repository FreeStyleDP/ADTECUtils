package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstNode;
import com.adtec.jfBuilder.entity.EstNodeKey;

public interface EstNodeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstNode selectByPrimaryKey(EstNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstNode record);
}