package com.kkcplatformbackend.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String getHello(){
        return "hello!";
    }

    @RequestMapping(value="/helloByUser",method = RequestMethod.POST)
    public String getHelloByUser(String name){
        return name + "hello!";
    }
}
