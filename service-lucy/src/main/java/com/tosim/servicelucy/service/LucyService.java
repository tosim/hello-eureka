package com.tosim.servicelucy.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LucyService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "lucyError1")
    public String lucyMethod1(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/api/hello?name=" + name, String.class);
    }

    private String lucyError1(String name) {
        return "hiError" + "name = " + name;
    }


    @HystrixCommand(fallbackMethod = "lucyError2")
    public String lucyMethod2(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/api/hello?name=" + name, String.class);
    }

    private String lucyError2(String name) {
        return "hiError" + "name = " + name;
    }

}
