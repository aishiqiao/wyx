package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.ZgzArticalMapper;
import com.zkw.fedweb.dao.po.ZgzArtical;
import com.zkw.fedweb.service.ZgzArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class ZgzArticalServiceImpl implements ZgzArticalService{
    @Resource
    private  ZgzArticalMapper zgzArticalMapper;
    @Override
    public List<ZgzArtical> ZgzNews() {
        return zgzArticalMapper.ZgzNews();
    }
}
