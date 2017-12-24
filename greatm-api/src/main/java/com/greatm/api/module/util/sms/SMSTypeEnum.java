package com.greatm.api.module.util.sms;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:56
 */
public enum SMSTypeEnum {
    SMS_TYPE_SMSVALID("smsvalid", "客户端注册时发送验证码"),
    SMS_TYPE_REGISTER("register", "用户注册"),
    SMS_TYPE_RESETPSD("resetpsd", "重置密码时发送验证码"),
    SMS_TYPE_BINDMOBILE("bindmobile", "以第三方账号登录后，绑定手机时发送验证码"),
    SMS_TYPE_CHECKOLDMOBILE("checkoldmobile", "换手机号时，验证旧手机号的验证码"),
    SMS_TYPE_TRANSFERNEWMOBILE("transfernewmobile", "换手机号时，验证新手机号的验证码"),
    SMS_TYPE_BIZ_REGISTER("register", "商户 注册时发送验证码"),
    SMS_TYPE_BIZ_RESETPSD("bizResetpsd", "商户 重置密码时发送验证码"),
    SMS_TYPE_BIZ_SENDVCFORCASHEXCHANGE("sendvcforcashexchange", "商户 提现时发送验证码"),
    SMS_TYPE_BIZ_SENDVCFORREBINDALIPAY("sendvcforrebindalipay", "更改支付宝账号时发送验证码");

    SMSTypeEnum(String smsType, String tempText) {
        this.smsType = smsType;
        this.tempText = tempText;
    }

    private String smsType;
    private String tempText;

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public String getTempText() {
        return tempText;
    }

    public void setTempText(String tempText) {
        this.tempText = tempText;
    }

    public static SMSTypeEnum findBySmsType(String smsType) {
        for (SMSTypeEnum typeEnum : SMSTypeEnum.values()) {
            if (typeEnum.getSmsType().equals(smsType)) {
                return typeEnum;
            }
        }
        return null;
    }
}
