package com.springboot.Exercise5.question1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Question 1

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}

// Question 2

/*
There are three ways to run spring boot program..
1. By running Exercise5Application
2. by running jar file
3. using gradle bootRun
*/
