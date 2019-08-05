package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Banner;
import com.zkw.fedweb.service.BannerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/banner")
public class BannerController {

@Resource
    private BannerService bannerService;

    @GetMapping("/carousel")
    public List<Banner> carousel(@Param("clumnId") Integer clumnId) {

        List<Banner> carousels = bannerService.Carousel(clumnId);
        return carousels;
    }

}
