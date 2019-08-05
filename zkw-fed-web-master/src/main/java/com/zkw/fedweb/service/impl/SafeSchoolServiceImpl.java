package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.SafeSchoolMapper;
import com.zkw.fedweb.dao.po.AbroadTeacher;
import com.zkw.fedweb.dao.po.SafeSchool;
import com.zkw.fedweb.service.SafeSchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class SafeSchoolServiceImpl implements SafeSchoolService {
    @Resource
    private SafeSchoolMapper safeSchoolMapper;
    @Override
    public List<SafeSchool> recommend() {
        return safeSchoolMapper.recommend();
    }

    //查询详情
    @Override
    public List<SafeSchool> particulars(Integer id) {
        return safeSchoolMapper.particulars(id);
    }


}
