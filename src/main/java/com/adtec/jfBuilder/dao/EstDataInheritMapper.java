package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataInherit;
import com.adtec.jfBuilder.entity.EstDataInheritKey;

public interface EstDataInheritMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDataInheritKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDataInherit record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDataInherit record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDataInherit selectByPrimaryKey(EstDataInheritKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDataInherit record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDataInherit record);
}