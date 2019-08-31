package com.springcore.fundamentals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springcore.fundamentals.service.HomeService;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Value("${myconfig.valueB}")
    private String configValB;

    @RequestMapping("/")
    public String index() {
        return configValB;
    }

    @RequestMapping("/service")
    public String service() {
        return homeService.serviceMethod();
    }
}
