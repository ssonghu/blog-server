package com.blog.dto;

import java.io.Serializable;

/**
 * 响应结果封装类
 *
 * @param <T>
 */
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -4101953740645159362L;

    private String code;

    private String desc;

    private T data;

    public ResponseResult(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public ResponseResult(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
