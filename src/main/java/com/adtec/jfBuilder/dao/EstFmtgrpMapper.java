package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFmtgrp;
import com.adtec.jfBuilder.entity.EstFmtgrpKey;

public interface EstFmtgrpMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstFmtgrpKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstFmtgrp selectByPrimaryKey(EstFmtgrpKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstFmtgrp record);
}