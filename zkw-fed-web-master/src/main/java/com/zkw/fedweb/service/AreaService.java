package com.zkw.fedweb.service;

import com.zkw.fedweb.dao.po.Area;

import java.util.List;

public interface AreaService  {
    //查询地区名
    List<Area> toponym( Integer aid);

}
