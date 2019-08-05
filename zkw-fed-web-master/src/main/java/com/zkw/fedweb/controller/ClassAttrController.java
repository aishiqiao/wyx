package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.ClassAttrExt;
import com.zkw.fedweb.service.ClassAttrService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/classAttr")
public class ClassAttrController {
    @Resource
    private ClassAttrService classAttrService;
    //查询
    @GetMapping("/findClassList")
    public List<ClassAttrExt> findClassList(Integer atsub1, Integer atsub2, Integer atsub3,String code, Integer id,Integer type) {
        List<ClassAttrExt> findClassList = null;
        switch (type){
//            综合
            case 0:
                findClassList = classAttrService.findClassList(atsub1,atsub2,atsub3,code,id,null);
                break;
//                按照人气排序
            case 1:
                String wnum = "`wnum` asc";
                findClassList = classAttrService.findClassList(atsub1,atsub2,atsub3,code,id,wnum);
                break;
//                按照价格排序
            default:
                String price = "`price` asc";
                findClassList = classAttrService.findClassList(atsub1,atsub2,atsub3,code,id,price);
                break;
//                按照价格排序反向
            case 3:
                String fwnum = "`wnum` desc";
                findClassList = classAttrService.findClassList(atsub1,atsub2,atsub3,code,id,fwnum);
                break;
//                按照人气反向
            case 4:
                String fprice = "`price` desc";
                findClassList = classAttrService.findClassList(atsub1,atsub2,atsub3,code,id,fprice);
                break;

//            //                按照时间正向
//            case 5:
//                String time = "hc.`time`";
//                findClassList = classAttrMapper.findClassList(atsub1,atsub2,atsub3,code,id,time);
//                break;
//            //                按照时间反向
//            case 6:
//                String ftime = "hc.`time` desc";
//                findClassList = classAttrMapper.findClassList(atsub1,atsub2,atsub3,code,id,ftime);
//                break;
//            //                按照难度正向
//            case 7:
//                String diff = "hc.`star`";
//                findClassList = classAttrMapper.findClassList(atsub1,atsub2,atsub3,code,id,diff);
//                break;
//            //                按照难度反向
//            case 8:
//                String fdiff = "hc.`star` desc";
//                findClassList = classAttrMapper.findClassList(atsub1,atsub2,atsub3,code,id,fdiff);
//                break;
        }





        return findClassList;
    }
}
