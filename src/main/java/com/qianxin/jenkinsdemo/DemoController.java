package com.qianxin.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping
    public String ok(){
        return "ok11112222";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(){
        return "test3";
    }

}
