package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.AllClass;

import java.util.List;

public interface AllClassService {

    //查询小初高和继续教育一级级标题
    List<AllClass> XJRecommend(Integer wid);

    //查询资格证一级标题
    List<AllClass> ZGRecommend(Integer id);

    //查询版本标题下的名称
    List<AllClass> version(Integer id ,Integer pid);

    //查询小标题名
    List<AllClass> heading(Integer id );
}
