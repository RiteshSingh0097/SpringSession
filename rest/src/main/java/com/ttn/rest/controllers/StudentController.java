package com.ttn.rest.controllers;

import com.ttn.rest.entities.Student;
import com.ttn.rest.exceptions.UserNotFoundException;
import com.ttn.rest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("students/{id}")
    public Student getStudentById(@PathVariable Integer id){
        Student student = studentService.getStudentById(id);
        if (student== null){
            throw new UserNotFoundException("User Not Found");
        }
        return student;
    }

    @PostMapping("/students")
    public Student saveStudent(@Valid @RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    void deleteUser(@PathVariable Integer id){
        Student student = studentService.getStudentById(id);

        if (student==null){
            throw new UserNotFoundException("User Not Found");
        }
        studentService.deleteUser(student);
    }

    @GetMapping("/")
    String helloWorld(@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        System.out.println("hello world");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("good.morning.message",null,locale);
    }

}
