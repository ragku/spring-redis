package com.example.springredis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private RedisFunction redisFunction;

    @Test
    public void contextLoads() {
        String key = "test";
        String value = "value";

        redisFunction.set(key, value);
        String actual = redisFunction.get("test");
        Assert.assertEquals(value, actual);
    }

}
