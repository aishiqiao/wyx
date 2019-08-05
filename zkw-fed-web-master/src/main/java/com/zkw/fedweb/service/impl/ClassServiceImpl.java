package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.ClassMapper;
import com.zkw.fedweb.dao.po.Class;
import com.zkw.fedweb.dao.po.User;
import com.zkw.fedweb.service.ClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class ClassServiceImpl implements ClassService {

    @Resource
    private ClassMapper classMapper;


    @Override
    public List<Class> allCourses(Integer atsub) {
        return classMapper.AllCourses(atsub);
    }

    @Override
    public List<Class> classLeader(Integer acid) {
        return classMapper.ClassLeader(acid);
    }

    @Override
    public List<Class> hotSales(Integer acid) {
        return classMapper.HotSales(acid);
    }

    @Override
    public List<Class> NewClass(Integer acid) {
        return classMapper.NewClass(acid);
    }


//    @Override
//    public List<Class> GradeSecond(Integer atsub) {
//        return classMapper.AllCourses(atsub);
//
//    }
}
