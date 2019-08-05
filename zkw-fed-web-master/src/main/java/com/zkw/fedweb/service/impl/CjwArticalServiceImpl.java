package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.CjwArticalMapper;
import com.zkw.fedweb.dao.po.CjwArtical;
import com.zkw.fedweb.service.CjwArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class CjwArticalServiceImpl implements CjwArticalService {
    @Resource
    private CjwArticalMapper cjwArticalMapper;
    @Override
    public List<CjwArtical> AdultNews() {
        return cjwArticalMapper.AdultNews();
    }
}
