package question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("qus5.xml");
        Circle circle = cxt.getBean(Circle.class);
        circle.print();
    }
}
