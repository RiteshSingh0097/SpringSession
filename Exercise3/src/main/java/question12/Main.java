package question12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("qus12.xml");
        RequiredDemo requiredDemo = apx.getBean(RequiredDemo.class);
        requiredDemo.insertUser();

        RequiresNewDemo requiresNewDemo = apx.getBean(RequiresNewDemo.class);
        requiresNewDemo.insertUser();

        Nest1 nest1 = apx.getBean(Nest1.class);
        nest1.insertUserDao();

        MandatoryDemo mandatoryDemo = apx.getBean(MandatoryDemo.class);
        mandatoryDemo.insertUserDao();

        NeverDemo neverDemo = apx.getBean(NeverDemo.class);
        neverDemo.insertUser();

        SupportDemo supportDemo = apx.getBean(SupportDemo.class);
        supportDemo.insertUserDao();

        NotSupportDemo notSupportDemo = apx.getBean(NotSupportDemo.class);
        notSupportDemo.insertUserDao();

    }
}
