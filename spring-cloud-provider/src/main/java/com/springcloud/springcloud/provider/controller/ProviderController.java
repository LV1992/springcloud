package com.springcloud.springcloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/provider/test")
    public String testProvider(){
        return "hello springcloud provider";
    }
}
