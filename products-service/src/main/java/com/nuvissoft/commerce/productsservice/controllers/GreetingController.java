package com.nuvissoft.commerce.productsservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class GreetingController {


    @GetMapping(value="/")
    public double getMethodName() {
        return 3;
    }
    
}
