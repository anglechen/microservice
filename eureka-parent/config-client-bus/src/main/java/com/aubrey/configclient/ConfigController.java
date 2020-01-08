package com.aubrey.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    // 远程配置修改配置后，访问：http://localhost:8091/actuator/bus-refresh，然后再次查看配置，可以发现配置会自动刷新
//    如果是本地配置需要手动重启config-server服务，让服务重新加载硬盘的配置，然后访问：http://localhost:8091/actuator/bus-refresh，然后再次查看配置，可以发现配置会自动刷新
    @Value("${name:initName}")
    private String name;

    @RequestMapping("/config")
    public String getName() {
        return name;
    }

}
