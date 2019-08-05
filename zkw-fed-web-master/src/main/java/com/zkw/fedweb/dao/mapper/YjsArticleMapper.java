package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.YjsArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YjsArticleMapper {

    //研究生5大板块内容查询
    List<YjsArticle> Dynamic( @Param("cate_id") Integer cate_id);

    List<YjsArticle> particulars(@Param("id") Integer id);


    int deleteByPrimaryKey(Integer id);

    int insert(YjsArticle record);

    int insertSelective(YjsArticle record);

    YjsArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YjsArticle record);

    int updateByPrimaryKeyWithBLOBs(YjsArticle record);

    int updateByPrimaryKey(YjsArticle record);
}