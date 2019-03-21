package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //Question2 CRUD operation

        //Create

        /*Author author = new Author();
        author.setId(1);
        author.setFirstName("vishal");
        author.setLastName("aggarawal");
        author.setAge(21);
        author.setDob(new Date(96,11,13));

        Address address = new Address();
        address.setLocation("Beta-1");
        address.setState("U.P.");
        address.setStreetNumber(32);

        author.setAddress(address);
        // Qusestion 12
        // Question 13
        author.setSubjectLists(Arrays.asList("physics","chemistry", "mathematics"));
        */
        /*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();*/

        /*
        session.save(author);
        session.getTransaction().commit();*/

        //Read
        /*System.out.println(session.get(Author.class,"vishal"));
        session.close();
        sessionFactory.close();*/

        //Update
        /*Author author = session.get(Author.class,"vishal");
        author.setLastName("aggrawal");
        session.update(author);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);*/

        //Delete
        /*Author author = session.get(Author.class,"vishal");
        session.delete(author);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);*/


        //Question 3
        /*Author author = session.get(Author.class,"vishal");
        author.setDob(new Date(1997,11,13));
        session.getTransaction().commit();
        session.close();
        System.out.println(author);*/


        //Question 4
        /*Author author = new Author();
        author.setFirstName("ritesh");
        author.setLastName("singh");
        author.setAge(21);
        author.setDob(new Date(96,11,13));

        Author author1 = new Author();
        author1.setFirstName("shivam");
        author1.setLastName("singh");
        author1.setAge(21);
        author1.setDob(new Date(96,11,13));

        Author author2 = new Author();
        author2.setFirstName("pankaj");
        author2.setLastName("singh");
        author2.setAge(21);
        author2.setDob(new Date(96,11,13));

        session.save(author);
        session.save(author2);
        session.save(author1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/


        //Question5
        /*Author author2 = new Author();
        author2.setFirstName("pankaj");
        author2.setLastName("singh");
        author2.setAge(21);
        author2.setDob(new Date(96,11,13));

        session.save(author2);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/


        //Question 15
        /*Author author = new Author();
        author.setFirstName("ritesh");
        author.setLastName("singh");
        author.setDob(new Date(97,12,13));
        author.setAge(21);

        Book book  =  new Book();
        book.setBookId(1);
        book.setBookName("Introduction to Algorithms");

        author.setBook(book);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/

        //Question 16 & 17
        Author author = new Author();
        author.setFirstName("ritesh");
        author.setLastName("singh");
        author.setDob(new Date(97,12,13));
        author.setAge(21);

        Author author1 = new Author();
        author1.setFirstName("rit");
        author1.setLastName("singh");
        author1.setDob(new Date(97,12,13));
        author1.setAge(21);

        Book book = new Book();
        book.setBookName("computer network");

        Book book1 = new Book();
        book1.setBookName("computer graphics");

        Collection<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);

        Collection<Author> authors = new HashSet<>();
        authors.add(author);
        authors.add(author1);

        book.setAuthors(authors);
        book1.setAuthors(authors);

        author.setBook(books);
        author1.setBook(books);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.save(book1);
        session.save(author);
        session.save(author1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
