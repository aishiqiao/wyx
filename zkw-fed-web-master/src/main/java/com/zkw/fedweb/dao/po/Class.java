package com.zkw.fedweb.dao.po;

import lombok.Data;

import java.util.List;

@Data
public class Class {

    private Integer id;
    private String code;
    private String cName;
    private String name;
    private String img;
    private Integer num;
    private String author;
    private Integer auid;
    private Integer price;
    private Integer old_price;
    private String alltime;
    private String abstractd;
    private String intro;
    private Integer status;
    private Integer addtime;
    private Integer isection;
    private Integer buynum;
    private Integer snum;
    private Integer wnum;
    private Integer star;
    private Integer type;
    private Integer push;
    private List<ClassAttr>classAttrs;
    private List<User> user;

}
