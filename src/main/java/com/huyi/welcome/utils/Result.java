package com.huyi.welcome.utils;

import lombok.Data;


public class Result<T> {

    private String message;

    private String code;

    private T t;

    private boolean success;

    /**
     * 正常返回(带返回数据)
     * @param message
     * @param code
     * @param t
     * @param success
     */
    public Result(String message, String code, T t, boolean success) {
        this.message = message;
        this.code = code;
        this.t = t;
        this.success = success;
    }

    /**
     * 正常返回(不带返回数据)
     * @param message
     * @param code
     * @param success
     */
    public Result(String message, String code, boolean success) {
        this.message = message;
        this.code = code;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
