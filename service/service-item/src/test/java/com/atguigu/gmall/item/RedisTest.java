package com.atguigu.gmall.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author: 李耀华
 * @date: 2022/9/1 20:05
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void saveTest (){
        ValueOperations<String, String> ops = redisTemplate.opsForValue();

        ops.set("hello","Xian");
        System.out.println("保存完成……");

        String hello = ops.get("hello");
        System.out.println("获取到的值：" + hello);
    }
}
