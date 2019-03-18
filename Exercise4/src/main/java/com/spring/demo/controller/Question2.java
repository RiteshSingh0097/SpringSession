package com.spring.demo.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question2 extends MultiActionController {

    public ModelAndView hello(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }

    public void hello1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>Hello World</b>");
    }
}
