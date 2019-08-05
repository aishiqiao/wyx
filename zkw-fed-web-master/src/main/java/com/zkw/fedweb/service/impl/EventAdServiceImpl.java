package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.EventAdMapper;
import com.zkw.fedweb.dao.po.EventAd;
import com.zkw.fedweb.service.EventAdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class EventAdServiceImpl implements EventAdService {
    @Resource
    private EventAdMapper eventAdMapper;
    @Override
    public List<EventAd> contestBar() {
        return eventAdMapper.contestBar();
    }
}
