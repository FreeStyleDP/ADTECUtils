package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSqlDosList;

public interface EstDesignSqlDosListMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String sublistId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignSqlDosList selectByPrimaryKey(String sublistId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeyWithBLOBs(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignSqlDosList record);
}