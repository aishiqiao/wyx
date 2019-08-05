package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class BbsCategory {
//    private Integer id;
//    bid
    private Integer aid;
    private Integer bid;
    private Integer pid;
    private Integer id;
    private String name;

    private String aname;
    private String bname;

    private Integer status;

    private Integer createTime;


}