package com.laoxu.java.mailtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: luohanye
 * @create: 2019-04-19
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
