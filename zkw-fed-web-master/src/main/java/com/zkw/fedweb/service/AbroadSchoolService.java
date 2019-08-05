package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.AbroadSchool;

import java.util.List;

public interface AbroadSchoolService {

    //查询推荐大学
    List<AbroadSchool> AbroadSchool();
    //查询首页大学前六名
    List<AbroadSchool> FrontSchool(Integer cate_id);
    //    入门大学前六名
    List<AbroadSchool> HotSchool();

    //查询热门推荐
    List<AbroadSchool> HotSchools();

    //学校详情
    List<AbroadSchool> particulars(Integer id);

}
