package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaMchnMng;
import com.adtec.jfBuilder.entity.EstDtaMchnMngKey;

public interface EstDtaMchnMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDtaMchnMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDtaMchnMng selectByPrimaryKey(EstDtaMchnMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDtaMchnMng record);
}