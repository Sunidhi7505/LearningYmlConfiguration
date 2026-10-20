package com.example.yamlProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @Value("${app.web.msg}")
    private String message;

    @Value("${app.web.code}")
    private int code;

    @Value("${app.web.users}")
    private List<String> names;

    @GetMapping
    public String display(){
        return "Hello "+message+ "\n and your code is "+ code + "\n and your names list are " + names;
    }
}
