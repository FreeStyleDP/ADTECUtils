package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignExtComp;

public interface EstDesignExtCompMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String esId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignExtComp selectByPrimaryKey(String esId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignExtComp record);
}