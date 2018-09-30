package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFsrvMng;
import com.adtec.jfBuilder.entity.EstFsrvMngKey;

public interface EstFsrvMngMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFsrvMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFsrvMng selectByPrimaryKey(EstFsrvMngKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFsrvMng record);
}