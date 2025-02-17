package com.tyrconsulting.tyrjavarest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World! TESTING 1, 2, 3, 4, 5, 6, 7";  
    }

}