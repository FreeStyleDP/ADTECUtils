package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstTestCombineSvc;

public interface EstTestCombineSvcMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String combineSvcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstTestCombineSvc selectByPrimaryKey(String combineSvcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstTestCombineSvc record);
}