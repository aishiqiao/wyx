package com.zkw.fedweb.bean.enums;

/**
  * @program:       zkw-fed-web
  * @description:   
  * @author:        LinHai
  * @create:        2019-07-08 00:01
  */
public enum ColumnType implements CodeEnum<Integer, ColumnType, Integer> {
    NO_CONTENT(0, "无内容"),
    HAS_CONTENT(1, "有内容");

    private Integer code;
    private String name;

    ColumnType(Integer code, String name) {
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
    public ColumnType getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ColumnType instance : ColumnType.values()) {
            if (code == instance.getCode()) {
                return instance;
            }
        }
        return null;
    }
}
