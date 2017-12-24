package com.greatm.api.module.screen;

import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.citrus.util.StringUtil;
import com.alibaba.fastjson.JSONObject;
import com.greatm.api.module.base.ApiResponseCode;
import com.greatm.api.module.base.ApiResponseMsg;
import com.greatm.api.module.base.BaseApiModule;
import com.greatm.api.module.base.BaseResponseVO;
import com.greatm.api.module.util.cache.SMSCacheClient;
import com.greatm.api.module.util.sms.SMSTypeEnum;
import com.greatm.api.module.util.validator.InputValidator;
import com.greatm.client.IAccountService;
import com.greatm.client.model.account.BaseResponseModel;
import com.greatm.client.model.account.LoginUserModel;
import com.greatm.client.model.account.RegisterUserModel;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * @author great-m
 * @since 2017/12/24, 下午10:37
 */
public class Account extends BaseApiModule {

    @Resource
    private IAccountService accountService;

    @Resource
    private JedisPool jedisPool;

    public BaseResponseVO doSms(
            @Param("mobile") String mobile
    ) {
        if (InputValidator.isInvalidMobile(mobile)) {
            return buildParamErrorResponse();
        }

        // check mobile exist
        boolean mobileIsExist = accountService.mobileIsExist(mobile);
        if (mobileIsExist) {
            return buildParamErrorResponse(ApiResponseMsg.DUPLICATED_MOBILE_REGISTER);
        }

        // add mobile in cache & send sms
        SMSTypeEnum enumByType = SMSTypeEnum.findBySmsType("register");
        JSONObject jsonObject = SMSCacheClient.sendSMSAndSaveCache(enumByType, mobile, jedisPool);
        return buildCommonResponse(jsonObject.getString("code"), jsonObject.getString("msg"), new JSONObject());
    }

    public BaseResponseVO doRegister(
            @Param("mobile") String mobile,
            @Param("password") String passowrd,
            @Param("valid_code") String validCode,
            @Param("device_id") String deviceId,
            @Param("register_id") String registerId
    ) {
        // validate
        if (InputValidator.isInvalidMobile(mobile)
                || InputValidator.isInvalidPassword(passowrd)) {
            return buildParamErrorResponse();
        }

        // validate sms code in cache
        SMSTypeEnum smsTypeRegister = SMSTypeEnum.SMS_TYPE_REGISTER;
        boolean authSMSFromCache = SMSCacheClient.authSMSFromCache(mobile, smsTypeRegister, validCode, jedisPool);
        if (!authSMSFromCache) {
            return buildCommonResponse(ApiResponseCode.CLIENT_ERROR, "验证码错误或已使用", new JSONObject());
        }

        RegisterUserModel userModel = new RegisterUserModel();
        userModel.setMobile(mobile);
        userModel.setPassword(passowrd);
        userModel.setDeviceId(deviceId);
        userModel.setRegisterId(registerId);
        BaseResponseModel responseModel = accountService.register(userModel);
        if (responseModel == null || StringUtil.isBlank(responseModel.getDisplayErrorMessage())) {
            return buildServerDownResponse();
        }

        long accoId = responseModel.getDataLong();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accoId", String.valueOf(accoId));
        return buildSuccessResponse(jsonObject);
    }


    public BaseResponseVO doLogin(
            @Param("mobile") String mobile,
            @Param("password") String passowrd,
            @Param("device_id") String deviceId,
            @Param("register_id") String registerId
    ) {
        // validate
        if (InputValidator.isInvalidMobile(mobile)
                || InputValidator.isInvalidPassword(passowrd)) {
            return buildParamErrorResponse();
        }

        // check & fetch
        LoginUserModel userModel = accountService.login(mobile, passowrd, deviceId, registerId);
        if (userModel == null) {
            return buildCommonResponse(ApiResponseCode.NO_DATA, "", null);
        } else if (!StringUtil.isBlank(userModel.getDisplayErrorMessage())) {
            return buildCommonResponse(ApiResponseCode.SERVER_ERROR, userModel.getDisplayErrorMessage(), null);
        }

        // return data
        JSONObject jsonData = new JSONObject();
        jsonData.put("accoid", userModel.getAccoid());
        jsonData.put("name", userModel.getName());
        jsonData.put("img_code", userModel.getImgCode());
        return buildSuccessResponse(jsonData);
    }

    public BaseResponseVO doLogout(
            @Param("accoid") String accoId
    ) {
        if (InputValidator.isInvalidNumberString(accoId)) {
            return buildParamErrorResponse();
        }

        accountService.logout(Long.valueOf(accoId));
        return buildSuccessResponse();
    }
}
