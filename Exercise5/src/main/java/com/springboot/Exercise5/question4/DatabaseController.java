package com.springboot.Exercise5.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    Database database;

    @GetMapping("/database")
    public String db(){
        return database.toString();
    }
}
