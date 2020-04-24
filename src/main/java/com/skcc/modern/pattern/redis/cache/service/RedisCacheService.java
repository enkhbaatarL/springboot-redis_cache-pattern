package com.skcc.modern.pattern.redis.cache.service;

import com.skcc.modern.pattern.redis.cache.config.RedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Autowired
    public RedisConfiguration redisConf;

    public RedisCacheService(RedisConfiguration redisConf) {
        this.redisConf = redisConf;
    }


}
