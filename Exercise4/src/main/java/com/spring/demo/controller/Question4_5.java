package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/qus")
public class Question4_5 {

    //Question 4
    @ResponseBody
    @RequestMapping("/hello")
    String hello(){
        return "Hello World";
    }

    //Question 5
    @RequestMapping("/hello1")
    ModelAndView hello1(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("msg","Hello World");
        return modelAndView;
    }
}
