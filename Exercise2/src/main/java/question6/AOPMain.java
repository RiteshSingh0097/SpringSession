package question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AOPMain {

    public static void main(String[] args) throws IOException {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("qus6.xml");
        Database database = cxt.getBean(Database.class);

        database.connect();
    }
}
