package com.greatm.api.module.base;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author great-m
 * @since 2017/12/24, 下午7:16
 */
public class BaseApiModule {

    final protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    /**
     * 日期，时间格式
     */
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm";
    public static final String ALL_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String ALL_FORMAT_WITHOUT_SECOND = "yyyy-MM-dd HH:mm";

    protected static final String HTTP_ROOT = "http://";

    /**
     * 静态协议 URL
     */
    protected static final String USER_AGREEMENT_URL = "/aboutus/useragreement.htm"; // C01
    protected static final String STAR_AGREEMENT_URL = "/aboutus/staragreement.htm"; // C02
    protected static final String SIGNED_STAR_AGREEMENT_URL = "/aboutus/signedstaragreement.htm"; // C03
    protected static final String SHOP_AGREEMENT_URL = "/aboutus/shopagreement.htm"; // S01
    protected static final String TASK_AGREEMENT_URL = "/aboutus/taskagreement.htm"; // S02

    protected static final String SHARE_URL_ROOT = Env.isProd() ? "http://a.sample.site" : "http://10.0.1.154";
    protected static final String SHARE_URL_TEMPLATE = "%s/h5/sharelive.htm?live_id=%s";

    protected static final String SHARE_BRAND_URL_TEMPLATE = "%s/h5/sharebrand.htm?brand_id=%s";

    protected static final String SHARE_TASK_URL_TEMPLATE = "%s/h5/sharetask.htm?task_id=%s";

    protected static final String SHARE_APP_URL_TEMPLATE = "%s/h5/shareapp.htm";

    /**
     * ROOT URL
     */
    // PROD ENV
    protected static final String DEFAULT_API_DOMAIN = "a.sample.site";
    protected static final String DEFAULT_LOG_DOMAIN = "a.sample.site";

    // TEST ENV
    protected static final String TEST_DEFAULT_API_DOMAIN = "10.0.1.154";
    protected static final String TEST_DEFAULT_LOG_DOMAIN = "10.0.1.159";

    /**
     * DOWNLOAD URL
     */
    protected static final String BIZ_IOS_DOWNLOAD_URL = "https://itunes.apple.com/cn/app/...";
    protected static final String BIZ_ANDROID_DOWNLOAD_URL = "http://zhushou.360.cn/detail/index/soft_id/....";

    protected static final String IOS_DOWNLOAD_URL = "https://itunes.apple.com/cn/app/...";
    protected static final String ANDROID_DOWNLOAD_URL = "http://zhushou.360.cn/detail/index/soft_id/....";


    protected BaseResponseVO buildServerDownResponse() {
        return buildCommonResponse(ApiResponseCode.SERVER_ERROR, ApiResponseMsg.SERVER_DOWN, new JSONObject());
    }

    protected BaseResponseVO buildParamErrorResponse() {
        return buildCommonResponse(ApiResponseCode.CLIENT_ERROR, ApiResponseMsg.EMPTY, new JSONObject());
    }

    protected BaseResponseVO buildParamErrorResponse(String msg) {
        return buildCommonResponse(ApiResponseCode.CLIENT_ERROR, msg, new JSONObject());
    }

    protected BaseResponseVO buildSuccessResponse() {
        return buildCommonResponse(ApiResponseCode.SU, ApiResponseMsg.EMPTY, new JSONObject());
    }

    protected BaseResponseVO buildSuccessResponse(JSONObject jsonObject) {
        return buildCommonResponse(ApiResponseCode.SU, ApiResponseMsg.EMPTY, jsonObject);
    }

    protected BaseResponseVO buildCommonResponse(String code, String message, Object data) {
        BaseResponseVO result = new BaseResponseVO();
        result.setCode(code);
        result.setMsg(message);
        result.setData(data);
        return result;
    }

    protected void LogInfo(String methodName, String memo, JSONObject param) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("target", methodName);
        jsonObject.put("msg", memo);
        jsonObject.put("param", param);
        logger.info(jsonObject.toJSONString());
    }

    protected void LogWarn(String methodName, String memo, JSONObject param) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("target", methodName);
        jsonObject.put("msg", memo);
        jsonObject.put("param", param);
        logger.warn(jsonObject.toJSONString());
    }

    protected void LogError(String methodName, String memo, JSONObject param) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("target", methodName);
        jsonObject.put("msg", memo);
        jsonObject.put("param", param);
        logger.error(jsonObject.toJSONString());
    }

}
