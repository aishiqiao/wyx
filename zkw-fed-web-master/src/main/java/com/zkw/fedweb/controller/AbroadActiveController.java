package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadActive;
import com.zkw.fedweb.service.AbroadActiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadActive")

public class AbroadActiveController {

    @Resource
    private AbroadActiveService abroadActiveService;
    //查询小初高等一级类名及课程介绍
    @GetMapping("/interactive")
    public List<AbroadActive> Interactive() {

        List<AbroadActive> Interactive = abroadActiveService.Interactive();
        return Interactive;

    }

}
