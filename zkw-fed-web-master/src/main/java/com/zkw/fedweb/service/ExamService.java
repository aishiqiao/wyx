package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Exam;

import java.util.List;

public interface ExamService {
    //试题排序
    List<Exam> sorting(Integer bookId , String type);
}
