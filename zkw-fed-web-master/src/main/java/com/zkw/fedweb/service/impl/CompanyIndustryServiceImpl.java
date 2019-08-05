package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.CompanyIndustryMapper;
import com.zkw.fedweb.dao.po.CompanyIndustry;
import com.zkw.fedweb.service.CompanyIndustryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class CompanyIndustryServiceImpl implements CompanyIndustryService {
    @Resource
    private CompanyIndustryMapper companyIndustryMapper;
    @Override
    public List<CompanyIndustry> industry() {
        return companyIndustryMapper.industry();
    }
}
