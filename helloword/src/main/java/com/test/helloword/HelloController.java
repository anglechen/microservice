package com.test.helloword;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //类下的所有的方法都返回数据，而不是返回视图
@RequestMapping("/hello")
public class HelloController {

	
	@Value("${money.max}")
	private int moneyMax;
	
	@RequestMapping("/1")
//	@ResponseBody 
	public String hello(String name ) {
		return "hello world " + name +"，最大金额：" + moneyMax;
	}
	
	@Autowired
	private User user;
	
	
	@RequestMapping("/2")
//	@ResponseBody
	public String hello2() {
		return "hello world:" + user.getUsername() +":" +user.getPassword();
	}
}
