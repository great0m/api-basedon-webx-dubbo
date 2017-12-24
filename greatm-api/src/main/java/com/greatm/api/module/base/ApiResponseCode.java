package com.greatm.api.module.base;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:24
 */
public class ApiResponseCode {

    public static final String SU = "200";//请求成功
    public static final String NO_DATA = "204";//请求无误，目前无数据
    public static final String POSITIVE = "210";//true，布尔api专用
    public static final String NEGATIVE = "211";//false，布尔api专用
    public static final String VERSION_UNMATCHABLE = "300";//版本不符合
    public static final String SECURITY_UNMATCHABLE = "301";//安全校验失败
    public static final String BLOCK_ERROR = "303";//请求被管理员禁止
    public static final String CLIENT_ERROR = "400";//参数错误等
    public static final String SERVER_ERROR = "500";//服务端错误

    private String value;
    private String desc;

    ApiResponseCode() {
    }

    ApiResponseCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
