package question12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus12.xml");
        UserDao2 userDao = apx.getBean(UserDao2.class);
        userDao.insertUserDao2();
    }
}
