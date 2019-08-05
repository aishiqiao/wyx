package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.EventAd;

import java.util.List;

public interface EventAdMapper {

    //查询大赛标题标题
    List<EventAd> contestBar();

    int deleteByPrimaryKey(Integer id);

    int insert(EventAd record);

    int insertSelective(EventAd record);

    EventAd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EventAd record);

    int updateByPrimaryKey(EventAd record);
}