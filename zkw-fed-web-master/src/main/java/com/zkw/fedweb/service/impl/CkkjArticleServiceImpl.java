package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.CkkjArticleMapper;
import com.zkw.fedweb.dao.po.AbroadTeacher;
import com.zkw.fedweb.dao.po.CkkjArticle;
import com.zkw.fedweb.service.CkkjArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class CkkjArticleServiceImpl implements CkkjArticleService {
    @Resource
    private CkkjArticleMapper ckkjArticleMapper;

    @Override
    public List<CkkjArticle> content(Integer cateId) {
        return ckkjArticleMapper.content(cateId);
    }



    @Override
    public List<CkkjArticle> particulars(Integer id) {
        return ckkjArticleMapper.particulars(id);
    }

}
