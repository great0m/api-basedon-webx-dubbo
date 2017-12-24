package com.greatm.api.module.util.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.jedis.exceptions.JedisDataException;

/**
 * @author great-m
 * @since 2017/12/24, 下午8:47
 */
public class JedisHelper {

    static final Logger logger = LoggerFactory.getLogger(JedisHelper.class);

    /**
     * 调用主方法
     */
    public static <T> T doJedisOperation(JedisCallback<T> jedisCallback, JedisPool jedisPool) throws Exception {
        Jedis resource = checkRedisResource(jedisPool);
        T result = null;
        boolean resourceBroken = false;
        try {
            result = jedisCallback.doWithJedis(resource, logger);
        } catch (JedisConnectionException e) {
            resourceBroken = true;
            returnBrokenResource(jedisPool, resource);
            logger.error("Can not do jedis operation.", e);
            throw new Exception("Can not do jedis operation.", e);
        } catch (JedisDataException jde) {
            logger.error("JedisDataException: " + jde.getMessage(), jde);
            throw new RuntimeException(jde.getMessage(), jde);
        } finally {
            if (!resourceBroken) {
                releaseResource(jedisPool, resource);
            }
        }
        return result;
    }

    private static void releaseResource(JedisPool jedisPool, Jedis resource) {
        if (resource != null) {
            jedisPool.returnResource(resource);
            resource = null;
        }
    }

    /**
     * 功能描述：检查Redis客户端状态，获取资源
     * <p/>
     * 前置条件：
     * <p/>
     * 方法影响：
     * <p/>
     * Author xiaopeng.li, 2012-11-1
     *
     * @throws Exception
     * @since open-platform-web 1.0
     */
    private static Jedis checkRedisResource(JedisPool jedisPool) throws Exception {
        Jedis resource = null;
        try {
            resource = jedisPool.getResource();
            // 防止获取null资源
            if (resource == null) {
                Exception exception = new Exception("Jedis pool returned null resource ");
                throw exception;
            }

            return resource;
        } catch (JedisConnectionException e) {
            String message = e.getMessage()
                    + ", get resource from Redis pool failed, please check the Redis server state.";
            Exception exception = new Exception(message, e);
            if (resource != null) {
                jedisPool.returnBrokenResource(resource);
            }
            throw exception;
        }
    }

    /**
     * 功能描述：
     * <p/>
     * 前置条件：
     * <p/>
     * 方法影响：
     * <p/>
     * Author xiaopeng.li, 2012-11-12
     *
     * @since open-platform-web 1.0
     */
    private static void returnBrokenResource(JedisPool jedisPool, Jedis resource) {
        if (resource != null) {
            jedisPool.returnBrokenResource(resource);
            resource = null;
        }
    }

}
