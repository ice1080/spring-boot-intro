package com.springcore.fundamentals.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String serviceMethod() {
        return "this string is from a service";
    }

}
