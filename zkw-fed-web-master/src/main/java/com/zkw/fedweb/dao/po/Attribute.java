package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class Attribute {
    private Integer id;

    private String name;

    private Integer pid;

    private Integer wid;

    private Integer sort;

    private Integer status;

    private Integer examShow;

    private String img;

    private Integer isShow;

    public Attribute() {
    }

    public Attribute(Integer id, String name, Integer pid, Integer wid, Integer sort, Integer status, Integer examShow, String img, Integer isShow) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.wid = wid;
        this.sort = sort;
        this.status = status;
        this.examShow = examShow;
        this.img = img;
        this.isShow = isShow;
    }
}