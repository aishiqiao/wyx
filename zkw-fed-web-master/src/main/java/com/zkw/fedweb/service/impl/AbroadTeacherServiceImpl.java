package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadTeacherMapper;
import com.zkw.fedweb.dao.po.AbroadTeacher;
import com.zkw.fedweb.service.AbroadTeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadTeacherServiceImpl implements AbroadTeacherService {
    @Resource
    private AbroadTeacherMapper abroadTeacherMapper;
    @Override
    public List<AbroadTeacher> RecommendTeacher() {
        return abroadTeacherMapper.RecommendTeacher();
    }

    @Override
    public List<AbroadTeacher> particulars(Integer id) {
        return abroadTeacherMapper.particulars(id);
    }
}
