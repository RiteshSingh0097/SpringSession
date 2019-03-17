package question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ORMEx {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus11.xml");
        UserDao user = apx.getBean(UserDao.class);
        user.userData();
    }
}
