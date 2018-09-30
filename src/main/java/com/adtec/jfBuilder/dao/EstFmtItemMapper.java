package com.adtec.jfBuilder.dao;

import java.util.List;

import com.adtec.jfBuilder.entity.EstFmtItem;

public interface EstFmtItemMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstFmtItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstFmtItem record);
    
    List<EstFmtItem> selectByFmtId(String fmtId);
}