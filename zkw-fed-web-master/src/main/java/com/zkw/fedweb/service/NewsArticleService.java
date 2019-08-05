package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.NewsArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsArticleService {
    //新闻中心标题内容
    List<NewsArticle> content(@Param("cateId") Integer cateId);
    //推荐内容14条
    List<NewsArticle> recommend(@Param("cateId") Integer cateId);
    //查询详情
    List<NewsArticle> particulars(Integer id);

}
