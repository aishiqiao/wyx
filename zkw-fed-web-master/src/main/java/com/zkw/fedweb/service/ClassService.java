package com.zkw.fedweb.service;


import com.zkw.fedweb.dao.po.Class;

import java.util.List;

public interface ClassService {

    //查询全部课程名称
    List<Class> allCourses(Integer atsub);

    //查询热门课程
    List<Class> classLeader(Integer acid);


    //查询销售排行榜
    List<Class> hotSales(Integer acid);

    //查询最新课程 插入
    List<Class> NewClass(Integer acid);


}
