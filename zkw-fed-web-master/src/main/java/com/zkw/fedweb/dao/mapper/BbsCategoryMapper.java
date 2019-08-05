package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.BbsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsCategoryMapper {

    //查询标题
    List<BbsCategory> title(@Param("id") Integer id);

    List<BbsCategory> titleName();



    int deleteByPrimaryKey(Integer id);

    int insert(BbsCategory record);

    int insertSelective(BbsCategory record);

    BbsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BbsCategory record);

    int updateByPrimaryKey(BbsCategory record);
}