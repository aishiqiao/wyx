package com.zkw.fedweb.controller;


import com.zkw.fedweb.dao.po.Clumn;
import com.zkw.fedweb.service.ColumnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/column")
public class ColumnController {

    @Resource
    private ColumnService columnService;

    @GetMapping("/headline")
    public List<Clumn> listDisplayColumn() {

            List<Clumn> headline = columnService.headline();
            return headline;
    }

    @GetMapping("/innerChain")
    public List<Clumn> innerChain() {

        List<Clumn> innerChain = columnService.innerChain();
        return innerChain;
    }
}
