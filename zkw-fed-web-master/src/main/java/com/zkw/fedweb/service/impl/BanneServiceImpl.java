package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.BannerMapper;
import com.zkw.fedweb.dao.po.Banner;
import com.zkw.fedweb.service.BannerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class BanneServiceImpl implements BannerService {
    @Resource
    private  BannerMapper bannerMapper;

    @Override
    public List<Banner> Carousel(Integer clumnId) {
        return bannerMapper.Carousel(clumnId);
    }
}
