package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcCatalogMng;
import com.adtec.jfBuilder.entity.EstSvcCatalogMngKey;

public interface EstSvcCatalogMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstSvcCatalogMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstSvcCatalogMng selectByPrimaryKey(EstSvcCatalogMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstSvcCatalogMng record);
}