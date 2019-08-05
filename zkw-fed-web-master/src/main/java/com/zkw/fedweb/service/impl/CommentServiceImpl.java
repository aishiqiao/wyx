package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.CommentMapper;
import com.zkw.fedweb.dao.po.CommentExt;
import com.zkw.fedweb.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<CommentExt> comment(Integer wid) {
//    public Comment comment(Integer wid) {
        return commentMapper.selectCommentExt(wid);
    }
//    @Override
//    public List<Comment> comments(Integer wid) {
//        return commentsMapper.Comment(wid);
//    }
}
