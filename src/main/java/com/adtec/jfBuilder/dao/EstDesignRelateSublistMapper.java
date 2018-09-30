package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignRelateSublist;
import com.adtec.jfBuilder.entity.EstDesignRelateSublistKey;

public interface EstDesignRelateSublistMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDesignRelateSublistKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignRelateSublist selectByPrimaryKey(EstDesignRelateSublistKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignRelateSublist record);
}