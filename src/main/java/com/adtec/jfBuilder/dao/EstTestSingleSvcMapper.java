package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstTestSingleSvc;
import com.adtec.jfBuilder.entity.EstTestSingleSvcWithBLOBs;

public interface EstTestSingleSvcMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String singleSvcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstTestSingleSvcWithBLOBs selectByPrimaryKey(String singleSvcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeyWithBLOBs(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstTestSingleSvc record);
}