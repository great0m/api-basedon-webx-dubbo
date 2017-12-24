package com.greatm.api.module.base;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:19
 * <p>
 * 一般返回数据体
 */
public class BaseResponseVO {

    /**
     * 返回值，便于app端快速识别返回状态
     */
    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
