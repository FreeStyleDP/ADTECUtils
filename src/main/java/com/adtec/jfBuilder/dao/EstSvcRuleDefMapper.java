package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcRuleDef;

public interface EstSvcRuleDefMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstSvcRuleDef selectByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstSvcRuleDef record);
}