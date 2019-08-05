package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Banner;

import java.util.List;

public interface BannerService {

    //根据clumn_id查询轮播图
    List<Banner> Carousel(Integer clumnId);
}
