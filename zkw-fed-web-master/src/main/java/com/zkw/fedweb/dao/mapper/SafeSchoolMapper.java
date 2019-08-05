package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.SafeSchool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SafeSchoolMapper {

    //特色校园推荐
    List<SafeSchool> recommend( );

    //查询详情
    List<SafeSchool> particulars(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(SafeSchool record);

    int insertSelective(SafeSchool record);

    SafeSchool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SafeSchool record);

    int updateByPrimaryKeyWithBLOBs(SafeSchool record);

    int updateByPrimaryKey(SafeSchool record);
}