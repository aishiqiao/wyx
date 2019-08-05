package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.EventMapper;
import com.zkw.fedweb.dao.po.Event;
import com.zkw.fedweb.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class EventServiceImpl implements EventService {
    @Resource
    private EventMapper eventMapper;
    @Override
    public List<Event> particulars(Integer id) {
        return eventMapper.particulars(id);
    }
}
