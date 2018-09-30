package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSvcPublish;

public interface EstDesignSvcPublishMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String svcPublishId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignSvcPublish selectByPrimaryKey(String svcPublishId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignSvcPublish record);
}