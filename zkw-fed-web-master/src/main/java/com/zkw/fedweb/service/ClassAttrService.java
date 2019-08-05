package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.ClassAttrExt;

import java.util.List;

public interface ClassAttrService {
    //查询全部课程名称
//    List<ClassExt> findClassList (int atsub1, int atsub2, int atsub3, String code, int id);
    List<ClassAttrExt> findClassList (Integer atsub1, Integer atsub2, Integer atsub3,String code ,Integer id,String type);
}
