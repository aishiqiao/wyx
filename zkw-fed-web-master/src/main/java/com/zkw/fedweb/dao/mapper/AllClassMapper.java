package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.AllClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AllClassMapper {
    //查询二级标题小初高和继续教育一级标题
    List<AllClass> XJRecommend(@Param("wid") Integer wid);

    //查询一级标题资格证
    List<AllClass> ZGRecommend(@Param("id") Integer id);

    //查询版本标题
    List<AllClass> version(@Param("id") Integer id,@Param("pid") Integer pid);

    //查询小标题名
    List<AllClass> heading(@Param("id") Integer id);

    int deleteByPrimaryKey(Boolean id);


    int insert(AllClass record);


    AllClass selectByPrimaryKey(Boolean id);


    int updateByPrimaryKeySelective(AllClass record);

}