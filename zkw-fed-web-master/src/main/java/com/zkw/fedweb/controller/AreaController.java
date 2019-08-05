package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Area;
import com.zkw.fedweb.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/area")
public class AreaController {
    @Resource
    private AreaService areaService;
    //查询小初高等一级类名及课程介绍
    @GetMapping("/toponym")
    public List<Area> toponym(Integer aid) {

        List<Area> toponym = areaService.toponym(aid);
        return toponym;

    }
}
