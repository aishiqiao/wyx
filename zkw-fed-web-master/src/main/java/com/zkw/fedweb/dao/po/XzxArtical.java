package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class XzxArtical {

    private int id;
    private String titleImg;
    private int isHot;
    private int isTop;
    private int isComment;
    private int cateId;
    private int adminId;
    private String company;
    private String title;
    private String content;
    private int pv;
    private int status;
    private int createTime;
    private int updateTime;

}
