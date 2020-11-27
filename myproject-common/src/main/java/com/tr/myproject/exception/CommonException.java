package com.tr.myproject.exception;

/**
 * @ClassName CommonException
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/23
 * @Version V1.0
 **/
public class CommonException extends Exception {
    private static final long serialVersionUID = 3094610190695068645L;
    private String code;
    private String message;

    public CommonException(String code, String message) {
        this.code = code;
        this.message = message;
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
}
