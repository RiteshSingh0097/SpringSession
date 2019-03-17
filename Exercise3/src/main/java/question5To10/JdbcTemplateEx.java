package question5To10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class JdbcTemplateEx {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus5To10.xml");
        UserDao userDao = apx.getBean(UserDao.class);

        //Question 5
        userDao.userCount();

        //Question 6
        System.out.println("Name : " + userDao.getUserName());

        //Question 7
        User user = new User();
        user.setUsername("deep");
        user.setName("Deep Singh");
        user.setPassword("deep693");
        user.setAge(19);
        user.setDob(new Date(99, 7, 2));

        userDao.insertUser(user);

        //Question 8
        userDao.getUserNameByAge();

        //Question 9
        userDao.getUserDetail();

        //Question 10
        User user1 = userDao.getUser();
        System.out.println(user1.getName());

    }
}
