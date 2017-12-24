package com.greatm.api.module.base;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:38
 */
public class Env {

    private static final String ENV = "GREAM_ENV";

    /**
     * 判断当前环境是否是生产
     */
    public static boolean isProd() {
        String sysEnv = System.getenv(ENV);
        return "online".equals(sysEnv);
    }

}
