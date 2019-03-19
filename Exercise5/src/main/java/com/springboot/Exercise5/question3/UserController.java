package com.springboot.Exercise5.question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    User user;

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return user.toString();
    }

}
