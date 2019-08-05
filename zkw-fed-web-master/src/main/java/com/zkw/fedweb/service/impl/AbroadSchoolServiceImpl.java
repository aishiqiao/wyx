package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadSchoolMapper;
import com.zkw.fedweb.dao.po.AbroadSchool;
import com.zkw.fedweb.service.AbroadSchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadSchoolServiceImpl implements AbroadSchoolService {
    @Resource
    private AbroadSchoolMapper abroadSchoolMapper;
    @Override
    public List<AbroadSchool> AbroadSchool() {

        return abroadSchoolMapper.Recommended();
    }

    @Override
    public List<AbroadSchool> FrontSchool(Integer cate_id) {
        return abroadSchoolMapper.FrontSchool(cate_id);
    }

    @Override
    public List<AbroadSchool> HotSchool() {
        return abroadSchoolMapper.HotSchool();
    }

    @Override
    public List<AbroadSchool> HotSchools() {
        return abroadSchoolMapper.HotSchools();
    }

    @Override
    public List<AbroadSchool> particulars(Integer id) {
        return abroadSchoolMapper.particulars(id);
    }
}
