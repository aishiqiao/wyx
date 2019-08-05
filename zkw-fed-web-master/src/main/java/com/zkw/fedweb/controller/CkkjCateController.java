package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.CkkjCate;
import com.zkw.fedweb.service.CkkjCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping("/ckkjCate")
@RestController
public class CkkjCateController {
    @Resource
    private CkkjCateService ckkjCateService;

    @GetMapping("/title")
    public List<CkkjCate> titles() {

        List<CkkjCate> titles = ckkjCateService.title();
        return titles;
    }
}
