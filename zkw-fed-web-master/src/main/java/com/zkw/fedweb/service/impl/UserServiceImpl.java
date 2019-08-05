package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.UserMapper;
import com.zkw.fedweb.dao.po.User;
import com.zkw.fedweb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> personTop(Integer wid,Integer acid,Integer clid) {
        return userMapper.PersonTop(wid,acid,clid);
    }
}
