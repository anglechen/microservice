package com.aubrey.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {


    @Value("${name:initName}")
    private String name;

    @RequestMapping("/config")
    public String getName() {
        return name;
    }

}
