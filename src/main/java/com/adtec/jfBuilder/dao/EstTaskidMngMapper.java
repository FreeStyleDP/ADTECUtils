package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstTaskidMng;

public interface EstTaskidMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String taskidId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstTaskidMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstTaskidMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstTaskidMng selectByPrimaryKey(String taskidId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstTaskidMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstTaskidMng record);
}