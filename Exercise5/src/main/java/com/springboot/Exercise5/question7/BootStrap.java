package com.springboot.Exercise5.question7;

import com.springboot.Exercise5.question1_2.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class BootStrap {


    @Autowired
    StudentRepo studentRepo;

    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        Iterator<Student> studentIterator = studentRepo.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Student " + i);
                studentRepo.save(student);
                System.out.println("Student " + i + " register");
            }
        }
        System.out.println("Your Application is up and running");
    }
}

