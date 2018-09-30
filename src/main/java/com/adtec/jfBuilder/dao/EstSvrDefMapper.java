package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvrDef;

public interface EstSvrDefMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String svrId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstSvrDef selectByPrimaryKey(String svrId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstSvrDef record);
}