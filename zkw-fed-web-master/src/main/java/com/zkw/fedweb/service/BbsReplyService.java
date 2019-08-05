package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.BbsReply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsReplyService {
    //标签内容
    List<BbsReply> content(@Param("bbsId")Integer bbsId);
}
