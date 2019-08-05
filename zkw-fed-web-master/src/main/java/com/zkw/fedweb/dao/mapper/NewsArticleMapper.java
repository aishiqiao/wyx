package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.NewsArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsArticleMapper {

    //新闻中心标题内容
    List<NewsArticle> content(@Param("cateId") Integer cateId);

    //推荐内容14条
    List<NewsArticle> recommend(@Param("cateId") Integer cateId);

    //查询详情
    List<NewsArticle> particulars(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsArticle record);

    int insertSelective(NewsArticle record);

    NewsArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsArticle record);

    int updateByPrimaryKeyWithBLOBs(NewsArticle record);

    int updateByPrimaryKey(NewsArticle record);
}