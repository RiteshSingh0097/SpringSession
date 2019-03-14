package question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus8.xml");
        Employee employee = apx.getBean(Employee.class);

        System.out.println("Employee Id : "+employee.getEmpId());
        System.out.println("Employee Name : "+employee.getEmpName());
    }
}
