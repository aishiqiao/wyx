package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.CkkjCateMapper;
import com.zkw.fedweb.dao.po.CkkjCate;
import com.zkw.fedweb.service.CkkjCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class CkkjCateServiceImpl implements CkkjCateService {
    @Resource
    private CkkjCateMapper ckkjCateMapper;
    @Override
    public List<CkkjCate> title() {
        return ckkjCateMapper.title();
    }
}
