package com.example.security.service;

import org.springframework.stereotype.Service;

import com.example.security.domain.User;

@Service
public interface UserService {
	
	public User findByEmail(String email);
}
