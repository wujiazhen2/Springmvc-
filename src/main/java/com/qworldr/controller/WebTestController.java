package com.qworldr.controller;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTestController {

    @RequestMapping("/test")
    public String helloWorld(){
        return "hello World";
    }
}
