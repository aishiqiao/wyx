package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Exam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamMapper {

    //试题排序
    List<Exam> sorting(@Param("bookId") Integer bookId ,@Param("type") String type);




    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}