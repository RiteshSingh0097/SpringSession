package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dum")
public class Question9 {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("student");
        return modelAndView;
    }

    @RequestMapping(value = "/submitTest", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO studentCO){
        return "Username "+studentCO.getFirstName()
                +" Password "+studentCO.getLastName();
    }
}
