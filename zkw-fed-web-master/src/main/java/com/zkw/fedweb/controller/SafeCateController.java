package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.SafeCate;
import com.zkw.fedweb.service.SafeCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/safeCate")
public class SafeCateController  {
    @Resource
    private SafeCateService safeCateService;
    //特色校园推荐
    @GetMapping("/title")
    public List<SafeCate> title() {

        List<SafeCate> title = safeCateService.title();
        return title;
    }



}
