package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class Comment {
    private Integer id;

    private Integer wid;

    private Integer acid;

    private Integer clid;

    private Integer vid;

    private Integer uid;

    private String content;

    private Boolean star;

    private Boolean status;

    private Integer addtime;

}