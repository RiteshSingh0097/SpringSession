package com.jpa.repository;

import com.jpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

    //Question 4
    /*Person findByFirstName(String firstName);

    Person findByLastName(String lastName);

    Person findById(Integer id);*/

    //Question 5
    /*@Query("select firstName from Person where age>:age")
    String getfirstName(@Param("age") Integer age);*/

    //Question 7
    /*@Query("select firstName, lastName from Person where age=:age")
    String getFirstLastName(@Param("age") Integer age);*/

    //Question 8
    /*@Query("select p from Person p where age=:age")
    Person getDetail(@Param("age") Integer age);*/

    //Question 9
    /*@Query("select count(*) from Person where firstName=:firstName")
    Integer count(@Param("firstName") String firstName);*/

    //Question 10
    /*1*//* Integer countById(Integer age);
    *//*2*//*Person findDistinctByAge(Integer age);
    *//*3*//*List<Person> findByIdOrAge(Integer id, Integer age);
    *//*4*//*List<Person> findByIdAndAge(Integer id, Integer age);
    *//*5*//*List<Person> findByAgeBetween(Integer min, Integer max);
    *//*6*//*List<Person> findByAgeLessThan(Integer age);
    *//*7*//*List<Person> findByAgeGreaterThan(Integer age);
    *//*8*//*List<Person> findByFirstNameLike(String string);
    *//*9*//*List<Person> findByAgeNot(Integer integer);
    *//*10*//*List<Person> findByAgeIn(List<Integer> agelist);
    *//*11*//*List<Person> findByFirstNameIgnoreCase(String string);*/

    //Question 11
    /*List<Person> findByAgeGreaterThanOrderByIdDesc(Integer integer);*/

    //Question 12
    /*@Query("select p from Person p where p.age>25")
    List<Person> findAll(Sort sort);*/

    //Question 13
    Page<Person> findAll(Pageable pageable);
}
