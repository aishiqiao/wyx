package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadActiveMapper;
import com.zkw.fedweb.dao.po.AbroadActive;
import com.zkw.fedweb.service.AbroadActiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class AbroadActiveServiceImpl implements AbroadActiveService {
    @Resource
    private AbroadActiveMapper abroadActiveMapper;
    @Override
    public List<AbroadActive> Interactive() {
        return abroadActiveMapper.Interactive();
    }
}
