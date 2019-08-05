package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.SafeNewsMapper;
import com.zkw.fedweb.dao.po.SafeNews;
import com.zkw.fedweb.service.SafeNewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class SafeNewsServiceImpl implements SafeNewsService {
    @Resource
    private SafeNewsMapper safeNewsMapper;
    @Override
    public List<SafeNews> news(Integer cid) {
        return safeNewsMapper.news(cid);
    }
}
