package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.BbsReply;
import com.zkw.fedweb.service.BbsReplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bbsReply")
public class BbsReplyController {
    @Resource
    private BbsReplyService bbsReplyService;

    @GetMapping("/content")
    public List<BbsReply> contents(Integer bbsId) {

        List<BbsReply> contents = bbsReplyService.content(bbsId);
        return contents;
    }




}
