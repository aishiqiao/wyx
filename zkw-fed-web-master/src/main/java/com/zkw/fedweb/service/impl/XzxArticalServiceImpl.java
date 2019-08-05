package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.XzxArticalMapper;
import com.zkw.fedweb.dao.po.XzxArtical;
import com.zkw.fedweb.service.XzxArticalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class XzxArticalServiceImpl implements XzxArticalService {
    @Resource
    private XzxArticalMapper xzxArticalMapper;
    @Override
    public List<XzxArtical> XzxNews() {
        return xzxArticalMapper.XzxNews();
    }
}
