package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.BbsLabMapper;
import com.zkw.fedweb.dao.po.BbsLab;
import com.zkw.fedweb.service.BbsLabService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class BbsLabServiceImpl implements BbsLabService {
    @Resource
    private BbsLabMapper bbsLabMapper;
    @Override
    public List<BbsLab> hotLabel() {
        return bbsLabMapper.hotLabel();
    }
}
