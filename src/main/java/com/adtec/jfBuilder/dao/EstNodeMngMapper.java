package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstNodeMng;
import com.adtec.jfBuilder.entity.EstNodeMngKey;

public interface EstNodeMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstNodeMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstNodeMng selectByPrimaryKey(EstNodeMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstNodeMng record);
}