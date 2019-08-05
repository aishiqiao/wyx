package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.RecruitmentArticleMapper;
import com.zkw.fedweb.dao.po.RecruitmentArticle;
import com.zkw.fedweb.service.RecruitmentArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class RecruitmentArticleServiceImpl implements RecruitmentArticleService {
    @Resource
    private RecruitmentArticleMapper recruitmentArticleMapper;
    //查询详情
    @Override
    public List<RecruitmentArticle> particulars(Integer id) {
        return recruitmentArticleMapper.particulars(id);
    }

    @Override
    public List<RecruitmentArticle> allStrategy() {
        return recruitmentArticleMapper.allStrategy();
    }

    @Override
    public List<RecruitmentArticle> strategy(Integer cateId) {
        return recruitmentArticleMapper.strategy(cateId);
    }

    @Override
    public List<RecruitmentArticle> recommended(Integer cateId) {
        return recruitmentArticleMapper.recommended(cateId);
    }
}
