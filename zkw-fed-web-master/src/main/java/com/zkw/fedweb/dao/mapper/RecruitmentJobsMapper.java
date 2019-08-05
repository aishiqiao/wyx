package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.RecruitmentJobs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitmentJobsMapper {

    List<RecruitmentJobs> particulars(@Param("id")Integer id);


    List<RecruitmentJobs> QueryByCondition(@Param("workArea")Integer workArea,@Param("industryId")Integer industryId,@Param("workYear")Integer workYear,@Param("education")Integer education,@Param("expectEmolumentLow")Integer expectEmolumentLow,@Param("expectEmolumentHigh")Integer expectEmolumentHigh,@Param("type")String type);


    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentJobs record);

    int insertSelective(RecruitmentJobs record);

    RecruitmentJobs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitmentJobs record);

    int updateByPrimaryKeyWithBLOBs(RecruitmentJobs record);

    int updateByPrimaryKey(RecruitmentJobs record);
}