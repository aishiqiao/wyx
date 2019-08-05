package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.User;

import java.util.List;

public interface UserService {
    //查询个人学习排行榜
    List<User> personTop(Integer wid,Integer acid,Integer clid);
}
