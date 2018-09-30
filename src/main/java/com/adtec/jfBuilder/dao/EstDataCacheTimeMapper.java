package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataCacheTime;
import com.adtec.jfBuilder.entity.EstDataCacheTimeKey;

public interface EstDataCacheTimeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDataCacheTimeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDataCacheTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDataCacheTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDataCacheTime selectByPrimaryKey(EstDataCacheTimeKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDataCacheTime record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDataCacheTime record);
}