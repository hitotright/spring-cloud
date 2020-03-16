package com.github.hitotright.eurekaconsumer.controller;

import com.github.hitotright.eurekaconsumer.entity.Goods;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon负载调用
 */
@RestController
public class ConsumerRibbonController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * hystrix 容错保护
     */
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @GetMapping("/consumer_ribbon")
    public String index() {
        // 该方法走eureka注册中心调用
        String itemUrl = "http://eureka-client/goods/{id}";
        Goods result = restTemplate.getForObject(itemUrl, Goods.class, 1);
        System.out.println("订单系统调用商品服务,result:" + result);
        return result.toString();
    }

    /**
     * 请求失败执行的方法
     * fallbackMethod的方法参数个数类型要和原方法一致
     */
    public String fallbackMethod() {
        return "查询商品信息出错!";
    }
}
