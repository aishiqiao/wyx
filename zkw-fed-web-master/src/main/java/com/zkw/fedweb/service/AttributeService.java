package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Attribute;

import java.util.List;

public interface AttributeService {

    //查询课程推荐二级标题
    List<Attribute> SecondLevel(Integer acid);

//    //查询小学二级标题
//    List<Attribute> GradeSecond(Integer pid);
//
//    //查询初中二级标题
//    List<Attribute> JuniorSecond(Integer pid);
//
//    //查询高中二级标题
//    List<Attribute> SeniorSecond(Integer pid);
//
//    //查询国学二级标题
//    List<Attribute> StateSecond(Integer pid);
//
//    //查查询建筑类二级标题
//    List<Attribute> BuildSecond(Integer pid);
//
//    //查查询医学类二级标题
//    List<Attribute> MedicalSecond(Integer pid);
//
//    //查查询教师资格证类二级标题
//    List<Attribute> TeacherSecond(Integer pid);
//
//    //查查询银行从业类二级标题
//    List<Attribute> BankSecond(Integer pid);
//
//    //查查询会计类二级标题
//    List<Attribute> AccountantSecond(Integer pid);
//
//    //查查询四六级二级标题
//    List<Attribute> CETSecond(Integer pid);


}
