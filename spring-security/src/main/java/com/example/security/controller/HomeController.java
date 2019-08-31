package com.example.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/user")
	@Secured("ROLE_USER")
	public String userMethod() {
		return "role/user";
	}
	
	@RequestMapping("/admin")
	@Secured("ROLE_ADMIN")
	public String adminMethod() {
		return "role/admin";
	}
	
	@RequestMapping("/all")
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	public String allMethod() {
		return "role/all";
	}
	
}
