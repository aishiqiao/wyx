package com.zkw.fedweb.dao.po;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String wx_unionid;
    private String mobile;
    private String username;
    private String truename;
    private String nick;
    private String email;
    private int streng;
    private String password;
    private int type;
    private String pic;
    private int status;
    private int state;
    private int vip;
    private String fen;
    private String method;
    private String adduser;
    private String loginip;
    private int logintime;
    private String cookid;
    private String cookwapid;
    private int create_time;
    private int update_time;
    private int over_time;
    private int user_source;

    private Wvideo wvideos;

    private List<Comment> comment;
//    private Class aclass;


}
