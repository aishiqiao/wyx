package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.CompanyIndustry;
import com.zkw.fedweb.service.CompanyIndustryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/companyIndustr")
public class CompanyIndustryController {
    @Resource
    private CompanyIndustryService companyIndustryService;

    @GetMapping("/industry")
    public List<CompanyIndustry> industry() {

        List<CompanyIndustry> industry = companyIndustryService.industry();
        return industry;
    }

}
