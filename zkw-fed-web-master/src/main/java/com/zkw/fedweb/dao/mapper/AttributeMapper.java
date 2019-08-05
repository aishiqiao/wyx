package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Attribute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AttributeMapper {


    //查询课程推荐二级标题
    List<Attribute> SecondLevel(@Param("acid") Integer acid);





//    //查询小学二级标题
//    List<Attribute> GradeSecond(@Param("pid") int pid);
//
//    //查询初中二级标题
//    List<Attribute> JuniorSecond(@Param("pid") int pid);
//
//    //查询高中二级标题
//    List<Attribute> SeniorSecond(@Param("pid") int pid);
//
//    //查询国学二级标题
//    List<Attribute> StateSecond(@Param("pid") int pid);
//
//    //查询建筑二级标题
//    List<Attribute> BuildSecond(@Param("pid") int pid);
//
//    //查询医学二级标题
//    List<Attribute> MedicalSecond(@Param("pid") int pid);
//
//    //查询教师二级标题
//    List<Attribute> TeacherSecond(@Param("pid") int pid);
//
//    //查询银行二级标题
//    List<Attribute> BankSecond(@Param("pid") int pid);
//
//    //查询会计二级标题
//    List<Attribute> AccountantSecond(@Param("pid") int pid);
//
//    //查询四六级二级标题
//    List<Attribute> CETSecond(@Param("pid") int pid);
//
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Attribute record);
//
//    int insertSelective(Attribute record);
//
//    Attribute selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Attribute record);
//
//    int updateByPrimaryKey(Attribute record);
//

}