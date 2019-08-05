package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadLinks;
import com.zkw.fedweb.service.AbroadLinksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadLinks")
public class AbroadLinksController {

    @Resource
    private AbroadLinksService abroadLinksService;

    //查询留学动态
    @GetMapping("/symbiosis")
    public List<AbroadLinks> FriendLink() {

        List<AbroadLinks> FriendLink = abroadLinksService.FriendLink();
        return FriendLink;

    }



}
