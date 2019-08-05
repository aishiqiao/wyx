package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Exam;
import com.zkw.fedweb.service.ExamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/exam")
public class ExamController {

    @Resource
    private ExamService examService;

    //试题排序
    @GetMapping("/sorting")
    public List<Exam> sorting(Integer bookId , Integer type) {

        List<Exam> sorting = null;
//        examService.sorting(bookId ,type);
        switch (type) {
//            综合
            case 0:
                sorting = examService.sorting(bookId, null);
                break;
            //            时间正向
            case 1:
                String addtime = "`addtime` asc";
                sorting = examService.sorting(bookId, addtime);
                break;
            //            时间反向
            case 2:

                String faddtime = "`addtime` desc";
                sorting = examService.sorting(bookId, faddtime);
                break;
            //            难度正向
            case 3:
                String hard = "`exam_hard` asc";
                sorting = examService.sorting(bookId, hard);

                break;
            //            难度反向
            case 4:
                String fhard = "`exam_hard` asc";
                sorting = examService.sorting(bookId, fhard);
                break;
            //            人气正向
            case 5:
                String pv = "`pv` asc";
                sorting = examService.sorting(bookId, pv);
                break;
            //            人气反向
            case 6:
                String fpv = "`pv` desc";
                sorting = examService.sorting(bookId, fpv);
                break;
        }
            return sorting;
        }

    }
