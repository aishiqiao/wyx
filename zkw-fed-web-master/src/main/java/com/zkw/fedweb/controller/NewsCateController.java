package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.NewsCate;
import com.zkw.fedweb.service.NewsCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/newsCate")
public class NewsCateController {
    @Resource
    private NewsCateService newsCateService;

    //新闻中心标题内容
    @GetMapping("/title")
    public List<NewsCate> titles(Integer id) {

        List<NewsCate> titles = newsCateService.title(id);
        return titles;
    }

    //一级标题
    @GetMapping("/titleOne")
    public List<NewsCate> titleOne() {

        List<NewsCate> titleOne = newsCateService.titleOne();
        return titleOne;
    }


}
