package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AreaMapper;
import com.zkw.fedweb.dao.po.Area;
import com.zkw.fedweb.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaMapper areaMapper;
    @Override
    public List<Area> toponym(Integer aid) {
        return areaMapper.toponym(aid);
    }
}
