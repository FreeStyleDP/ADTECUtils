package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaCustinstMng;
import com.adtec.jfBuilder.entity.EstDtaCustinstMngKey;

public interface EstDtaCustinstMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDtaCustinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDtaCustinstMng selectByPrimaryKey(EstDtaCustinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDtaCustinstMng record);
}