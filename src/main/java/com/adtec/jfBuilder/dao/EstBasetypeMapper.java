package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBasetype;

public interface EstBasetypeMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String basetypeId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstBasetype selectByPrimaryKey(String basetypeId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstBasetype record);
}