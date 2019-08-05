package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.BbsCategoryMapper;
import com.zkw.fedweb.dao.po.BbsCategory;
import com.zkw.fedweb.service.BbsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BbsCategoryServiceImpl implements BbsCategoryService {
@Resource
private BbsCategoryMapper bbsCategoryMapper;
    @Override
    public List<BbsCategory> title(Integer id) {
        return bbsCategoryMapper.title(id);
    }

    @Override
    public List<BbsCategory> titleName() {
        return bbsCategoryMapper.titleName();
    }
}
