package com.adtec.jfBuilder.dao;

import java.util.List;

import com.adtec.jfBuilder.entity.EstSignItem;

public interface EstSignItemMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstSignItem record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstSignItem record);
    
    List<EstSignItem> selectByFmtId(String FmtId);
}