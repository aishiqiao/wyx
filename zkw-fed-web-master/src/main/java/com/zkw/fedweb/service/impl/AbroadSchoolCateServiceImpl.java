package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadSchoolCateMapper;
import com.zkw.fedweb.dao.po.AbroadSchoolCate;
import com.zkw.fedweb.service.AbroadSchoolCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadSchoolCateServiceImpl implements AbroadSchoolCateService {
    @Resource
    private AbroadSchoolCateMapper abroadSchoolCateMapper;
    @Override
    public List<AbroadSchoolCate> RecommendedSchools() {
        return abroadSchoolCateMapper.RecommendedSchools();
    }
}
