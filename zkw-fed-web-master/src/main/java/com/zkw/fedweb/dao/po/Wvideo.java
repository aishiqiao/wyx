package com.zkw.fedweb.dao.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wvideo  {
    private int id;
    private int wid;
    private int acid;
    private int clid;
    private int uid;
    private int vid;
    private String autotime;
    private String nowtime;
    private String pretime;
    private int status;
    private String alltime;
    private int play_time;

//    private  User user;



}
