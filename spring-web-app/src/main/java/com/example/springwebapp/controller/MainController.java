package com.example.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springwebapp.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;

	@RequestMapping("/one")
	public String oneMethod() {
		return "views/one";
	}

	@RequestMapping("/two")
	public String twoMethod() {
		return "views/two";
	}

	@RequestMapping("/rose")
	public String roseMethod() {
		return mainService.rose();
	}

	@RequestMapping("/badStuff")
	public String badMethod() throws Exception {
		if (true) throw new Exception("here's an error, there's an error, errywhere an error error");
		return "stuff";
	}

}
