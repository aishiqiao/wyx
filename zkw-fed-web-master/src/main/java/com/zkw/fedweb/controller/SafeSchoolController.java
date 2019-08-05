package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.SafeSchool;
import com.zkw.fedweb.service.SafeSchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/safeSchool")
public class SafeSchoolController {
    @Resource
    private SafeSchoolService safeSchoolService;
    //特色校园推荐
    @GetMapping("/recommend")
    public List<SafeSchool> recommend() {

        List<SafeSchool> recommend = safeSchoolService.recommend();
        return recommend;
    }


    //查询详情
    @GetMapping("/particulars")
    public List<SafeSchool> particulars(Integer id) {

        List<SafeSchool> particulars = safeSchoolService.particulars(id);
        return particulars;

    }
}
