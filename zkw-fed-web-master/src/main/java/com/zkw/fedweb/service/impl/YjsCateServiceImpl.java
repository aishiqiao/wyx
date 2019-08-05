package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.YjsCateMapper;
import com.zkw.fedweb.dao.po.YjsCate;
import com.zkw.fedweb.service.YjsCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class YjsCateServiceImpl implements YjsCateService {
    @Resource
    private YjsCateMapper yjsCateMapper;
    @Override
    public List<YjsCate> Subtitle() {
        return yjsCateMapper.Subtitle();
    }
}
