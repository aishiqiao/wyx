package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Event;

import java.util.List;

public interface EventMapper {
    //查询详情
    List<Event> particulars(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}