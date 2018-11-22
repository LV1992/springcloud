package com.springcloud.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/test")
    public String testCloud(){
        //使用应用名加接口地址访问rest api
        return this.restTemplate.getForObject("http://springcloud-provider:7900/provider/test",String.class);
    }
}
