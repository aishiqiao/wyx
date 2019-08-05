package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadOrgMapper;
import com.zkw.fedweb.dao.po.AbroadOrg;
import com.zkw.fedweb.service.AbroadOrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadOrgServiceImpl implements AbroadOrgService{
    @Resource
    private AbroadOrgMapper  abroadOrgMapper;

    @Override
    public List<AbroadOrg> RecommendOrgan() {
        return abroadOrgMapper.RecommendOrgan();
    }
}
