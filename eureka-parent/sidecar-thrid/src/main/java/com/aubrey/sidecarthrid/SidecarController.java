package com.aubrey.sidecarthrid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SidecarController {
    @RequestMapping("/health")
    public String health(){

        return "{\"status\":\"UP\"}";
    }

}
