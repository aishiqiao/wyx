package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.RecruitmentArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitmentArticleService {
    //求职攻略
    List<RecruitmentArticle> strategy(Integer cateId);
    //求职推荐5条
    List<RecruitmentArticle> recommended(@Param("cateId") Integer cateId);
    //查询详情
    List<RecruitmentArticle> particulars(Integer id);

    List<RecruitmentArticle> allStrategy();

}
