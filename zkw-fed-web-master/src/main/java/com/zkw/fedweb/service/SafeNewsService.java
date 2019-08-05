package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.SafeNews;

import java.util.List;

public interface SafeNewsService {

    //校园隐患案例分析
    List<SafeNews> news( Integer cid);
}
