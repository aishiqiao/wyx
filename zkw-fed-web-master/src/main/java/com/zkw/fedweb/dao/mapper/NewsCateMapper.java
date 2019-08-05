package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.NewsCate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCateMapper {

    //新闻中心标题
    List<NewsCate> title(@Param("id") Integer id);

    List<NewsCate> titleOne();


    int deleteByPrimaryKey(Integer id);

    int insert(NewsCate record);

    int insertSelective(NewsCate record);

    NewsCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsCate record);

    int updateByPrimaryKey(NewsCate record);
}