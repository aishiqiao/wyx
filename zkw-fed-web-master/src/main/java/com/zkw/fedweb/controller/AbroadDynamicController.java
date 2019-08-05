package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadDynamic;
import com.zkw.fedweb.service.AbroadDynamicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadDynamic")
public class AbroadDynamicController {
    @Resource
    private AbroadDynamicService abroadDynamicService;
    //查询留学动态
    @GetMapping("/dynamic")
    public List<AbroadDynamic> dynamic() {

        List<AbroadDynamic> dynamic = abroadDynamicService.Dynamic();
        return dynamic;

    }

}
