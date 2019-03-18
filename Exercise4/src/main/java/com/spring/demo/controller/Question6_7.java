package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/qus6")
public class Question6_7 {

    //Question 6
    @RequestMapping("/fname/{fname}/lname/{lname}")
    @ResponseBody
    String returnName(@PathVariable String fname,@PathVariable String lname){
        return "First Name : "+fname+", Last Name : "+lname;
    }

    //Question 7
    @RequestMapping("name/{fname}/{lname}")
    @ResponseBody
    String returnName1(@PathVariable Map<String, String> requestMap){
        return requestMap.get("fname")+" "+requestMap.get("lname");
    }
}
