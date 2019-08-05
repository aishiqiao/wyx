package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.BbsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsCategoryService {
    //查询标题
    List<BbsCategory> title(@Param("id") Integer id);

    List<BbsCategory> titleName();

}
