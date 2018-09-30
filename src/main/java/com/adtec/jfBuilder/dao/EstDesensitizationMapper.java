package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesensitization;

public interface EstDesensitizationMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String desensitizationId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesensitization selectByPrimaryKey(String desensitizationId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesensitization record);
}