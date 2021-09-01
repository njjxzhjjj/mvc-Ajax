package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 该控制类是为了查找jsp或者带参数访间jsp或者 跳转的
 I
*/
@Controller
@RequestMapping("/pages")
public class PagesController {
    @RequestMapping("/reg")
    public String reg(){
        System.out.println("请求进入 hello.....");
        return "reg";//故意写成rello  强调，必须和 xxx.jsp.中的xxx- -样
    }

    @RequestMapping("/regForm")
    public String regForm(){
        return "regForm";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }
}
