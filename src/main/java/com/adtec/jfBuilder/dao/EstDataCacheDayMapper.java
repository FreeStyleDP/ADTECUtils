package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataCacheDay;

public interface EstDataCacheDayMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dataCacheId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDataCacheDay selectByPrimaryKey(String dataCacheId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDataCacheDay record);
}