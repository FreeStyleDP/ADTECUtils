package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTable;

public interface EstDesignTableMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String tableId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignTable selectByPrimaryKey(String tableId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignTable record);
}