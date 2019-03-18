package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class Question10 {

    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","This is spring mvc");
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
}
