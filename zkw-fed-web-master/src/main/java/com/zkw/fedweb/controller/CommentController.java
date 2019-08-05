package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Comment;
import com.zkw.fedweb.dao.po.CommentExt;
import com.zkw.fedweb.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    //根据wid查询评论
    @GetMapping("/comments")
    public List<CommentExt> Comments(Integer wid) {

        List<CommentExt> Comments = commentService.comment(wid);
        return Comments;
    }
}
