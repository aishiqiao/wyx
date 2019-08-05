package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Attribute;
import com.zkw.fedweb.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/attribute")
public class AttributeController {
    @Resource
    private AttributeService attributeService;

    //查询课程推荐二级标题
    @GetMapping("/secondLevel")
    public List<Attribute> SecondLevel(Integer acid) {
        List<Attribute> SecondLevel = attributeService.SecondLevel(acid);
        return SecondLevel;
    }


}
