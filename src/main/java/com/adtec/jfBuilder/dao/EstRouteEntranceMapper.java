package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstRouteEntrance;
import com.adtec.jfBuilder.entity.EstRouteEntranceKey;

public interface EstRouteEntranceMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstRouteEntrance selectByPrimaryKey(EstRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstRouteEntrance record);
}