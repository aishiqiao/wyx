package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.AbroadCoopCate;
import com.zkw.fedweb.service.AbroadCoopCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abroadCoopCate")
public class AbroadCoopCateController {
    @Resource
    private AbroadCoopCateService abroadCoopCateService;

    //查询留学动态
    @GetMapping("/symbiosis")
    public List<AbroadCoopCate> Symbiosis() {

        List<AbroadCoopCate> Symbiosis = abroadCoopCateService.Symbiosis();
        return Symbiosis;

    }
}
