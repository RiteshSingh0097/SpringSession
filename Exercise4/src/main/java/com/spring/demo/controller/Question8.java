package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dummy")
public class Question8 {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }

    @RequestMapping(value = "/submitTest", method = RequestMethod.POST)
    @ResponseBody
    String name(@RequestParam("firstname") String fname,
                @RequestParam("lastname") String lname){
        return "First Name : "+fname+", Last Name : "+lname;
    }
}
