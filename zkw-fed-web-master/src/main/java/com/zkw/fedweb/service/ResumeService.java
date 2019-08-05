package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> topThree();

    List<Resume> single(Integer id);
    List<Resume> QueryByCondition(Integer area,  Integer industryId, Integer workYear, Integer education,Integer expectEmolumentLow,Integer expectEmolumentHigh,Integer yound,Integer old,String type);
}
