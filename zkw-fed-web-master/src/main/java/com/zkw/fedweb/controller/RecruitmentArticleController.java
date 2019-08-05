package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.RecruitmentArticle;
import com.zkw.fedweb.service.RecruitmentArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/recruitment")
public class RecruitmentArticleController {

    @Resource
    private RecruitmentArticleService recruitmentArticleService;
    //查询详情
    @GetMapping("/particulars")
    public List<RecruitmentArticle> particulars(Integer id) {

        List<RecruitmentArticle> particulars = recruitmentArticleService.particulars(id);
        return particulars;

    }
    //根据cateId查询求职攻略
    @GetMapping("/strategy")
    public List<RecruitmentArticle> strategy(Integer cateId) {

        List<RecruitmentArticle> strategy = recruitmentArticleService.strategy(cateId);
        return strategy;
    }

    //根据cateId查询求职攻略5条
    @GetMapping("/recommended")
    public List<RecruitmentArticle> recommended(Integer cateId) {

        List<RecruitmentArticle> recommended = recruitmentArticleService.recommended(cateId);
        return recommended;
    }

    //查询求职攻略文章
    @GetMapping("/allStrategy")
    public List<RecruitmentArticle> allStrategy() {

        List<RecruitmentArticle> allStrategy = recruitmentArticleService.allStrategy();
        return allStrategy;
    }

}
