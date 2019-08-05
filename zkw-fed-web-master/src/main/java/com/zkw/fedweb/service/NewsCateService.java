package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.NewsCate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCateService {
    //新闻中心标题
    List<NewsCate> title(@Param("id") Integer id);
    //查询一级标题
    List<NewsCate> titleOne();

}
