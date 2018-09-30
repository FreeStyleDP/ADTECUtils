package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbRouteEntrance;
import com.adtec.jfBuilder.entity.EstDbRouteEntranceKey;

public interface EstDbRouteEntranceMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDbRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDbRouteEntrance selectByPrimaryKey(EstDbRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDbRouteEntrance record);
}