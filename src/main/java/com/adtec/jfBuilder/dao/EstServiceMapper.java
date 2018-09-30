package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstService;

public interface EstServiceMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstService record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstService record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstService selectByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstService record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstService record);
    
	EstService selectByEstService(EstService estService2);
}