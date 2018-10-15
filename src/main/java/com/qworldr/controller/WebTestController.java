package com.qworldr.controller;

import com.qworldr.aspectj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
        testService.test();
        return "test";
    }
}
