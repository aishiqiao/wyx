package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.NewsArticleMapper;
import com.zkw.fedweb.dao.po.NewsArticle;
import com.zkw.fedweb.service.NewsArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class NewsArticleServiceImpl implements NewsArticleService {
    @Resource
    private NewsArticleMapper newsArticleMapper;
    @Override
    public List<NewsArticle> content(Integer cateId) {
        return newsArticleMapper.content(cateId);
    }

    //查询详情
    @Override
    public List<NewsArticle> particulars(Integer id) {
        return newsArticleMapper.particulars(id);
    }

    @Override
    public List<NewsArticle> recommend(Integer cateId) {
        return newsArticleMapper.recommend(cateId);
    }
}
