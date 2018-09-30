package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDatadict;

public interface EstDatadictMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dataId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDatadict selectByPrimaryKey(String dataId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDatadict record);
}