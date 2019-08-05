package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.BbsMapper;
import com.zkw.fedweb.dao.po.AbroadTeacher;
import com.zkw.fedweb.dao.po.Bbs;
import com.zkw.fedweb.service.BbsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BbsServiceImpl implements BbsService {
    @Resource
    private BbsMapper bbsMapper;
    @Override
    public List<Bbs> Carousel(Integer cateId,String type) {
        return bbsMapper.content(cateId,type);
    }


    //查询详情
    @Override
    public List<Bbs> particulars(Integer id) {
        return bbsMapper.particulars(id);
    }
}
