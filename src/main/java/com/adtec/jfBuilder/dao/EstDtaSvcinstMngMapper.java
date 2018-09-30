package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaSvcinstMng;
import com.adtec.jfBuilder.entity.EstDtaSvcinstMngKey;

public interface EstDtaSvcinstMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDtaSvcinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDtaSvcinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDtaSvcinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDtaSvcinstMng selectByPrimaryKey(EstDtaSvcinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDtaSvcinstMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDtaSvcinstMng record);
}