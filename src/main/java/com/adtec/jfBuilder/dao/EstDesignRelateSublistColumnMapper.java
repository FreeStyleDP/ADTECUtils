package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignRelateSublistColumn;
import com.adtec.jfBuilder.entity.EstDesignRelateSublistColumnKey;

public interface EstDesignRelateSublistColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstDesignRelateSublistColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignRelateSublistColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignRelateSublistColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignRelateSublistColumn selectByPrimaryKey(EstDesignRelateSublistColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignRelateSublistColumn record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignRelateSublistColumn record);
}