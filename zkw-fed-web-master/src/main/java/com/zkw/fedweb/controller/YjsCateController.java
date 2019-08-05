package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.YjsCate;
import com.zkw.fedweb.service.YjsCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/yjsCate")
@Slf4j
public class YjsCateController {
    @Resource
    private YjsCateService yjsCateService;

    @GetMapping("/subtitle")
    public List<YjsCate> subtitle(){

        List<YjsCate> subtitle =yjsCateService.Subtitle();
        return subtitle;
    }

    public static class VideoController {
    }
}
