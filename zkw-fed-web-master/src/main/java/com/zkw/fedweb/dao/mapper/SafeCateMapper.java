package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.SafeCate;

import java.util.List;

public interface SafeCateMapper {

    //标题查询
    List<SafeCate> title( );
    int deleteByPrimaryKey(Integer id);

    int insert(SafeCate record);

    int insertSelective(SafeCate record);

    SafeCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SafeCate record);

    int updateByPrimaryKey(SafeCate record);
}