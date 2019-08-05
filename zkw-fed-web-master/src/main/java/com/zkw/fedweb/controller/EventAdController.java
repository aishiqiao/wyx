package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.EventAd;
import com.zkw.fedweb.service.EventAdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/eventAd")
public class EventAdController {

    @Resource
    private EventAdService eventAdService;

    //查询大赛标题
    @GetMapping("/contestBar")
    public List<EventAd> contestBar() {

        List<EventAd> contestBar = eventAdService.contestBar();
        return contestBar;
    }


}
