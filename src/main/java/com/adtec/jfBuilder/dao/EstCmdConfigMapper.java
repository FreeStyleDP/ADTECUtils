package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCmdConfig;

public interface EstCmdConfigMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String adapterName);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstCmdConfig selectByPrimaryKey(String adapterName);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstCmdConfig record);
}