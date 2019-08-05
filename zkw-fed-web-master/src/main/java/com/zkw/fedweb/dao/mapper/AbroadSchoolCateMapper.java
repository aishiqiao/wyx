package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadSchoolCate;

import java.util.List;

public interface AbroadSchoolCateMapper {
    //推荐学校
    List<AbroadSchoolCate>RecommendedSchools();



    int deleteByPrimaryKey(Integer id);

    int insert(AbroadSchoolCate record);

    int insertSelective(AbroadSchoolCate record);

    AbroadSchoolCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadSchoolCate record);

    int updateByPrimaryKey(AbroadSchoolCate record);
}