package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.CkkjArticle;
import com.zkw.fedweb.service.CkkjArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping("/ckkjArticle")
@RestController
public class CkkjArticleController {
    @Resource
    private CkkjArticleService ckkjArticleService;

    @GetMapping("/content")
    public List<CkkjArticle> contents(Integer cateId) {

        List<CkkjArticle> contents = ckkjArticleService.content(cateId);
        return contents;
    }

    //创客空间文章详情
    @GetMapping("/particulars")
    public List<CkkjArticle> particulars(Integer id) {

        List<CkkjArticle> particulars = ckkjArticleService.particulars(id);
        return particulars;

    }


}
