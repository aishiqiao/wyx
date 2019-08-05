package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.VideoMapper;
import com.zkw.fedweb.dao.po.Video;
import com.zkw.fedweb.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoMapper videoMapper;
    @Override
    public List<Video> video(Integer id) {
        return videoMapper.video(id);
    }
}
