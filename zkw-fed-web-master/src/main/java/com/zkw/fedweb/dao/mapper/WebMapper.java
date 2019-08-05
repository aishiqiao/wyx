package com.zkw.fedweb.dao.mapper;

import com.zkw.fedweb.dao.po.Web;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface WebMapper {
    int deleteByPrimaryKey(Boolean id);

    int insert(Web record);

    int insertSelective(Web record);

    Web selectByPrimaryKey(Boolean id);

    int updateByPrimaryKeySelective(Web record);

    int updateByPrimaryKey(Web record);
}