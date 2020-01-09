package com.test.helloword;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
//	@RequestMapping("/users")
	@RequestMapping(value = "/users",method = RequestMethod.GET )
	@GetMapping
	public String list() {
		return "用户列表";
	}
	
	@GetMapping("/{id}")
	public String querylist(@PathVariable int id) {
		return "用户信息" +id;
	}
	
//	POST /users
	@PostMapping
	public String add(User user) {
		return "新增成功：" + user.getUsername();
		
	}
	
	@DeleteMapping("/{id}")
	public String del(@PathVariable int id) {
		return "删除成功：" + id;
		
	}
	
	
}
