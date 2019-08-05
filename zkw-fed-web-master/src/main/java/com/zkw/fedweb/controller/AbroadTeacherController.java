package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadTeacher;
import com.zkw.fedweb.service.AbroadTeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadTeacher")
public class AbroadTeacherController {
    @Resource
    private AbroadTeacherService abroadTeacherService;
    //查询名师风采
    @GetMapping("/recommended")
    public List<AbroadTeacher> RecommendTeacher() {

        List<AbroadTeacher> RecommendTeacher = abroadTeacherService.RecommendTeacher();
        return RecommendTeacher;

    }

    //查询名师风采详情
    @GetMapping("/particulars")
    public List<AbroadTeacher> particulars(Integer id) {

        List<AbroadTeacher> particulars = abroadTeacherService.particulars(id);
        return particulars;

    }


}
