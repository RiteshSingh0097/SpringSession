package com.ttn.rest.services;

import com.ttn.rest.entities.Student;
import com.ttn.rest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Integer id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.isPresent() ? optionalStudent.get():null;
    }

    public  void saveStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteUser(Student student){
        studentRepository.delete(student);
    }
}
