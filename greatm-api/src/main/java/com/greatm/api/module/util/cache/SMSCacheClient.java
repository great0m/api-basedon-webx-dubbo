package com.greatm.api.module.util.cache;

import com.alibaba.fastjson.JSONObject;
import com.greatm.api.module.base.ApiResponseCode;
import com.greatm.api.module.util.sms.SMSTypeEnum;
import com.greatm.api.module.util.sms.SmsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Date;

/**
 * @author great-m
 * @since 2017/12/24, 下午8:46
 */
public class SMSCacheClient {

    static final protected Logger logger = LoggerFactory.getLogger(SMSCacheClient.class);

    public static final int DEFAULT_DURATION_MINU = 2;//默认有效期10分钟
    /**
     * 缓存短信相关信息
     * @param phone
     * @param typeEnum
     */
    public static String cacheSMS(String phone, final int expireMinu, SMSTypeEnum typeEnum, JedisPool jedisPool, final JSONObject smsJson){
        final String cacheKey = generateCacheKey(phone, typeEnum);
        try {
            String result = JedisHelper.doJedisOperation(new JedisCallback<String>() {
                @Override
                public String doWithJedis(Jedis jedis, Logger logger) {
                    String result = jedis.setex(cacheKey,getSecondsExpire(expireMinu),smsJson.toJSONString());
                    return result;
                }
            }, jedisPool);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 更新短信信息
     * @param phone
     * @param typeEnum
     * @param jedisPool
     * @param smsJson
     * @return
     */
    public static String updateCachSMSInfo(String phone, SMSTypeEnum typeEnum, JedisPool jedisPool, final JSONObject smsJson){
        final String cacheKey = generateCacheKey(phone, typeEnum);
        try {
            String result = JedisHelper.doJedisOperation(new JedisCallback<String>() {
                @Override
                public String doWithJedis(Jedis jedis, Logger logger) {
                    String result = jedis.set(cacheKey,smsJson.toJSONString());
                    return result;
                }
            }, jedisPool);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *根据key删除缓存
     * @param phone
     * @param smsTypeEnum
     */
    public static Long delCacheSmsInfo(String phone, SMSTypeEnum smsTypeEnum, JedisPool jedisPool){
        final String cacheKey = generateCacheKey(phone, smsTypeEnum);
        try {
            Long result = JedisHelper.doJedisOperation(new JedisCallback<Long>() {
                @Override
                public Long doWithJedis(Jedis jedis, Logger logger) {
                    Long result = jedis.del(cacheKey);
                    return result;
                }
            }, jedisPool);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 判断是否存在
     * @param phone
     * @param typeEnum
     */
    public static Boolean isExistKey(String phone, SMSTypeEnum typeEnum, JedisPool jedisPool){
        final String cacheKey = generateCacheKey(phone, typeEnum);
        try {
            boolean result = JedisHelper.doJedisOperation(new JedisCallback<Boolean>() {
                @Override
                public Boolean doWithJedis(Jedis jedis, Logger logger) {
                    boolean result = jedis.exists(cacheKey);
                    return result;
                }
            }, jedisPool);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取SMS INFO
     * @param phone
     * @param typeEnum
     * @param jedisPool
     */
    public static String fetchSMSInfo(String phone, SMSTypeEnum typeEnum, JedisPool jedisPool){
        final String cacheKey = generateCacheKey(phone, typeEnum);
        try {
            String result = JedisHelper.doJedisOperation(new JedisCallback<String>() {
                @Override
                public String doWithJedis(Jedis jedis, Logger logger) {
                    String result = jedis.get(cacheKey);
                    return result;
                }
            }, jedisPool);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 验证短信验证码
     * @param mobile
     * @param smsTypeEnum
     * @param jedisPool
     */
    public static boolean authSMSFromCache(String mobile, SMSTypeEnum smsTypeEnum, String validCode, JedisPool jedisPool){
        String smsInfo = SMSCacheClient.fetchSMSInfo(mobile, smsTypeEnum, jedisPool);
        if ( null == smsInfo){
            logger.info("[register] 用户： "+mobile+" "+smsTypeEnum.getTempText()+" 短信验证码不存在");
            return false;
        }
        JSONObject jsonObject = JSONObject.parseObject(smsInfo);
        String valiCodeCache = jsonObject.getString("valiCode");
        if (validCode.equals(valiCodeCache)) {
            return true;
        }else{
            logger.error("手机号:"+mobile+" 输入的验证码:"+validCode+" 当前缓存:"+valiCodeCache);
            return false;
        }
    }

    /**
     * 发送业务短信
     * @param enumByType
     * @param mobile
     * @param jedisPool
     * @return
     */
    public static JSONObject sendSMSAndSaveCache(SMSTypeEnum enumByType , String mobile, JedisPool jedisPool){

        String smsValicodeLen6 = SmsHelper.getSmsValicodeLen6(mobile + mobile);
        String sendSMSResult = SmsHelper.sendSMS(mobile,enumByType,smsValicodeLen6);
        JSONObject resultJsonObject = new JSONObject();
        if (null != sendSMSResult){
            //解析返回结果
            JSONObject obj = JSONObject.parseObject(sendSMSResult);
            int code = obj.getIntValue("code");
            logger.info(mobile+"发送短信验证码"+enumByType.getTempText()+" result json "+obj.toJSONString());
            if (0 == code){ //发送成功
                JSONObject smsJson = buildCacheSMSJson(mobile,smsValicodeLen6, enumByType.getSmsType(), obj.getString("sid"));
                SMSCacheClient.cacheSMS(mobile,SMSCacheClient.DEFAULT_DURATION_MINU,enumByType,jedisPool,smsJson);
                resultJsonObject.put("code", ApiResponseCode.SU);
                resultJsonObject.put("msg",obj.getString("msg"));
                return resultJsonObject;
            }else{
                resultJsonObject.put("code",ApiResponseCode.CLIENT_ERROR);
                resultJsonObject.put("msg",obj.getString("msg"));
                return resultJsonObject;
            }
        }else{
            resultJsonObject.put("code",ApiResponseCode.CLIENT_ERROR);
            resultJsonObject.put("msg","发送短信失败，请重试");
            logger.info(mobile+"发送短信验证码 "+sendSMSResult+" 发送失败");
            return resultJsonObject;
        }
    }

    private static JSONObject buildCacheSMSJson(String mobile, String valiCode, String smsType, String sid){
        JSONObject smsJosn = new JSONObject();
        smsJosn.put("mobile",mobile);
        smsJosn.put("valiCode",valiCode);
        smsJosn.put("createTime",new Date());
        smsJosn.put("type",smsType);
        smsJosn.put("is_used",false);
        smsJosn.put("sid",sid);
        return smsJosn;
    }
    /**
     * 根据短信类型和手机号生成key
     * @param phoneNum
     * @param typeEnum
     * @return
     */
    private static String generateCacheKey(String phoneNum, SMSTypeEnum typeEnum) {
        return typeEnum.getSmsType()+"_" + phoneNum;
    }

    /**
     * 获取指定分钟数的秒数
     * @param minu
     * @return
     */
    private static int getSecondsExpire(int minu){
        return minu * 60;
    }

}
