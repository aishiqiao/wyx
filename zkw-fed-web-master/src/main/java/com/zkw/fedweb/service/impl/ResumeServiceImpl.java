package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.ResumeMapper;
import com.zkw.fedweb.dao.po.Resume;
import com.zkw.fedweb.service.ResumeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public List<Resume> topThree() {
        return resumeMapper.topThree();
    }

    @Override
    public List<Resume> single(Integer id) {
        return resumeMapper.single(id);
    }

    @Override
    public List<Resume> QueryByCondition(Integer area, Integer industryId, Integer workYear, Integer education, Integer expectEmolumentLow, Integer expectEmolumentHigh, Integer yound, Integer old,String type) {
        return resumeMapper.QueryByCondition(area,industryId,workYear,education,expectEmolumentLow,expectEmolumentHigh,yound,old,type);
    }


}
