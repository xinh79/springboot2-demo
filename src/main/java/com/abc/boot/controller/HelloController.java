package com.abc.boot.controller;

import com.abc.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
//@Controller 表示是控制器
//@ResponseBody 表示返回值是直接写给浏览器的
@RestController
public class HelloController {

    @Autowired
    User user;

    @RequestMapping("/user")
    public String handle02() {
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Dog!";
    }
}
