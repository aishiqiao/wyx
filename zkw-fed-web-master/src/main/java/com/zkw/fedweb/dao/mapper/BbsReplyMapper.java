package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.BbsReply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsReplyMapper {


    //论坛评论
    List<BbsReply> comment(@Param("bbsId")Integer bbsId);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsReply record);

    int insertSelective(BbsReply record);

    BbsReply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BbsReply record);

    int updateByPrimaryKeyWithBLOBs(BbsReply record);

    int updateByPrimaryKey(BbsReply record);
}