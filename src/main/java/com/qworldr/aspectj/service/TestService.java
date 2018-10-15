package com.qworldr.aspectj.service;

import org.springframework.stereotype.Service;

/**
 * @Author  wujiazhen
 */
@Service
public class TestService {

    public String test(){
        System.out.println("执行test");
        return "test";
    }

}
