package com.aubrey.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//不使用hystrix ,feign使用hystrix 最后单独使用，跟ribbon直接使用starter包邮冲突
@FeignClient("provider")
public interface ProviderFeiclient {

    @RequestMapping("/provider/hello")
    public String sayHello();
}
