package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Class;
import com.zkw.fedweb.dao.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ClassMapper {
    //根据条件查询全部课程名称
    List<Class> AllCourses(@Param("atsub") Integer atsub);


    //根据条件查询排行榜课程名称
    List<Class> ClassLeader(@Param("acid") Integer acid);

    //销售排行榜
    List<Class> HotSales(@Param("acid") Integer acid);

    //查询首页最新课程 插入
    List<Class> NewClass(@Param("acid") Integer acid);


}
