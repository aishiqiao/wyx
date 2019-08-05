package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Event;
import com.zkw.fedweb.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/event")
public class EventController {
    @Resource
    private EventService eventService;

    @GetMapping("/particulars")
    public List<Event> particulars(Integer id) {

        List<Event> particulars = eventService.particulars(id);
        return particulars;

    }
}
