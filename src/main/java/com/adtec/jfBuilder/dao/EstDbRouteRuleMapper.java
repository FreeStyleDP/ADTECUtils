package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbRouteRule;

public interface EstDbRouteRuleMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dbRuleId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDbRouteRule selectByPrimaryKey(String dbRuleId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDbRouteRule record);
}