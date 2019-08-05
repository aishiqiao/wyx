package com.zkw.fedweb.bean.enums;

/**
  * @program:       zkw-fed-web
  * @description:   栏目显示属性
  * @author:        LinHai
  * @create:        2019-07-07 22:54
  */
public enum ColumnStatus implements CodeEnum<Integer, ColumnStatus, Integer> {
    NO_DISPLAY(0, "不显示"),
    DISPLAY(1, "显示");

    private Integer code;
    private String name;

    ColumnStatus(Integer code, String name) {
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
    public ColumnStatus getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ColumnStatus instance : ColumnStatus.values()) {
            if (code == instance.getCode()) {
                return instance;
            }
        }
        return null;
    }
}
