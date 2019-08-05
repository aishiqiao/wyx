package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadSchool;
import com.zkw.fedweb.service.AbroadSchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadSchool")
public class AbroadSchoolController {
    @Resource
    private AbroadSchoolService abroadSchoolService;

    //查询推荐大学
    @GetMapping("/recommended")
    public List<AbroadSchool> Recommended(Integer wid) {

        List<AbroadSchool> Recommended = abroadSchoolService.AbroadSchool();
        return Recommended;

    }

    //查询首页大学前六名
    @GetMapping("/frontSchool")
    public List<AbroadSchool> FrontSchool(Integer cate_id) {

        List<AbroadSchool> FrontSchool = abroadSchoolService.FrontSchool(cate_id);
        return FrontSchool;

    }


    //查询热门大学前六名
    @GetMapping("/hotSchool")
    public List<AbroadSchool> HotSchool() {

        List<AbroadSchool> HotSchool = abroadSchoolService.HotSchool();
        return HotSchool;

    }

    //查询全部热门大学
    @GetMapping("/hotSchools")
    public List<AbroadSchool> HotSchools() {

        List<AbroadSchool> HotSchools = abroadSchoolService.HotSchools();
        return HotSchools;

    }

    //查询全部热门大学
    @GetMapping("/particulars")
    public List<AbroadSchool> particulars(Integer id) {

        List<AbroadSchool> particulars = abroadSchoolService.particulars(id);
        return particulars;

    }


}
