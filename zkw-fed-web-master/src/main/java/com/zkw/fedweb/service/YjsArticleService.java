package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.YjsArticle;

import java.util.List;

public interface YjsArticleService {
    //研究生考研动态
    List<YjsArticle> Dynamic(Integer cate_id);


    //查询名师风采详情
    List<YjsArticle> particulars(Integer id);
}