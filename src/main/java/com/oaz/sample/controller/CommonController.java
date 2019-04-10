package com.oaz.sample.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CommonController {
    
    @RequestMapping("/")
    public String root_test() throws Exception{
        return "Root22(/)";
    }
 
    @RequestMapping("/sample")
    public String demo_test() throws Exception{
        return "Sample(/sample2222222222222222223)";
    }
 
}


