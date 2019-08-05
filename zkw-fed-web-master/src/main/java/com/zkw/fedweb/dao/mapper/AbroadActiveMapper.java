package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadActive;

import java.util.List;

public interface AbroadActiveMapper {

    //查询留学互动
    List<AbroadActive> Interactive();

    int deleteByPrimaryKey(Integer id);

    int insert(AbroadActive record);

    int insertSelective(AbroadActive record);

    AbroadActive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadActive record);

    int updateByPrimaryKey(AbroadActive record);
}