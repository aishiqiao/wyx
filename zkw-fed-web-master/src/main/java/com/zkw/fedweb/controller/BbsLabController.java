package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.BbsLab;
import com.zkw.fedweb.service.BbsLabService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bbsLab")
public class BbsLabController {
    @Resource
    private BbsLabService bbsLabService;

    @GetMapping("/hotLabel")
    public List<BbsLab> hotLabels() {

        List<BbsLab> hotLabels = bbsLabService.hotLabel();
        return hotLabels;
    }

}
