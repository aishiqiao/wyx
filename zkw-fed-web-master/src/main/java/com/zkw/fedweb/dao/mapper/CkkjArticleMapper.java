package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.CkkjArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CkkjArticleMapper {

    //创客空间标题下的内容
    List<CkkjArticle> content(@Param("cateId")Integer cateId);
    List<CkkjArticle> particulars(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(CkkjArticle record);

    int insertSelective(CkkjArticle record);

    CkkjArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CkkjArticle record);

    int updateByPrimaryKeyWithBLOBs(CkkjArticle record);

    int updateByPrimaryKey(CkkjArticle record);
}