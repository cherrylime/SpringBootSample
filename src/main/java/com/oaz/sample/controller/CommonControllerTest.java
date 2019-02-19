package com.oaz.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonControllerTest {
    @RequestMapping("/2")
    public @ResponseBody String root_test() throws Exception{
        return "Root2(/2)";
    }
 
    @RequestMapping("/sample2")
    public @ResponseBody String demo_test() throws Exception{
        return "Sample2(/sample2)";
    }


}
