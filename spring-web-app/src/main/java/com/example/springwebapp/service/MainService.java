package com.example.springwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

	public String rose() {
		return "forward:rose.jpeg";
	}
}
