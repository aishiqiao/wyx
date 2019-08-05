package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Bbs;

import java.util.List;

public interface BbsService {
    //查询继续教育新闻表
    List<Bbs> Carousel(Integer cateId,String type);
    //查询详情
    List<Bbs> particulars(Integer id);
}
