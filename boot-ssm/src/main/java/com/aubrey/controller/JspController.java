package com.aubrey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	@RequestMapping("/jsp")
	public String jsp() {
		return "test";
	}
}
