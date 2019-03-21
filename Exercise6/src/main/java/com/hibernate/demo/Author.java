package com.hibernate.demo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


//Question 1

@Entity
public class Author {

    @Id
    //Question  9
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fname")
    private String firstName;
    @Column(name = "lname")
    // Question 7
    /*@Transient*/
    private String lastName;
    private Integer age;
    //Question 16
    @Temporal(TemporalType.DATE)
    private Date dob;
    //Question 11
/*    @Embedded
    private Address address;*/

    // Question 15
/*
    @OneToOne
    @JoinColumn
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
*/

    //Question 16
    /*@OneToMany(mappedBy = "author")*/
    /*@JoinTable(joinColumns = @JoinColumn(name = "AUTHOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "Book_Id"))*/

    @ManyToMany
    Collection<Book> book = new HashSet<>();

    public Collection<Book> getBook() {
        return book;
    }

    public void setBook(Collection<Book> book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

   /* @ElementCollection
    List<String> subjectLists = new ArrayList<>();*/

    public void setId(Integer id) {
        this.id = id;
    }

   /* public List<String> getSubjectLists() {
        return subjectLists;
    }

    public void setSubjectLists(List<String> subjectLists) {
        this.subjectLists = subjectLists;
    }*/

/*
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


}

