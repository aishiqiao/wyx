package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadTeacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AbroadTeacherMapper {

    //查询名师风采
    List<AbroadTeacher> RecommendTeacher();

    //查询名师风采详情
    List<AbroadTeacher> particulars(@Param("id") Integer id);





    int deleteByPrimaryKey(Integer id);

    int insert(AbroadTeacher record);

    int insertSelective(AbroadTeacher record);

    AbroadTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadTeacher record);

    int updateByPrimaryKeyWithBLOBs(AbroadTeacher record);

    int updateByPrimaryKey(AbroadTeacher record);
}