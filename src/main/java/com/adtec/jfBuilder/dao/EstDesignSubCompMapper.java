package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSubComp;
import com.adtec.jfBuilder.entity.EstDesignSubCompKey;

public interface EstDesignSubCompMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDesignSubCompKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignSubComp selectByPrimaryKey(EstDesignSubCompKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignSubComp record);
}