package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Clumn;

import java.util.List;


public interface ColumnService {

    //查询首页大标题
    List<Clumn> headline();

//    List<Clumn> queryColumnByCondition();

    //查询内链标题
    List<Clumn> innerChain();
}
