package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.BbsLab;

import java.util.List;

public interface BbsLabService {
    //查询热门标签
    List<BbsLab> hotLabel();
}
