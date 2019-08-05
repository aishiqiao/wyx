package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.SafeSchool;

import java.util.List;

public interface SafeSchoolService {
    //特色校园推荐
    List<SafeSchool> recommend( );
    //查询详情
    List<SafeSchool> particulars(Integer id);
}
