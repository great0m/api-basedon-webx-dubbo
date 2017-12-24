package com.greatm.api.module.screen;

import com.alibaba.fastjson.JSONObject;
import com.greatm.api.module.base.BaseApiModule;
import com.greatm.api.module.base.BaseResponseVO;
import com.greatm.api.module.base.Env;

/**
 * @author great-m
 * @since 2017/12/22, 下午3:57
 * <p>
 * APP 开启即须获取的静态数据
 * 版本，升级提示，是否强制升级，下载URL，静态条款URL等
 */
public class Configservice extends BaseApiModule {

    public BaseResponseVO doConfig() {

        JSONObject jsonData = new JSONObject();

        if (Env.isProd()) {

            // 生产环境

            jsonData.put("ios_min_version", "1.7.0"); // iOS 最低版本，低于则需要强制升级
            jsonData.put("ios_curr_version", "1.7.0"); // iOS 最新版本，低于则推荐升级

            jsonData.put("android_min_version", "1.6.0"); // android 最低版本，低于则需要强制升级
            jsonData.put("android_curr_version", "1.6.0"); // android 最新版本，低于则推荐升级

            jsonData.put("mapi_domain", DEFAULT_API_DOMAIN); // api请求ip；由于活动或扩容，可能会动态调整
            jsonData.put("log_domain", DEFAULT_LOG_DOMAIN); // 日志请求ip；发送本地日志到服务器
            jsonData.put("root_domain", "/");
            jsonData.put("protocol", "http");

            jsonData.put("min_version_desc", "新版本来袭，更多丰富功能与更好的设计"); // 强制升级提示语
            jsonData.put("curr_version_desc", "新版本来袭，更多丰富功能与更好的设计"); // 推荐升级提示语
            jsonData.put("ios_download_url", IOS_DOWNLOAD_URL); // 下载url
            jsonData.put("android_download_url", ANDROID_DOWNLOAD_URL); // 下载url

            jsonData.put("user_agreement_url", HTTP_ROOT + DEFAULT_API_DOMAIN + USER_AGREEMENT_URL); // 协议url
            jsonData.put("star_agreement_url", HTTP_ROOT + DEFAULT_API_DOMAIN + STAR_AGREEMENT_URL); // 协议url
        } else {

            // 测试环境

            jsonData.put("ios_min_version", "1.8.1");
            jsonData.put("ios_curr_version", "1.8.2");

            jsonData.put("android_min_version", "1.8.1");
            jsonData.put("android_curr_version", "1.8.2");

            jsonData.put("mapi_domain", TEST_DEFAULT_API_DOMAIN);
            jsonData.put("log_domain", TEST_DEFAULT_LOG_DOMAIN);
            jsonData.put("root_domain", "/");
            jsonData.put("protocol", "http");

            jsonData.put("min_version_desc", "新版本来袭，带来更多丰富功能与更好的设计");
            jsonData.put("curr_version_desc", "新版本来袭，带来更多丰富功能与更好的设计");
            jsonData.put("ios_download_url", IOS_DOWNLOAD_URL);
            jsonData.put("android_download_url", ANDROID_DOWNLOAD_URL);

            jsonData.put("user_agreement_url", HTTP_ROOT + TEST_DEFAULT_API_DOMAIN + USER_AGREEMENT_URL);
            jsonData.put("star_agreement_url", HTTP_ROOT + TEST_DEFAULT_API_DOMAIN + STAR_AGREEMENT_URL);
        }

        return buildSuccessResponse(jsonData);
    }
}
