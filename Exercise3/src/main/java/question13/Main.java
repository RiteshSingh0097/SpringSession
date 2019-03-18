package question13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus12.xml");
        Student student = apx.getBean(Student.class);
        student.getStudent();
        student.countStudent();
        student.countStudent2();
        student.countStudent3();
    }
}
