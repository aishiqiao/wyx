package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadCoopCate;

import java.util.List;

public interface AbroadCoopCateMapper {
    //合作推荐
    List<AbroadCoopCate> Symbiosis();



    int deleteByPrimaryKey(Integer id);

    int insert(AbroadCoopCate record);

    int insertSelective(AbroadCoopCate record);

    AbroadCoopCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadCoopCate record);

    int updateByPrimaryKey(AbroadCoopCate record);
}