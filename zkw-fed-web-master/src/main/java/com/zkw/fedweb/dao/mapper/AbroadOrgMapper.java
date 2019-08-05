package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadOrg;

import java.util.List;

public interface AbroadOrgMapper {

    //出国留学机构推荐
    List<AbroadOrg> RecommendOrgan();




    int deleteByPrimaryKey(Integer id);

    int insert(AbroadOrg record);

    int insertSelective(AbroadOrg record);

    AbroadOrg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadOrg record);

    int updateByPrimaryKeyWithBLOBs(AbroadOrg record);

    int updateByPrimaryKey(AbroadOrg record);
}