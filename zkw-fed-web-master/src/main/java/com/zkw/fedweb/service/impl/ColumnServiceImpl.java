package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AllClassMapper;
import com.zkw.fedweb.dao.mapper.AttributeMapper;
import com.zkw.fedweb.dao.mapper.ClumnMapper;
import com.zkw.fedweb.dao.po.Attribute;
import com.zkw.fedweb.dao.po.Clumn;
import com.zkw.fedweb.service.ColumnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ColumnServiceImpl implements ColumnService {

    @Resource
    private ClumnMapper clumnMapper;

    @Override
    public List<Clumn> headline() {
        return clumnMapper.headline();
    }

    @Override
    public List<Clumn> innerChain() {
        return clumnMapper.innerChain();
    }


//
//    @Override
//    public List<Clumn> queryColumnByCondition() {
////        Clumn condition = new Clumn();
////
////        if (status != null) {
////
////           condition.setStatus(status.getCode());
////        }
////        if (position != null) {
////            condition.setPosition(position.getCode());
////        }
////        if (type == null) {
////            condition.setType(type.getCode());
////        }
//        // 此处，如需组合其他 po ，则可定义多个 po 组合属性的 domain 返回。
//        return clumnMapper.selectByCondition();
//    }


}
