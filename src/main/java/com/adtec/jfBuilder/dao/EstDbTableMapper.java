package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbTable;

public interface EstDbTableMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(Integer tabid);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDbTable selectByPrimaryKey(Integer tabid);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDbTable record);
}