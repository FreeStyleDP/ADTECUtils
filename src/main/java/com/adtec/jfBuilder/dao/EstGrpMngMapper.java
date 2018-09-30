package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstGrpMng;

public interface EstGrpMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String grpId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstGrpMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstGrpMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstGrpMng selectByPrimaryKey(String grpId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstGrpMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstGrpMng record);
}