package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignRelateView;

public interface EstDesignRelateViewMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String viewId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignRelateView selectByPrimaryKey(String viewId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignRelateView record);
}