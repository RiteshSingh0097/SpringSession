package question2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("qus2.xml");
        // Invoking start method
        cxt.start();
        Dummy dummy = cxt.getBean("dummy", Dummy.class);
        dummy.display();
        // Invoking stop method
        cxt.stop();
        // Invoking close method
        cxt.close();
    }
}
