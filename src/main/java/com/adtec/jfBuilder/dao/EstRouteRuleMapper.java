package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstRouteRule;
import com.adtec.jfBuilder.entity.EstRouteRuleKey;

public interface EstRouteRuleMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstRouteRuleKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstRouteRule selectByPrimaryKey(EstRouteRuleKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstRouteRule record);
}