package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Video;

import java.util.List;

public interface VideoService {
    //视频链接表
    List<Video> video(Integer id);
}
