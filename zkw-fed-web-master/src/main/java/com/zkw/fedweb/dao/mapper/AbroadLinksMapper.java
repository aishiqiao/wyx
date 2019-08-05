package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AbroadLinks;

import java.util.List;

public interface AbroadLinksMapper {

    //友情链接
    List<AbroadLinks> FriendLink();










    int deleteByPrimaryKey(Integer id);

    int insert(AbroadLinks record);

    int insertSelective(AbroadLinks record);

    AbroadLinks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AbroadLinks record);

    int updateByPrimaryKey(AbroadLinks record);
}