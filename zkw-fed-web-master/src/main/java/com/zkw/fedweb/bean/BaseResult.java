package com.zkw.fedweb.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = -8424406329280309673L;
    public static final String SUCCESS_CODE = "0";
    private String code;
    private String message;
    private T result;

    public void setCodeSuccess() {
        this.code = "0";
    }

    public boolean success() {
        return "0".equals(this.code);
    }

    public boolean failed() {
        return !this.success();
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public void setSuccess(T result) {
        this.setCodeSuccess();
        this.result = result;
    }

    public String toString() {
        return "BaseResult [code=" + this.code + ", message=" + this.message + ", result=" + this.result + "]";
    }
}
