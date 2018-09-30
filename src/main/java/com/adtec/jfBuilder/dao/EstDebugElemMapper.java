package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDebugElem;
import com.adtec.jfBuilder.entity.EstDebugElemKey;

public interface EstDebugElemMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDebugElemKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDebugElem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDebugElem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDebugElem selectByPrimaryKey(EstDebugElemKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDebugElem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDebugElem record);
}