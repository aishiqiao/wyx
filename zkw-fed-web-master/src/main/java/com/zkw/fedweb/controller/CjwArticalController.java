package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.CjwArtical;
import com.zkw.fedweb.service.CjwArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping("/cjwArtical")
@RestController
public class CjwArticalController {
    @Resource
    private CjwArticalService cjwArticalService;

    @GetMapping("/adultNews")
    public List<CjwArtical> CjwArticales() {

        List<CjwArtical> CjwArticales = cjwArticalService.AdultNews();
        return CjwArticales;
    }
}
