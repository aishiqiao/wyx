package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.SafeNews;
import com.zkw.fedweb.service.SafeNewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/safeNews")
public class SafeNewsController {

    //校园隐患案例分析
    @Resource
    private SafeNewsService safeNewsService;
    //特色校园推荐
    @GetMapping("/news")
    public List<SafeNews> news(Integer cid) {

        List<SafeNews> news = safeNewsService.news(cid);
        return news;
    }


}
