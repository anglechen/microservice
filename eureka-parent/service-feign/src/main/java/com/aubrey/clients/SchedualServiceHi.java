package com.aubrey.clients;

import com.aubrey.clients.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
//@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
@FeignClient(value = "provider", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/provider/hello", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

