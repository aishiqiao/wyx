package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.SafeCateMapper;
import com.zkw.fedweb.dao.po.SafeCate;
import com.zkw.fedweb.service.SafeCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class SafeCateServiceImpl implements SafeCateService {
    @Resource
    private SafeCateMapper safeCateMapper;
    @Override
    public List<SafeCate> title() {
        return safeCateMapper.title();
    }
}
