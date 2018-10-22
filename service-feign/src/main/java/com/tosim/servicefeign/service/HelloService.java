package com.tosim.servicefeign.service;

import com.tosim.servicefeign.service.hystrix.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-HELLO", fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/api/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
