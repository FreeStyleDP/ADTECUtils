package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFormItem;
import com.adtec.jfBuilder.entity.EstFormItemKey;

public interface EstFormItemMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFormItemKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFormItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFormItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFormItem selectByPrimaryKey(EstFormItemKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFormItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFormItem record);
}