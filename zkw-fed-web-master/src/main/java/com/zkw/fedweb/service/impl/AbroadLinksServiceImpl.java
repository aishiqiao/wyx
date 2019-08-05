package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AbroadLinksMapper;
import com.zkw.fedweb.dao.po.AbroadLinks;
import com.zkw.fedweb.service.AbroadLinksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class AbroadLinksServiceImpl implements AbroadLinksService {
    @Resource
    private AbroadLinksMapper abroadLinksMapper;
    @Override
    public List<AbroadLinks> FriendLink() {
        return abroadLinksMapper.FriendLink();
    }
}
