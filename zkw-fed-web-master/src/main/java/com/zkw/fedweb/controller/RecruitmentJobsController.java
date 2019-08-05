package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.RecruitmentJobs;
import com.zkw.fedweb.service.RecruitmentJobsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/recruitmentJobs")
public class RecruitmentJobsController {

    @Resource
    private RecruitmentJobsService recruitmentJobsService;

    @GetMapping("/particulars")
    public List<RecruitmentJobs> particulars(Integer id) {

        List<RecruitmentJobs> particulars = recruitmentJobsService.particulars(id);
        return particulars;
    }



    @GetMapping("/queryByCondition")
    public List<RecruitmentJobs> QueryByCondition(Integer workArea,Integer industryId,Integer workYear,Integer education,Integer expectEmolumentLow,Integer expectEmolumentHigh,String type) {

        List<RecruitmentJobs> QueryByCondition = recruitmentJobsService.QueryByCondition(workArea,industryId,workYear,education,expectEmolumentLow,expectEmolumentHigh,type);
        return QueryByCondition;
    }
}
