package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class CommentExt extends Comment {
    private String nick;
    private String pic;
    private String name;
}
