package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.CjwArtical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CjwArticalMapper {
    //查询继续教育新闻表
    List<CjwArtical> AdultNews();
}
