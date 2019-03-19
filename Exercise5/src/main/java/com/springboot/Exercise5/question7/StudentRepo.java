package com.springboot.Exercise5.question7;

import com.springboot.Exercise5.question1_2.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
