package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAddress;
import com.adtec.jfBuilder.entity.EstAddressKey;

public interface EstAddressMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstAddressKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstAddress selectByPrimaryKey(EstAddressKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstAddress record);
}