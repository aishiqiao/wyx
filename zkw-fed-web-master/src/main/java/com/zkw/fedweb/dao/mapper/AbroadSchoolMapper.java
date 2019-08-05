package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadSchool;

import java.util.List;

public interface AbroadSchoolMapper {


    //查询推荐大学
    List<AbroadSchool> Recommended();

    //查询首页大学前六名
    List<AbroadSchool> FrontSchool(Integer cate_id);

    //查询热门推荐
    List<AbroadSchool> HotSchools();




    //    热门大学前六名
    List<AbroadSchool> HotSchool();

    //    学校详情
    List<AbroadSchool> particulars(Integer id);



    int deleteByPrimaryKey(Integer id);

    int insert(AbroadSchool record);

    int insertSelective(AbroadSchool record);

    AbroadSchool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadSchool record);

    int updateByPrimaryKeyWithBLOBs(AbroadSchool record);

    int updateByPrimaryKey(AbroadSchool record);
}