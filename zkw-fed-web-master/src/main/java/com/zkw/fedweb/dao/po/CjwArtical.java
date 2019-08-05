package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class CjwArtical {

    private int id;
    private String title_img;
    private int is_hot;
    private int is_top;
    private int is_comment;
    private int cate_id;
    private int admin_id;
    private String company;
    private String title;
    private String content;
    private int pv;
    private int status;
    private int create_time;
    private int update_time;


}
