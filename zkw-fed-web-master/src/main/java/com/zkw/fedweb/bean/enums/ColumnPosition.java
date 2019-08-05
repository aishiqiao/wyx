package com.zkw.fedweb.bean.enums;

/**
  * @program:       zkw-fed-web
  * @description:   栏目位置
  * @author:        LinHai
  * @create:        2019-07-07 23:57
  */
public enum ColumnPosition implements CodeEnum<Integer, ColumnPosition, Integer> {
    HEAD(1, "头部"),
    FOOT(2, "底部");

    private Integer code;
    private String name;

    ColumnPosition(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getValue() {
        return code;
    }

    @Override
    public ColumnPosition getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ColumnPosition instance : ColumnPosition.values()) {
            if (code == instance.getCode()) {
                return instance;
            }
        }
        return null;
    }
}
