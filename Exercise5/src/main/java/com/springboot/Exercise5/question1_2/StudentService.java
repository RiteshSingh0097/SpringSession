package com.springboot.Exercise5.question1_2;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

     public List<Student> getStudents(){
         return Arrays.asList(new Student(1,"Ritesh"),
                 new Student(2,"Vishal"));
     }
}
