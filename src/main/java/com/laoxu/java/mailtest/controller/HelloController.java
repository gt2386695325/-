package com.laoxu.java.mailtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试
 * @author: luohanye
 * @create: 2019-04-17
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Easyblog!";
    }
}
