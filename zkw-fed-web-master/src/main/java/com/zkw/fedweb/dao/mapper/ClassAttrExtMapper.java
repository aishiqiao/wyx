package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.ClassAttrExt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassAttrExtMapper {

    //课程管理接口 首页联动查询
//    List<ClassExt> findClassList (int atsub1, int atsub2, int atsub3, String code, int id);buynum      , @Param("desc") String  desc
    List<ClassAttrExt> findClassList (@Param("atsub1") Integer atsub1, @Param("atsub2")Integer atsub2, @Param("atsub3") Integer atsub3,@Param("code")String code , @Param("id")Integer id,@Param("type")String type);
}
