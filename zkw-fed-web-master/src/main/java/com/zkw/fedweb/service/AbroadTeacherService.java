package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.AbroadTeacher;

import java.util.List;

public interface AbroadTeacherService {
    //查询名师风采
    List<AbroadTeacher> RecommendTeacher();

    //查询名师风采详情
    List<AbroadTeacher> particulars(Integer id);

}
