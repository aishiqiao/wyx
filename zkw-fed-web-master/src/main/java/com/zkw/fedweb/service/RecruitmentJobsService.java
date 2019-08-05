package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.RecruitmentJobs;

import java.util.List;

public interface RecruitmentJobsService {
    List<RecruitmentJobs> particulars(Integer id);

    List<RecruitmentJobs> QueryByCondition(Integer workArea,Integer industryId,Integer workYear,Integer education,Integer expectEmolumentLow,Integer expectEmolumentHigh,String type);
}
