package question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyNewMain {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus9.xml");
        Circle circle = apx.getBean(Circle.class);

        System.out.println(circle.getName());
    }
}
