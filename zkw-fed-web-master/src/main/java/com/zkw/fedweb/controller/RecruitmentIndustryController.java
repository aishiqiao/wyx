package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.RecruitmentIndustry;
import com.zkw.fedweb.service.RecruitmentIndustryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/recruitmentIndustry")
public class RecruitmentIndustryController {
    @Resource
    private RecruitmentIndustryService recruitmentIndustryService;

    //求职攻略三级联查标题
    @GetMapping("/title")
    public List<RecruitmentIndustry> titles(Integer id) {

        List<RecruitmentIndustry> titles = recruitmentIndustryService.title(id);
        return titles;
    }


}
