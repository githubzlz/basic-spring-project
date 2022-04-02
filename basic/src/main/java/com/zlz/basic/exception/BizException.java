package com.zlz.basic.exception;

/**
 * 业务异常
 *
 * @author zhulinzhong
 * @version 1.0 CreateTime:2019/12/20 17:59
 */
public class BizException extends RuntimeException {

    protected Integer code = 0;

    public BizException() {
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Integer code, String message) {
        super(code + ":" + message);
        this.code = code;
    }

    public BizException(Integer code, String message, Throwable cause) {
        super(code + ":" + message, cause);
        this.code = code;
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Integer getCode() {
        return code;
    }
}
