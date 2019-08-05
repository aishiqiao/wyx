package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.AllClassMapper;
import com.zkw.fedweb.dao.po.AllClass;
import com.zkw.fedweb.service.AllClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class AllClassServiceImpl implements AllClassService {
    @Resource
    private AllClassMapper allClassMapper;

    //小初高和继续教育课程推荐一级标题
    @Override
    public List<AllClass> XJRecommend(Integer wid) {
        return allClassMapper.XJRecommend(wid);
    }

    ////查询小标题下的标题名
    @Override
    public List<AllClass> version(Integer id,Integer pid) {
        return allClassMapper.version(id,pid);
    }

    //查询小标题名
    @Override
    public List<AllClass> heading(Integer id) {
        return allClassMapper.heading(id);
    }



    @Override
    public List<AllClass> ZGRecommend(Integer id) {
        return allClassMapper.ZGRecommend(id);
    }


}
