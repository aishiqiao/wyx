package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.ClassAttrExtMapper;
import com.zkw.fedweb.dao.po.ClassAttrExt;
import com.zkw.fedweb.service.ClassAttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ClassAttrServiceImpl implements ClassAttrService {
    @Resource
    private ClassAttrExtMapper classAttrExtMapper;
    @Override
//    public List<ClassExt> findClassList(int atsub1, int atsub2, int atsub3, String code, int id) {
//        return classExtMapper.findClassList(atsub1,atsub2,atsub3,code,id);
    public List<ClassAttrExt> findClassList(Integer atsub1, Integer atsub2, Integer atsub3, String code ,Integer id,String type ) {
        return classAttrExtMapper.findClassList(atsub1,atsub2,atsub3,code,id,type );
    }
}
