package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.ExamMapper;
import com.zkw.fedweb.dao.po.Exam;
import com.zkw.fedweb.service.ExamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamMapper examMapper;
    @Override
    public List<Exam> sorting(Integer bookId, String type) {
        return examMapper.sorting(bookId,type);
    }
}
