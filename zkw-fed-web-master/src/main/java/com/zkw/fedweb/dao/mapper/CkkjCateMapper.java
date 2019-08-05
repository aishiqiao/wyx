package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.CkkjCate;

import java.util.List;

public interface CkkjCateMapper {


    //创客空间标题
    List<CkkjCate> title();



    int deleteByPrimaryKey(Integer id);

    int insert(CkkjCate record);

    int insertSelective(CkkjCate record);

    CkkjCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CkkjCate record);

    int updateByPrimaryKey(CkkjCate record);
}