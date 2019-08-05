package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Class;
import com.zkw.fedweb.service.ClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/class")
@Api(description = "课程")
public class ClassController {

    @Resource
    private ClassService classService;

    //根据年级查询6门课程
    @GetMapping("/allCourses")
    public List<Class> allCourses(Integer atsub) {

        List<Class> allCourses = classService.allCourses(atsub);
        return allCourses;
    }

    //查询学习课时排行榜
    @GetMapping("/classLeader")
    @ApiOperation(value = "查询学习课时排行榜")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "acid", value = "id", required = true, dataType = "int"),
    })

    //查询热门排行榜
    public List<Class> classLeader(Integer acid) {

        List<Class> classLeader = classService.classLeader(acid);
        return classLeader;
    }

    //查询销售排行榜
    @GetMapping("/hotSales")
    public List<Class> hotSales(Integer acid) {

        List<Class> hotSales = classService.hotSales(acid);
        return hotSales;
    }

    //查首页最新课程查询 插入
    @GetMapping("/newClass")
    public List<Class> newClass(Integer acid) {

        List<Class> newClass = classService.NewClass(acid);
        return newClass;
    }






}
