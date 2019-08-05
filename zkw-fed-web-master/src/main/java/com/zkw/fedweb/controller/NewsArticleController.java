package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.NewsArticle;
import com.zkw.fedweb.service.NewsArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/newsArticle")
public class NewsArticleController {
    @Resource
    private NewsArticleService newsArticleService;

    //新闻中心标题内容
    @GetMapping("/content")
    public List<NewsArticle> content(Integer cateId) {

        List<NewsArticle> content = newsArticleService.content(cateId);
        return content;
    }
    //推荐内容14条
    @GetMapping("/recommend")
    public List<NewsArticle> recommend(Integer cateId) {

        List<NewsArticle> recommend = newsArticleService.recommend(cateId);
        return recommend;
    }
    //查询详情
    @GetMapping("/particulars")
    public List<NewsArticle> particulars(Integer id) {

        List<NewsArticle> particulars = newsArticleService.particulars(id);
        return particulars;

    }

}
