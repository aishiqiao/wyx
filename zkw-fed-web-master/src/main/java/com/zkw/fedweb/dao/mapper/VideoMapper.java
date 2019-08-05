package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Video;

import java.util.List;

public interface VideoMapper {
    //视频链接表
    List<Video> video(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}