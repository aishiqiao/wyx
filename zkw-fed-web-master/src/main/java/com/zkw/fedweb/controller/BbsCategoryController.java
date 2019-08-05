package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.BbsCategory;
import com.zkw.fedweb.service.BbsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bbsCategory")
public class BbsCategoryController  {

    @Resource
    private BbsCategoryService bannerService;

    @GetMapping("/title")
    public List<BbsCategory> titles(@Param("id") Integer id) {

        List<BbsCategory> titles = bannerService.title(id);
        return titles;
    }

    @GetMapping("/titleName")
    public List<BbsCategory> titleName() {

        List<BbsCategory> titleName = bannerService.titleName();
        return titleName;
    }



}
