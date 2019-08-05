package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Resume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResumeMapper {


    List<Resume> topThree();
    List<Resume> single(Integer id);

    List<Resume> QueryByCondition(@Param("area")Integer area, @Param("industryId") Integer industryId, @Param("workYear")Integer workYear, @Param("education")Integer education,@Param("expectEmolumentLow")Integer expectEmolumentLow,@Param("expectEmolumentHigh")Integer expectEmolumentHigh,@Param("yound")Integer yound,@Param("old")Integer old,@Param("type")String type);
    int deleteByPrimaryKey(Integer id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKeyWithBLOBs(Resume record);

    int updateByPrimaryKey(Resume record);
}