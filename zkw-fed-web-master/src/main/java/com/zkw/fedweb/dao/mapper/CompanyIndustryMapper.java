package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.CompanyIndustry;

import java.util.List;

public interface CompanyIndustryMapper {



    List<CompanyIndustry> industry();

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyIndustry record);

    int insertSelective(CompanyIndustry record);

    CompanyIndustry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyIndustry record);

    int updateByPrimaryKey(CompanyIndustry record);
}