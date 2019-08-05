package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.RecruitmentIndustryMapper;
import com.zkw.fedweb.dao.po.RecruitmentIndustry;
import com.zkw.fedweb.service.RecruitmentIndustryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class RecruitmentIndustryServiceImpl implements RecruitmentIndustryService {
    @Resource
    private RecruitmentIndustryMapper recruitmentIndustryMapper;
    @Override
    public List<RecruitmentIndustry> title(Integer id) {
        return recruitmentIndustryMapper.title(id);
    }
}
