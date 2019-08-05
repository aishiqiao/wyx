package com.zkw.fedweb.service.impl;

import com.zkw.fedweb.dao.mapper.BbsReplyMapper;
import com.zkw.fedweb.dao.po.BbsReply;
import com.zkw.fedweb.service.BbsReplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BbsReplyServiceImpl implements BbsReplyService {
    @Resource
    private BbsReplyMapper bbsReplyMapper;

    @Override
    public List<BbsReply> content(Integer bbsId) {
        return bbsReplyMapper.comment(bbsId);
    }
}
