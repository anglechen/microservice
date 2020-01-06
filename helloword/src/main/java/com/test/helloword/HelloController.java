package com.test.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //类下的所有的方法都返回数据，而不是返回视图
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/1")
//	@ResponseBody 
	public String hello(String name ) {
		return "hello world " + name;
	}
	
	
	@RequestMapping("/2")
//	@ResponseBody
	public String hello2() {
		return "hello world";
	}
}
