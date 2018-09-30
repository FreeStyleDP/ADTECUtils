package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstGrpAuthor;
import com.adtec.jfBuilder.entity.EstGrpAuthorKey;

public interface EstGrpAuthorMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(EstGrpAuthorKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstGrpAuthor record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstGrpAuthor record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstGrpAuthor selectByPrimaryKey(EstGrpAuthorKey key);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstGrpAuthor record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstGrpAuthor record);
}