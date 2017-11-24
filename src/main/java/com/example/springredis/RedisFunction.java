package com.example.springredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisFunction {

    // @Autowired
    // private RedisTemplate<String, ?> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    // @Autowired
    // private RedisKeyValueTemplate keyValueTemplate;

    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
}
