package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.YjsCate;

import java.util.List;

public interface YjsCateMapper {

    //研究生一级小标题
    List<YjsCate> Subtitle();




    int deleteByPrimaryKey(Integer id);

    int insert(YjsCate record);

    int insertSelective(YjsCate record);

    YjsCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YjsCate record);

    int updateByPrimaryKey(YjsCate record);
}