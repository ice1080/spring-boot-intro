package com.example.scratch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello spring boot from scratch";
    }

    @RequestMapping("/testStuff")
    public String testStuff() {
        return "testing another route";
    }
}
