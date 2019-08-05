package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.CommentExt;

import java.util.List;

public interface CommentService {

    //查询个人学习排行榜
    List<CommentExt> comment(Integer wid);
}
