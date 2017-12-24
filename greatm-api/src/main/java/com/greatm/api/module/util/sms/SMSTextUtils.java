package com.greatm.api.module.util.sms;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:56
 */
public class SMSTextUtils {

    public static Map<SMSTypeEnum, String> smsTextMap = new ConcurrentHashMap<SMSTypeEnum, String>();

    static {
        smsTextMap.put(SMSTypeEnum.SMS_TYPE_REGISTER, "【木星直播】使用#code#在木星直播用户版创建账号。"); //用户注册
        smsTextMap.put(SMSTypeEnum.SMS_TYPE_BIZ_REGISTER, "【木星直播】使用#code#在木星直播商户版创建账号。"); //商户注册
        smsTextMap.put(SMSTypeEnum.SMS_TYPE_RESETPSD, "【木星直播】使用#code#在木星直播用户版修改密码，如非本人操作请忽略该消息。"); //用户重置密码时
        smsTextMap.put(SMSTypeEnum.SMS_TYPE_BIZ_RESETPSD, "【木星直播】使用#code#在木星直播商户版修改密码，如非本人操作请忽略该消息。"); //商户重置密码时
        smsTextMap.put(SMSTypeEnum.SMS_TYPE_BIZ_SENDVCFORCASHEXCHANGE, "【木星直播】您在 #time# 发起的提现验证码为 #code#"); //申请提现短信验证码
    }

}
