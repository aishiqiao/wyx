package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {

    //查询地区名
    List<Area> toponym(@Param("aid") Integer aid);

    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}