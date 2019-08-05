package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.ZgzArtical;
import com.zkw.fedweb.service.ZgzArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/zgzArtical")
@Slf4j
public class ZgzArticalController {
    @Resource
    private ZgzArticalService zgzArticalService;

    @GetMapping("/zgzNews")
    private List<ZgzArtical> zgzNews(){

        List<ZgzArtical> zgzNews =zgzArticalService.ZgzNews();
        return zgzNews;
    }
}
