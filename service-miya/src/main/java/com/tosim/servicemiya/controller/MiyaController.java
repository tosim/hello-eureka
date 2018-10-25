package com.tosim.servicemiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MiyaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        return restTemplate.getForObject("http://localhost:8998/info", String.class);
    }

    @GetMapping("/info")
    public String info() {
        return "i am service-miya";
    }

}
