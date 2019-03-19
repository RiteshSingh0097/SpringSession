package com.springboot.Exercise5.question7;

import com.springboot.Exercise5.question1_2.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentSer studentService;

    @GetMapping("/qus7")
    public List<Student> getStudents() {
        return studentService.getStudent();
    }
}
