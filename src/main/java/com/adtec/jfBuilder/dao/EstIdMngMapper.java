package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstIdMng;

public interface EstIdMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String idType);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstIdMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstIdMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstIdMng selectByPrimaryKey(String idType);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstIdMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstIdMng record);
}