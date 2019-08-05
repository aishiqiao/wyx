package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.YjsArticleMapper;
import com.zkw.fedweb.dao.po.YjsArticle;
import com.zkw.fedweb.service.YjsArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class YjsArticleServiceImpl implements YjsArticleService {
    @Resource
    private YjsArticleMapper yjsArticleMapper;
    //研究生5大板块内容查询
    @Override
    public List<YjsArticle> Dynamic(Integer cate_id) {
        return yjsArticleMapper.Dynamic(cate_id);
    }

    @Override
    public List<YjsArticle> particulars(Integer id) {
        return yjsArticleMapper.particulars(id);
    }
}
