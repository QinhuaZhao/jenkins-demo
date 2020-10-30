package com.qianxin.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping
    public String ok(){
        return "ok";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }


}
