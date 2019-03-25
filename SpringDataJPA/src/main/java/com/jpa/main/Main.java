package com.jpa.main;

import com.jpa.Service.JpaService;
import com.jpa.config.PersistenceContext;
import com.jpa.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext apx = new AnnotationConfigApplicationContext(PersistenceContext.class);

        JpaService jpaService = apx.getBean(JpaService.class);

        //Question 2
        /*jpaService.savePerson();
        jpaService.savePersons();/*
        jpaService.deleteAll();
        jpaService.deleteEntity();
        jpaService.delete();
        jpaService.countPerson();
        jpaService.findAll();
        jpaService.exists();
        jpaService.findOne();*/

        //Question 5
        /*System.out.println(jpaService.getPersonRepository().findByFirstName("Ritesh"));
        System.out.println(jpaService.getPersonRepository().findByLastName("Aggarwal"));
        System.out.println(jpaService.getPersonRepository().findById(12));*/

        //Question 6
        /*System.out.println(jpaService.getPersonRepository().getfirstName(25));*/

        //Question 7
        /*System.out.println(jpaService.getPersonRepository().getFirstLastName(21));*/

        //Question 8
        /*System.out.println(jpaService.getPersonRepository().getDetail(25));*/

        //Question 9
        /*System.out.println(jpaService.getPersonRepository().count("Peter"));*/

        //Question 10
        /*System.out.println(jpaService.getPersonRepository().countById(21));
        System.out.println(jpaService.getPersonRepository().findDistinctByAge(21));
        System.out.println(jpaService.getPersonRepository().findByIdOrAge(34,21));
        System.out.println(jpaService.getPersonRepository().findByIdAndAge(21,21));
        System.out.println(jpaService.getPersonRepository().findByAgeBetween(19,23));
        System.out.println(jpaService.getPersonRepository().findByAgeLessThan(23));
        System.out.println(jpaService.getPersonRepository().findByAgeGreaterThan(19));
        System.out.println(jpaService.getPersonRepository().findByFirstNameLike("R%"));
        System.out.println(jpaService.getPersonRepository().findByAgeNot(21));

        List<Integer> list = Arrays.asList(21,23,19,20);
        System.out.println(jpaService.getPersonRepository().findByAgeIn(list));
        System.out.println(jpaService.getPersonRepository().findByFirstNameIgnoreCase("ritesh"));*/

        //Question 11
        /*System.out.println(jpaService.getPersonRepository().findByAgeGreaterThanOrderByIdDesc(25));*/

        //Question 12
       /*System.out.println(jpaService.getPersonRepository().findAll(new Sort(Sort.Direction.DESC,"id")));*/

        //Question 13
        Page<Person> personPage = jpaService.getPersonRepository()
                .findAll(new PageRequest(0,3,new Sort(Sort.Direction.ASC, "id")));
        List<Person> personList = personPage.getContent();
        System.out.println(personList);
    }
}
