package com.sb.commons;

/**
 * Created by lang_xy on 2018/1/18 9:57.
 */
public enum  ResponseCode {

    SUCCESS(0, "success"),
    ERROR(1, "error");

    private int code;
    private String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
