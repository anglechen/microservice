package com.aubrey.consulclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsulController {

    @RequestMapping("/consul")
    public String test(){
        return  "consul";
    }

    @Value("${name:1111111111}")
    private String name;

    @RequestMapping("/config")
    public String config(){
        return name;
    }
}
