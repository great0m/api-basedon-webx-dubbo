package com.greatm.client;

import com.greatm.client.model.account.BaseResponseModel;
import com.greatm.client.model.account.LoginUserModel;
import com.greatm.client.model.account.RegisterUserModel;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:00
 */
public interface IAccountService {

    /**
     * 判断手机号是否存在
     */
    boolean mobileIsExist(String mobile);

    /**
     * 登录，并获得基本信息
     */
    LoginUserModel login(String mobile, String password, String registerId, String deviceId);

    /**
     * 注册，并返回id
     */
    BaseResponseModel register(RegisterUserModel registerUserModel);

    /**
     * 登出，关闭消息推送等功能
     */
    void logout(long accoId);
}
