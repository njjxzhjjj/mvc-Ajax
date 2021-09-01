package com.xiexin.controller;

import com.xiexin.bean.AdminInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/admin")

public class AdminController {
    //注册成功后， 如果是单体项目----就要跳转到登陆页面， 这个跳转是后台的转发，重定向，总之是
//后台负责跳转，携带数据的跳转 页面的
//跳转是前端来处理的， 前端根据后台返回code代码，进行跳转,
//如果前端负贵跳转，他会起一一个好听的名字，叫做路由!

    //什么是前后端分离即:项目 上的分离和 数据上:的兮离
// 项目上的分离:前端-一个项目， 后台一个项目   2项目。
// 数据上的分离:. 还是一-个项目 ，只不过 前后端用json 来交互数据。
// 很少在用jstl/ el表达式来写项目。他们的认证是session


    // layui 在ssm框架的使用 ，其实是 数据上的分离， 也可以项目上的分离。
//那么他就是json交互的，那么 后台只需要给他返回json 数据就可以了。

    //以前，在servlet. 中，resp. getWriter( ).print (new . JSONObject. toString(map))。输出json
    //现在，我用mvc框架的， 高级了。。
    //adminName: 423424 //以前受参数.. req. getParamter( "adminName ")
    //adminPwd: 234324
    //adminPwdR: 2342342

    // springMVC第一种收参数方式
    @RequestMapping("/reg")
    @ResponseBody  //这个注解就是返回给前端的json数据! ! !
    public Map reg(String adminName,String adminPwd,String adminPwdR,String adminTime){
        System.out.println("adminPwdR = " + adminPwdR);
        System.out.println("adminTime = " + adminTime);
        Map codeMap = new HashMap();
        if ( !adminPwd.equals(adminPwdR)) {
            codeMap.put("code", "4401");
            codeMap.put("msg", "你输入的密码和重复密码不一致， 注册失败");
            return codeMap;
        }
        if( adminName.length()<=0) {
            codeMap.put("code", "4402");
            codeMap.put("msg", "adminName表单填写完整");
            return codeMap;
        }
        if( adminPwd.length()<=0) {
            codeMap.put("code", "4402");
            codeMap.put("msg", "adminPwd表单填写完整");
            return codeMap;
        }
            codeMap. put( "code" ,0);
            codeMap . put( "msg" , "注册成功");
            return codeMap ;

        }

        //传统版本的  不返回JSON ],
    //跳转使用转发或者重定向
    @RequestMapping("/regForm")
    public  String regForm(String adminName,String adminPwd){
        System.out.println("adminName = " + adminName);
        System.out.println("adminPwd = " + adminPwd);
        //注册成功跳转到登录页
        return "loginForm";
    }


    // springMVC第二种收参数方式，用的叫做 实体类收参数。
    @RequestMapping("/regByBean")
    @ResponseBody
    public Map regByBean(AdminInfo adminInfo){
        System.out.println("adminInfo = " + adminInfo);
        Map codeMap = new HashMap();
        codeMap. put( "code" ,0);
        codeMap . put( "msg" , "注册成功");
        return codeMap ;
    }
}
