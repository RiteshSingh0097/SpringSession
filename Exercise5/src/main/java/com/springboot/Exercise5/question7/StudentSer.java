package com.springboot.Exercise5.question7;

import com.springboot.Exercise5.question1_2.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentSer {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepo.findAll().iterator();
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }
}
