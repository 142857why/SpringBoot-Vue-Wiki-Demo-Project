package com.robbie.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
//        System.out.println("被访问啦！");
        return "Hello, World";
    }
}
