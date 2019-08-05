package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Bbs;
import com.zkw.fedweb.service.BbsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bbs")
public class BbsController {
    @Resource
    private BbsService bbsService;

    @GetMapping("/Carousel")
    public List<Bbs> Carousels(Integer cateId,Integer type) {

        List<Bbs> Carousels =null;
        switch (type) {
//            综合
            case 0:
                Carousels = bbsService.Carousel(cateId, null);

                break;
//              点击量正向
            case 1:
                String pv = "`pv` asc";
                Carousels = bbsService.Carousel(cateId, pv);
                break;
//              点击量反向
            case 2:
                String fpv = "`pv` desc";
                Carousels = bbsService.Carousel(cateId, fpv);
                break;
            //              时间正向
            case 3:
                String createTime = "`create_time` asc";
                Carousels = bbsService.Carousel(cateId, createTime);
                break;
            //              时间反向
            case 4:
                String fcreateTime = "`create_time` desc";
                Carousels = bbsService.Carousel(cateId, fcreateTime);
                break;
            //              悬赏正向
            case 5:
                String fen = "`fen` asc";
                Carousels = bbsService.Carousel(cateId, fen);
                break;
            //              悬赏反向
            case 6:
                String fFen = "`fen` desc";
                Carousels = bbsService.Carousel(cateId, fFen);
                break;


        }




//                bbsService.Carousel(cateId);
        return Carousels;
    }



    //查询详情
    @GetMapping("/particulars")
    public List<Bbs> particulars(Integer id) {

        List<Bbs> particulars = bbsService.particulars(id);
        return particulars;

    }

}
