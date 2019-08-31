package com.example.springwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest req, Exception exception, Model model) {
		model.addAttribute("error", "error name");
		model.addAttribute("errorMessage", exception.getMessage());
		return "error";
	}

}
