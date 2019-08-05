package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class NewsCate {
    private Integer id;
    private Integer aid;
    private Integer bid;
    private Integer cid;
    private Integer pid;

    private String anme;
    private String bname;
    private String cname;
    private String name;
    private String bintro;

    private Boolean status;

    private Integer ord;


}