package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.RecruitmentIndustry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitmentIndustryMapper {

    //求职攻略三级联查标题
    List<RecruitmentIndustry> title(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentIndustry record);

    int insertSelective(RecruitmentIndustry record);

    RecruitmentIndustry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitmentIndustry record);

    int updateByPrimaryKey(RecruitmentIndustry record);
}