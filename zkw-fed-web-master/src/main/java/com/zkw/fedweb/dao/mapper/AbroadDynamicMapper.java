package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadDynamic;

import java.util.List;

public interface AbroadDynamicMapper {


    //查询留学动态
    List<AbroadDynamic> Dynamic();





    int deleteByPrimaryKey(Integer id);

    int insert(AbroadDynamic record);

    int insertSelective(AbroadDynamic record);

    AbroadDynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadDynamic record);

    int updateByPrimaryKeyWithBLOBs(AbroadDynamic record);

    int updateByPrimaryKey(AbroadDynamic record);
}