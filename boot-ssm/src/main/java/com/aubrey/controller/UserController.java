package com.aubrey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aubrey.domain.User;
import com.aubrey.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> query(User user){
		return userService.query(user);
	}
	
	@PostMapping
	public String add(User user) {
		userService.add(user);
		return "success";
	}
	
	
}
