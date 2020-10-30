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
    public String test(){
        return "hello world";
    }


}
