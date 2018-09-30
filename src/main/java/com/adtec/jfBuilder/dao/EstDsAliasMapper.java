package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDsAlias;

public interface EstDsAliasMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String dsId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDsAlias selectByPrimaryKey(String dsId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDsAlias record);
}