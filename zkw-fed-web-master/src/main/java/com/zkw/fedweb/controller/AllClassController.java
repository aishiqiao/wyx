package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AllClass;
import com.zkw.fedweb.service.AllClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/allClass")
public class AllClassController {


    @Resource
    private AllClassService allClassService;
    //查询小初高等一级类名及课程介绍
    @GetMapping("/xjRecommend")
    public List<AllClass> XJRecommend(Integer wid) {

            List<AllClass> XJRecommend = allClassService.XJRecommend(wid);
            return XJRecommend;

    }
    //查询小标题下的标题名
    @GetMapping("/version")
    public List<AllClass> version(Integer id,Integer pid) {

            List<AllClass> version = allClassService.version(id,pid);
            return version;

    }

    //查询小标题名
    @GetMapping("/heading")
    public List<AllClass> heading(Integer id) {

        List<AllClass> heading = allClassService.heading(id);
        return heading;

    }



}

