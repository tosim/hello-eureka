package com.tosim.servicelucy.controller;

import com.tosim.servicelucy.service.LucyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LucyController {

    @Autowired
    private LucyService lucyService;
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/lucy")
    public String hi(String name) {
        return lucyService.lucyMethod1(name);
    }

//    @GetMapping("/lucy-redis-set")
//    public String test() {
//        redisTemplate.opsForValue().set("myKey", 12);
//        return "test ok";
//    }
//
//    @GetMapping("/lucy-redis-get")
//    public Object testGet() {
//        Object result = redisTemplate.opsForValue().get("myKey");
//        return result;
//    }

    @Value("${common}")
    private String common;

    @GetMapping("/common")
    public String common() {
        return common;
    }
}
