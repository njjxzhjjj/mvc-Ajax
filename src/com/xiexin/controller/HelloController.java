package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("请求进入 hello.....");
        return "rello";//故意写成rello  强调，必须和 xxx.jsp.中的xxx- -样
    }

    @RequestMapping("/reg")
    public String reg(){
        System.out.println("请求进入 hello.....");
        return "reg";//故意写成rello  强调，必须和 xxx.jsp.中的xxx- -样
    }
}
