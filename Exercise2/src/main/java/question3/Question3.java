package question3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question3 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("qus3.xml");
        DatabaseCon databaseCon = cxt.getBean("databaseCon",DatabaseCon.class);
        databaseCon.connect();
    }
}
