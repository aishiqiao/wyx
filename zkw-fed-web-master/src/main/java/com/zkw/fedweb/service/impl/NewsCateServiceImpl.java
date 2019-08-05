package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.NewsCateMapper;
import com.zkw.fedweb.dao.po.NewsCate;
import com.zkw.fedweb.service.NewsCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class NewsCateServiceImpl implements NewsCateService {
    @Resource
    private NewsCateMapper newsCateMapper;
    @Override
    public List<NewsCate> title(Integer id) {
        return newsCateMapper.title(id);
    }

    @Override
    public List<NewsCate> titleOne() {
        return newsCateMapper.titleOne();
    }
}
