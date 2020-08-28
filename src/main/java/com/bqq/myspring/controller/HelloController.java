package com.bqq.myspring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody  //这个类的所有方法返回的数据直接写给浏览器
//@Controller

@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!"+name;
    }

}
