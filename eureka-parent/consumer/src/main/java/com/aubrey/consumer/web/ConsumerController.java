package com.aubrey.consumer.web;

import com.aubrey.consumer.client.ProviderFeiclient;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private ProviderFeiclient providerFeiclient;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "error")
    public String hello()
    {
        return restTemplate.getForObject("http://provider/provider/hello", String.class);
    }









    public String error() {
        return "soory ,the service is not be abled to us";
    }


    @RequestMapping("/helloFeign")
    public String helloFeiclient() {
//        http://provider/provider/hello
        return providerFeiclient.sayHello();


    }

}
