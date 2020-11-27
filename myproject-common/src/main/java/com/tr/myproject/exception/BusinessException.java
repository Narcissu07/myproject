package com.tr.myproject.exception;

/**
 * @ClassName BusinessException
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/23
 * @Version V1.0
 **/
public class BusinessException extends CommonException {
    private static final long serialVersionUID = 17884272587157888L;

    public BusinessException(String code, String message) {
        super(code, message);
    }
}
