package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstResourceNode;
import com.adtec.jfBuilder.entity.EstResourceNodeKey;

public interface EstResourceNodeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstResourceNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstResourceNode selectByPrimaryKey(EstResourceNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstResourceNode record);
}