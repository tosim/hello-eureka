package com.tosim.servicefeign.service.hystrix;

import com.tosim.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
