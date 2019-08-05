package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.CkkjArticle;

import java.util.List;

public interface CkkjArticleService {
    //创客空间标题
    List<CkkjArticle> content(Integer cateId );
    List<CkkjArticle> particulars(Integer id);
}
