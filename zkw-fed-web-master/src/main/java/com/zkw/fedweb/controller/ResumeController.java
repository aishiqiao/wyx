package com.zkw.fedweb.controller;

import com.zkw.fedweb.dao.po.Resume;
import com.zkw.fedweb.service.ResumeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Resource
    private ResumeService resumeService;

    //简历前三
    @GetMapping("/topThree")
    public List<Resume> topThree() {

        List<Resume> topThree = resumeService.topThree();
        return topThree;
    }

    //单张简历
    @GetMapping("/single")
    public List<Resume> single(Integer id) {

        List<Resume> single = resumeService.single(id);
        return single;
    }
    //根据条件查询简历  jianli1111111

    @GetMapping("/queryByCondition")
    public List<Resume> QueryByCondition(Resume resume, Integer yound, Integer old, String type) {

        List<Resume> QueryByCondition = resumeService.QueryByCondition(resume.getArea(),
                resume.getIndustryId(),
                resume.getWorkYear(),
                resume.getEducation(),
                resume.getExpectEmolumentLow(),
                resume.getExpectEmolumentHigh(),
                yound, old,
                type);


        return QueryByCondition;
    }

}
