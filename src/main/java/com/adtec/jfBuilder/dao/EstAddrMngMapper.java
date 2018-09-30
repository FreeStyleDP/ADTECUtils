package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAddrMng;
import com.adtec.jfBuilder.entity.EstAddrMngKey;

public interface EstAddrMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstAddrMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstAddrMng selectByPrimaryKey(EstAddrMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstAddrMng record);
}