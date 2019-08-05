package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Event;

import java.util.List;

public interface EventService {
    //查询详情
    List<Event> particulars(Integer id);}
