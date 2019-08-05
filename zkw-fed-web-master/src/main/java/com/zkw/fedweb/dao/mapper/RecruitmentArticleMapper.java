package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.RecruitmentArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitmentArticleMapper {

    //查询详情
    List<RecruitmentArticle> particulars(@Param("id") Integer id);

    //求职攻略
    List<RecruitmentArticle> strategy(@Param("cateId") Integer cateId);


    //求职推荐5条
    List<RecruitmentArticle> recommended(@Param("cateId") Integer cateId);

    List<RecruitmentArticle> allStrategy();


    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentArticle record);

    int insertSelective(RecruitmentArticle record);

    RecruitmentArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitmentArticle record);

    int updateByPrimaryKeyWithBLOBs(RecruitmentArticle record);

    int updateByPrimaryKey(RecruitmentArticle record);
}