package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Bbs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsMapper {

    //标签内容
    List<Bbs> content(@Param("cateId")Integer cateId,@Param("type")String type);



    //查询详情
    List<Bbs> particulars(@Param("id") Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Bbs record);

    int insertSelective(Bbs record);

    Bbs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bbs record);

    int updateByPrimaryKeyWithBLOBs(Bbs record);

    int updateByPrimaryKey(Bbs record);
}