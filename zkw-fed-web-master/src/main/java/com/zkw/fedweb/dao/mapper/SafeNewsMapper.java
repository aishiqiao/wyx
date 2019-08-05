package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.SafeNews;

import java.util.List;

public interface SafeNewsMapper {

    //校园隐患案例分析
    List<SafeNews> news( Integer cid);

    int deleteByPrimaryKey(Integer id);

    int insert(SafeNews record);

    int insertSelective(SafeNews record);

    SafeNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SafeNews record);

    int updateByPrimaryKeyWithBLOBs(SafeNews record);

    int updateByPrimaryKey(SafeNews record);
}