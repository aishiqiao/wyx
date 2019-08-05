package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.XzxArtical;
import com.zkw.fedweb.service.XzxArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/xzxArtical")
@Slf4j
public class XzxArticalController {
    @Resource
    private XzxArticalService xzxArticalService;

    @GetMapping("/xzxNews")
    private List<XzxArtical>  xzxNews(){

        List<XzxArtical> xzxNews =xzxArticalService.XzxNews();
        return xzxNews;
    }

}
