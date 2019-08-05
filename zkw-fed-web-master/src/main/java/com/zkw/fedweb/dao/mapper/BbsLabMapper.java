package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.BbsLab;

import java.util.List;

public interface BbsLabMapper {

    //查询热门标签
    List<BbsLab> hotLabel();

    int deleteByPrimaryKey(Integer id);

    int insert(BbsLab record);

    int insertSelective(BbsLab record);

    BbsLab selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BbsLab record);

    int updateByPrimaryKey(BbsLab record);
}