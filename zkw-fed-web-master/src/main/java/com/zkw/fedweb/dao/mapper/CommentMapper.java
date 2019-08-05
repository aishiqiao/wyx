package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Comment;
import com.zkw.fedweb.dao.po.CommentExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
        int deleteByPrimaryKey(Integer id);

        int insert(Comment record);

        Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    List<CommentExt> selectCommentExt(@Param("wid") Integer wid);
}