package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.RecruitmentJobsMapper;
import com.zkw.fedweb.dao.po.RecruitmentJobs;
import com.zkw.fedweb.service.RecruitmentJobsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class RecruitmentJobsServiceImpl implements RecruitmentJobsService {
@Resource
private RecruitmentJobsMapper recruitmentJobsMapper;
    @Override
    public List<RecruitmentJobs> particulars(Integer id) {
        return recruitmentJobsMapper.particulars(id);
    }

    @Override
    public List<RecruitmentJobs> QueryByCondition(Integer workArea, Integer industryId, Integer workYear, Integer education, Integer expectEmolumentLow, Integer expectEmolumentHigh, String type) {
        return recruitmentJobsMapper.QueryByCondition(workArea,industryId,workYear,education,expectEmolumentLow,expectEmolumentHigh,type);
    }
}
