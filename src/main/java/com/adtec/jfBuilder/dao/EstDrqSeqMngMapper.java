package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDrqSeqMng;
import com.adtec.jfBuilder.entity.EstDrqSeqMngKey;

public interface EstDrqSeqMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDrqSeqMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDrqSeqMng selectByPrimaryKey(EstDrqSeqMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDrqSeqMng record);
}