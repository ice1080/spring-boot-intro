package com.example.springwebapp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;

@Controller
public class CustomErrorController implements ErrorController {

	private static final String MISSING_PATH = "/404";
	private static final String ERROR_PATH = "/error";
	private static final String ERROR_TEMPLATE = "customError";

	private final ErrorAttributes errorAttributes;

	@Autowired
	public CustomErrorController(ErrorAttributes errorAttributes) {
		this.errorAttributes = errorAttributes;
	}

	@RequestMapping(MISSING_PATH)
	public String pageNotFound(Model model, HttpServletRequest request) {
		model.addAttribute("error", getErrorAttributes(request, true));
		return "404";
	}

	@RequestMapping(ERROR_PATH)
	public String error(Model model, HttpServletRequest request) {
		Map<String, Object> error = getErrorAttributes(request, true);

		model.addAttribute("timestamp", error.get("timestamp"));
		model.addAttribute("status", error.get("status"));
		model.addAttribute("error", error.get("error"));
		model.addAttribute("message", error.get("message"));
		model.addAttribute("path", error.get("path"));

		return ERROR_TEMPLATE;
	}
	
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

	/*
	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest req, Exception exception, Model model) {
		model.addAttribute("error", "error name");
		model.addAttribute("errorMessage", exception.getMessage());
		return "error";
	}
	*/

	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		ServletWebRequest servletWebRequest = new ServletWebRequest(request);
		return this.errorAttributes.getErrorAttributes(servletWebRequest, includeStackTrace);
	}
}
