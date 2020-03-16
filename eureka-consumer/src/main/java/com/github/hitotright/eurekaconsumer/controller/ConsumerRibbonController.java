package com.github.hitotright.eurekaconsumer.controller;

import com.github.hitotright.eurekaconsumer.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerRibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer_ribbon")
    public String index() {
        // 该方法走eureka注册中心调用
        String itemUrl = "http://eureka-client/goods/{id}";
        Goods result = restTemplate.getForObject(itemUrl, Goods.class, 1);
        System.out.println("订单系统调用商品服务,result:" + result);
        return result.toString();
    }
}
