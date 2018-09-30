package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbIndex;
import com.adtec.jfBuilder.entity.EstDbIndexKey;

public interface EstDbIndexMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDbIndexKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDbIndex record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDbIndex record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDbIndex selectByPrimaryKey(EstDbIndexKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDbIndex record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDbIndex record);
}