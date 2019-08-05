package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerMapper {

    //查询栏目轮播图图
    List<Banner> Carousel(@Param("clumnId") Integer clumnId);




    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}