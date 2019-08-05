package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadDynamicMapper;
import com.zkw.fedweb.dao.po.AbroadDynamic;
import com.zkw.fedweb.service.AbroadDynamicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadDynamicServiceImpl implements AbroadDynamicService {
    @Resource
    private AbroadDynamicMapper abroadDynamicMapper;
    @Override
    public List<AbroadDynamic> Dynamic() {
        return abroadDynamicMapper.Dynamic();
    }
}
