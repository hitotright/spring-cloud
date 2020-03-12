package com.github.hitotright.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerRibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer_ribbon")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
