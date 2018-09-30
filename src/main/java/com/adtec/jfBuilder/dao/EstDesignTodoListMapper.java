package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTodoList;

public interface EstDesignTodoListMapper {
    /**
     *
     * @mbggenerated 2018-08-29
     */
    int deleteByPrimaryKey(String todoId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insert(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int insertSelective(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    EstDesignTodoList selectByPrimaryKey(String todoId);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKeySelective(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-29
     */
    int updateByPrimaryKey(EstDesignTodoList record);
}