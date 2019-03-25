package com.jpa.Service;

import com.jpa.entity.Person;
import com.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class JpaService {

    @Autowired
    PersonRepository personRepository;

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

  /*  public void savePerson(){
        Person person = new Person(21,"Ritesh","Singh",15100,21);
        personRepository.save(person);
    }

    public void savePersons(){
        List<Person> list = new LinkedList<>();
        list.add(new Person(24,"Vishal","Aggarwal",15100,28));
        list.add(new Person(43,"Rishabh","Khatreja",14800,33));
        list.add(new Person(32,"Shivam","Sexena",13500,38));

        personRepository.save(list);
    }*/

 /*   public void findOne(){
        System.out.println(personRepository.findOne(21));
    }

    public void exists(){
        System.out.println(personRepository.exists(21));
    }

    public void findAll(){
        System.out.println(personRepository.findAll());
    }

    public void countPerson(){
        System.out.println(personRepository.count());
    }

    public void delete(){
        personRepository.delete(34);
    }

    public void deleteEntity(){
        personRepository.delete(personRepository.findOne(21));
    }

    public void deleteAll(){
        personRepository.deleteAll();
    }*/
}
