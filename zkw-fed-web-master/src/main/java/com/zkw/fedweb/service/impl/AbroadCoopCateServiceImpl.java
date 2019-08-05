package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadCoopCateMapper;
import com.zkw.fedweb.dao.po.AbroadCoopCate;
import com.zkw.fedweb.service.AbroadCoopCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class AbroadCoopCateServiceImpl implements AbroadCoopCateService {
    @Resource
    private AbroadCoopCateMapper abroadCoopCateMapper;
    @Override
    public List<AbroadCoopCate> Symbiosis() {
        return abroadCoopCateMapper.Symbiosis();
    }
}
