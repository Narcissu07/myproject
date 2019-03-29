package com.tr.myproject.common;

/**
 * Created by pj on 2019/3/7.
 */
public class CommonResult {
    private String code;
    private String message;
    private Object data;

    public CommonResult() {
    }

    public CommonResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toString() {
        return "CommonResult [code=" + this.code + ", message=" + this.message + ", data=" + this.data + "]";
    }
}
