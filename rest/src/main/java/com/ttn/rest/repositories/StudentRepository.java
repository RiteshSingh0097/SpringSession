package com.ttn.rest.repositories;

import com.ttn.rest.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
