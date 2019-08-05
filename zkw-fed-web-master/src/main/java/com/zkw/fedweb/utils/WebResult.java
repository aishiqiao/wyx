package com.zkw.fedweb.utils;

import com.zkw.fedweb.bean.BaseResult;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class WebResult {

    private static Properties RES_MSG_PROP = new Properties();

    static {
        InputStream in = WebResult.class.getClassLoader().getResourceAsStream("webResult.properties");
        if (in == null) {
            in = WebResult.class.getClassLoader().getResourceAsStream("config/webResult.properties");
        }
        if (in == null) {
            log.error("@WebResult:响应码配置文件不存在");
        }
        try {
            RES_MSG_PROP.load(in);
        } catch (Exception e) {
            log.error("@WebResult:加载响应码配置文件出错", e);
        }
    }

    public static <T> BaseResult<T> okResult() {
        return setResult(0, null, null);
    }

    public static <T> BaseResult<T> okResult(T t) {
        return setResult(0, null, t);
    }

    public static <T> BaseResult<T> failResult(Integer code) {
        return setResult(code, null, null);
    }

    public static <T> BaseResult<T> failResult(T t) {
        return failResult(9999, t);
    }

    public static <T> BaseResult<T> failResult(Integer code, T t) {
        return setResult(code, null, t);
    }

    private static <T> BaseResult<T> setResult(Integer code, String msg, T t) {
        BaseResult<T> result = new BaseResult();
        result.setCode(RES_MSG_PROP.getProperty(code + "[code]"));
        result.setMessage(msg);
        if (msg == null) {
            result.setMessage(RES_MSG_PROP.getProperty(code + "[message]"));
        }
        result.setResult(t);
        return result;
    }
}
