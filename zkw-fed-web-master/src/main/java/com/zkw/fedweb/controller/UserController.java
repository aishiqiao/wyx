package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.User;
import com.zkw.fedweb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //查询个人学习排行榜
    @GetMapping("/personTop")
    public List<User> personTop(Integer wid,Integer acid,Integer clid) {

        List<User> personTop = userService.personTop(wid,acid,clid);
        return personTop;
    }
}
