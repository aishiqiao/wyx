package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadOrg;
import com.zkw.fedweb.service.AbroadOrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadOrg")
public class AbroadOrgController {
    @Resource
    private AbroadOrgService abroadOrgService;

    //查询推荐大学
    @GetMapping("/recommendOrgan")
    public List<AbroadOrg> RecommendOrgan() {

        List<AbroadOrg> RecommendOrgan = abroadOrgService.RecommendOrgan();
        return RecommendOrgan;

    }



}
