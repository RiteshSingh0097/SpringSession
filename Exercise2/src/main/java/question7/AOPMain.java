package question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("qus7.xml");
        Student student = cxt.getBean(Student.class);

        student.details("pass");
    }
}
