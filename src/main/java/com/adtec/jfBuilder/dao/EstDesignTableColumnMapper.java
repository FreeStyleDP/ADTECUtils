package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTableColumn;

public interface EstDesignTableColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String columnId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignTableColumn selectByPrimaryKey(String columnId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignTableColumn record);
}