package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEventExpr;
import com.adtec.jfBuilder.entity.EstEventExprKey;

public interface EstEventExprMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstEventExprKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstEventExpr record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstEventExpr record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstEventExpr selectByPrimaryKey(EstEventExprKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstEventExpr record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstEventExpr record);
}