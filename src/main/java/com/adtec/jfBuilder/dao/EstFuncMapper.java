package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFunc;

public interface EstFuncMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String funcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFunc selectByPrimaryKey(String funcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFunc record);
}