package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.YjsArticle;
import com.zkw.fedweb.service.YjsArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/yjsArticle")
@Slf4j
public class YjsArticleController {
    @Resource
    private YjsArticleService yjsArticleService;

    //研究生5大板块内容查询
    @GetMapping("/dynamic")
    public List<YjsArticle> Dynamic(Integer cate_id) {

        List<YjsArticle> Dynamic = yjsArticleService.Dynamic(cate_id);
        return Dynamic;
    }

    //文章详情
    @GetMapping("/particulars")
    public List<YjsArticle> particulars(Integer id) {

        List<YjsArticle> particulars = yjsArticleService.particulars(id);
        return particulars;

    }


}
