package com.robbie.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:\nTEST}")
    private String testHello;


    @RequestMapping("/hello")
    public String hello() {
//        System.out.println("被访问啦！");
        return "Hello, World" + testHello;
    }
}
