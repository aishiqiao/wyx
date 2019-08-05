package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AttributeMapper;
import com.zkw.fedweb.dao.po.Attribute;
import com.zkw.fedweb.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class AttributeServiceImpl implements AttributeService {
    @Resource
    private AttributeMapper attributeMapper;


    //查询课程推荐二级名称
    @Override
    public List<Attribute> SecondLevel(Integer acid) {
        return attributeMapper.SecondLevel(acid);
    }

//    @Override
//    public List<Attribute> GradeSecond(Integer pid) {
//
//        return attributeMapper.GradeSecond(pid);
//    }
//
//    @Override
//    public List<Attribute> JuniorSecond(Integer pid) {
//
//        return attributeMapper.JuniorSecond(pid);
//    }
//
//    @Override
//    public List<Attribute> SeniorSecond(Integer pid) {
//
//        return attributeMapper.SeniorSecond(pid);
//    }
//
//    @Override
//    public List<Attribute> StateSecond(Integer pid) {
//
//        return attributeMapper.StateSecond(pid);
//    }
//
//    @Override
//    public List<Attribute> BuildSecond(Integer pid) {
//        return attributeMapper.BuildSecond(pid);
//    }
//
//    @Override
//    public List<Attribute> MedicalSecond(Integer pid) {
//        return attributeMapper.MedicalSecond(pid);    }
//
//    @Override
//    public List<Attribute> TeacherSecond(Integer pid) {
//        return attributeMapper.TeacherSecond(pid);    }
//
//    @Override
//    public List<Attribute> BankSecond(Integer pid) {
//        return attributeMapper.BankSecond(pid);    }
//
//    @Override
//    public List<Attribute> AccountantSecond(Integer pid) {
//        return attributeMapper.AccountantSecond(pid);    }
//
//    @Override
//    public List<Attribute> CETSecond(Integer pid) {
//        return attributeMapper.CETSecond(pid);    }


}
