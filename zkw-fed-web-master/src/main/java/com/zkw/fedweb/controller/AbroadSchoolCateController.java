package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadSchoolCate;
import com.zkw.fedweb.service.AbroadSchoolCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/abroadSchoolCate")
public class AbroadSchoolCateController {
    @Resource
    private AbroadSchoolCateService abroadSchoolCateService;

    //留学签证 硕士留学 本科留学 推荐学校
    @GetMapping("/recommendedSchools")
    public List<AbroadSchoolCate> RecommendedSchools() {

        List<AbroadSchoolCate> RecommendedSchools = abroadSchoolCateService.RecommendedSchools();
        return RecommendedSchools;
    }

}
