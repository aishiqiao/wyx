package com.zkw.fedweb.bean.vo;

import com.zkw.fedweb.dao.po.Clumn;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class ColumnVo {
    private Integer id;

    private Integer pid;

    private Integer level;

    private String name;

    private Integer position;

    private Integer sort;

    private String address;

    private Integer type;

    private String code;

    private String content;

    public static ColumnVo valueOf(Clumn column) {
        if (column == null) {
            return null;
        }
        ColumnVo columnVo = new ColumnVo();
        BeanUtils.copyProperties(column, columnVo);
        return columnVo;
    }
}
