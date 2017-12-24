package com.greatm.api.module.util.cache;

import org.slf4j.Logger;
import redis.clients.jedis.Jedis;

/**
 * @author great-m
 * @since 2017/12/24, 下午8:46
 */
public interface JedisCallback<T> {
    T doWithJedis(Jedis jedis, Logger logger);
}