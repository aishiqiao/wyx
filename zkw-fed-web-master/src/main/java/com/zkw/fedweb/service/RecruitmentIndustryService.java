package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.RecruitmentIndustry;

import java.util.List;

public interface RecruitmentIndustryService {
    //求职攻略三级联查标题
    List<RecruitmentIndustry> title(Integer id);
}
