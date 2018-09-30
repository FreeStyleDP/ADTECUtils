package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignBusComp;
import com.adtec.jfBuilder.entity.EstDesignBusCompKey;

public interface EstDesignBusCompMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDesignBusCompKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignBusComp selectByPrimaryKey(EstDesignBusCompKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignBusComp record);
}