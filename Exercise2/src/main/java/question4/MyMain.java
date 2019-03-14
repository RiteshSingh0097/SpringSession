package question4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("qus4.xml");
        DatabaseCon databaseCon = cxt.getBean("dummy", DatabaseCon.class);
        databaseCon.connect();

    }
}
