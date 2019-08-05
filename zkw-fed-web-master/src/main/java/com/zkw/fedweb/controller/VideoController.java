package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Video;
import com.zkw.fedweb.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/videos")
public class VideoController {
    @Resource
    private VideoService videoService;

    //单视频链接表
    @GetMapping("/video")
    public List<Video> videos(@Param("id")Integer id) {

        List<Video> videos = videoService.video(id);
        return videos;
    }



}
