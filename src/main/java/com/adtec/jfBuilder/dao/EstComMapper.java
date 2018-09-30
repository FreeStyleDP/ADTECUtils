package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCom;
import com.adtec.jfBuilder.entity.EstComKey;

public interface EstComMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstComKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCom selectByPrimaryKey(EstComKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCom record);
}