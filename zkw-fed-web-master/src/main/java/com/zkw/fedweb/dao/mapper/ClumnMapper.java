package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Clumn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ClumnMapper {


    //查询首页大标题
    List<Clumn> headline();

//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Clumn record);
//    int updateByPrimaryKeySelective(Clumn record);
//
//    List<Clumn> selectByCondition();
//
//
//    //课程计划查询
//    public Clumn selectList();
//查询底部内链页面
List<Clumn> innerChain();

}