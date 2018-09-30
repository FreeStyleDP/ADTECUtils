package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFlowDerive;
import com.adtec.jfBuilder.entity.EstFlowDeriveKey;

public interface EstFlowDeriveMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFlowDeriveKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFlowDerive selectByPrimaryKey(EstFlowDeriveKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFlowDerive record);
}