package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSvcDefine;

public interface EstDesignSvcDefineMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String svcDefineId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignSvcDefine record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignSvcDefine record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignSvcDefine selectByPrimaryKey(String svcDefineId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignSvcDefine record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignSvcDefine record);
}