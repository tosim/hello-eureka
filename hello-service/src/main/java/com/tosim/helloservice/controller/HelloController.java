package com.tosim.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/api/hello")
    public String hello(@RequestParam String name) {
        return "hello" + name + " port = " + port;
    }

    @GetMapping("/actuator/info")
    public String info() {
        return "info : port = " + port;
    }

}
