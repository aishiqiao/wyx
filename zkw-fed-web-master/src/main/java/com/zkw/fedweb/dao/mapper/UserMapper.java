package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {

    //个人学习排行榜
    List<User> PersonTop( @Param("wid") Integer wid,@Param("acid") Integer acid,@Param("clid") Integer clid);
}
