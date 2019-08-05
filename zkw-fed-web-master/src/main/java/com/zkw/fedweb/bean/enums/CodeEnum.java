package com.zkw.fedweb.bean.enums;

/**
  * @program:       zkw-fed-web
  * @description:   枚举基类
  * @author:        LinHai
  * @create:        2019-07-07 23:07
  */
public interface CodeEnum<C, T extends Enum<T> & CodeEnum<C, T, V>, V> {
    C getCode();
    String getName();
    V getValue();
    T getByCode(C code);
}
